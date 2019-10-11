package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Message message;
        message = new Message("Welcome to Spook! " +
                "The online forum for girls and ghouls alike.",
                "10/23/20", "Pierz", null);
        repository.save(message);
    }
}
