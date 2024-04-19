package org.example.situationalcenter.service;

import org.example.situationalcenter.entity.User;
import org.example.situationalcenter.repository.UserRepository;

public class UserServiceImpl implements UserService{



   private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public String  getEmailById(Long id) {
        return userRepository.getEmailById(id);
    }

}
