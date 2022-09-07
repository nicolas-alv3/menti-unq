package com.unq.mentiunq.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component(value = "productService")
@Service
public class LoginService {
    @Autowired
    private LoginDAO loginDAO;

    public Login login(Login login) {
        return loginDAO.login(login);
    }

    public List<Login> getLogins() {
        return loginDAO.getAll();
    }
}