package Blogging_Application.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Blogging_Application.Repositories.UserRepository;
import Blogging_Application.entities.User;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User createUser(User user){
        return repo.save(user);
    }

    public List<User> getAllUsers(){
        return repo.findAll();
    }
}


