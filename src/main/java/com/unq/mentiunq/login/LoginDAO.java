package com.unq.mentiunq.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginDAO {
    @Autowired
    LoginRepository loginRepository;
    public Login login(Login login) {
        return loginRepository.save(login);
    }

    public List<Login> getAll() {
        return loginRepository.findAll();
    }
}