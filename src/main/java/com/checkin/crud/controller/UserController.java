package com.checkin.crud.controller;

import com.checkin.crud.domain.User;
import com.checkin.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<User> getAllUsers(){
        return userService.listAllUsers();
    }
}
