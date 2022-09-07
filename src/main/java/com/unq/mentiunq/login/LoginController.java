package com.unq.mentiunq.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Component(value = "LoginController")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ResponseEntity login(@RequestBody Login login) {
        return new ResponseEntity<>(loginService.login(login), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ResponseEntity getLogin() {
        return new ResponseEntity<>(loginService.getLogins(), HttpStatus.OK);
    }

}