package com.Coral.JavaSpring.config;

import com.Coral.JavaSpring.Repositories.CategoryRepository;
import com.Coral.JavaSpring.Repositories.OrderRepository;
import com.Coral.JavaSpring.Repositories.ProductRepository;
import com.Coral.JavaSpring.Repositories.UserRepository;
import com.Coral.JavaSpring.entities.Order;
import com.Coral.JavaSpring.entities.Product;
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
    private CategoryRepository categoryRepositorty;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

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
        productRepository.saveAll(java.util.Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(java.util.Arrays.asList(p1,p2,p3,p4,p5));
    }


}
