package com.Coral.JavaSpring.Services;

import com.Coral.JavaSpring.Repositories.UserRepository;
import com.Coral.JavaSpring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
       Optional<User> obj = userRepository.findById(id);
       return obj.get();
    }
}
