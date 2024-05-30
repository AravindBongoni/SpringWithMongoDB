package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.domain.User;
import com.example.repository.UserRepository;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.example.config.MongoConfig.class);
        UserRepository userRepository = context.getBean(UserRepository.class);

        User user = new User();
        user.setName("Naresh");
        user.setEmail("nareshnakka118.com");

        userRepository.save(user);

        //userRepository.findAll().forEach(System.out::println);
    }
}

