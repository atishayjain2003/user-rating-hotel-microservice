package com.example.UserService.services;

import com.example.UserService.entitites.User;
import com.example.UserService.exceptions.ResourceNotFoundException;
import com.example.UserService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //to get all users
    //It will return a list of type user
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    // to find a user by a user id

    public User getUserById(String userId)
    {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not present in database"));
    }

    // to create a user
    //here user is the entity type, the model that is being used

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

}
