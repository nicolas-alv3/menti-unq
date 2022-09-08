package com.unq.mentiunq.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin
@RestController
@Component(value = "LoginController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public ResponseEntity<User> login(@RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public ResponseEntity<List<User>> getLogin() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

}