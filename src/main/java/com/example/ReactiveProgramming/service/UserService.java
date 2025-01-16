package com.example.ReactiveProgramming.service;

import com.example.ReactiveProgramming.model.User1;
import com.example.ReactiveProgramming.repo.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;



@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        System.out.println("Success");
        this.userRepository = userRepository;
    }

    public Flux<User1> findAll() {
        List<User1> data = userRepository.findAll();
        return Flux.fromIterable(data);
    }

    public Optional<User1> findById(Long id) {
        return userRepository.findById(id);
    }

    public User1 save(User1 user) {
        return  userRepository.save(user);
    }

}

