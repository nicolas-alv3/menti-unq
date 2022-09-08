package com.unq.mentiunq.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO {
    @Autowired
    UserRepository userRepository;
    public User login(User login) {
        return userRepository.save(login);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}