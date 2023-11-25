package com.example.task.initializer;
import com.example.task.model.Message;
import com.example.task.repository.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MessageRepository messageRepository;

    public DataInitializer(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void run(String... args) {
        // Initialize some sample data
        List<Message> messages = Arrays.asList(
                new Message("Hello, world!", LocalDateTime.now()),
                new Message("Spring Boot is awesome!", LocalDateTime.now())
        );

        messageRepository.saveAll(messages);
    }
}
