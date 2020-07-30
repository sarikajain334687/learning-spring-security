package com.ttalks.tls.learningspringsecurity;

import com.ttalks.tls.learningspringsecurity.entity.User;
import com.ttalks.tls.learningspringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringSecurityApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("admin","$2a$10$zxvEq8XzYEYtNjbkRsJEbukHeRx3XS6MDXHMu8cNuNsRfZJWwswDy","ROLE_ADMIN",true);
        User user1 = new User("testuser","$2a$10$XptfskLsT1l/bRTLRiiCgejHqOpgXFreUnNUa35gJdCr2v2QbVFzu","ROLE_USER",true);

        userRepository.save(user);
        userRepository.save(user1);
    }



}
