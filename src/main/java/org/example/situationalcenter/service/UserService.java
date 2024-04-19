package org.example.situationalcenter.service;

import org.example.situationalcenter.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findByEmail(String email);
    String getEmailById(Long id);

}
