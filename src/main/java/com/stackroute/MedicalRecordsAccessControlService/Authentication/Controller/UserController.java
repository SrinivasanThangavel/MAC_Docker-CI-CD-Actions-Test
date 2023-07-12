// create a class UserController which is a RestController and define the following methods
//registerUser() method which is used to register a user and it should return the ResponseEntity

package com.stackroute.MedicalRecordsAccessControlService.Authentication.Controller;

import com.stackroute.MedicalRecordsAccessControlService.Authentication.Model.User;
import com.stackroute.MedicalRecordsAccessControlService.Authentication.Repository.UserRepository;

import com.stackroute.MedicalRecordsAccessControlService.Authentication.exception.UserAlreadyExistsException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws UserAlreadyExistsException {
        userRepository.save(user);
        return new ResponseEntity<String>("User registered successfully", HttpStatus.CREATED);
    }


    // write a get method to display welcome message

    @GetMapping("/welcome")
    public ResponseEntity<?> welcomeUser() {
        return new ResponseEntity<String>("Welcome to Medical Records Access Control Service", HttpStatus.OK);
    }

    // write a get method to display all users

    @GetMapping("/users")   
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<Iterable<User>>(userRepository.findAll(), HttpStatus.OK);
    }
    
}



