package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.Message;
import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class MessageController {

    @Autowired
    private final UserRepository userRepository;


@GetMapping("/hello")
public Message getMsg(){
    return new Message("Hi there!!");
}
@GetMapping("/")
public Iterable<User> getAllUsers(){
    return userRepository.findAll();
}

@GetMapping("/{id}")
public User getUser(@PathVariable long id){
    return userRepository.findById(id).orElse(null);
}
}
