package org.example.situationalcenter.service;


import org.example.situationalcenter.entity.User;
import org.example.situationalcenter.security.JwtUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByEmail(username);
        return JwtUserDetails.create(user);
    }

//    public UserDetails loadUserById(Integer id) throws Exception{
//        User user = userService.findById(id);
//        return JwtUserDetails.create(user);
//    }
}
