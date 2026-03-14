package com.Coral.JavaSpring.config;

import com.Coral.JavaSpring.Repositories.CategoryRepositorty;
import com.Coral.JavaSpring.Repositories.OrderRepository;
import com.Coral.JavaSpring.Repositories.UserRepository;
import com.Coral.JavaSpring.entities.Order;
import com.Coral.JavaSpring.entities.User;
import com.Coral.JavaSpring.entities.Category;
import com.Coral.JavaSpring.entities.enums.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepositorty categoryRepositorty;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria", "Maria@gmail.com", "988888888", "123456");
        User u2 = new User(null,"Alex", "Alex@gmail.com", "988888887", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(java.util.Arrays.asList(u1,u2));
        orderRepository.saveAll(java.util.Arrays.asList(o1,o2,o3));
        categoryRepositorty.saveAll(java.util.Arrays.asList(cat1,cat2,cat3));
    }



}
