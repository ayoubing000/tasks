package com.example.task.controller;

import com.example.task.model.Message;
import com.example.task.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageService messageService ;

    @GetMapping("/messages")
    public List<Message> getAllMessage(){return messageService.getAllMessage();}
}
