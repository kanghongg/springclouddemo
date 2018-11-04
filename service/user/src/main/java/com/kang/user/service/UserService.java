package com.kang.user.service;

import com.kang.user.domain.User;
import com.kang.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User get(Long id) {
        return userRepository.getOne(id);
    }

    public User save(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }
}
