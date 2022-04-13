package com.training.firstapi.service;

import com.training.firstapi.model.User;
import com.training.firstapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getUsers(){
        return  repository.findAll();
    };

    public User postUser(User user) {
        return repository.save(user);
    }
}
