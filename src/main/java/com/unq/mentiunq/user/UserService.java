package com.unq.mentiunq.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component(value = "productService")
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User createUser(User login) {
        return userDAO.login(login);
    }

    public List<User> getUsers() {
        return userDAO.getAll();
    }
}