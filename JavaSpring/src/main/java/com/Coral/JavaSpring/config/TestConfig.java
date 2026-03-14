package com.Coral.JavaSpring.config;

import com.Coral.JavaSpring.Repositories.UserRepository;
import com.Coral.JavaSpring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria", "Maria@gmail.com", "988888888", "123456");
        User u2 = new User(null,"Alex", "Alex@gmail.com", "988888887", "123456");

        userRepository.saveAll(java.util.Arrays.asList(u1,u2));
    }
}
