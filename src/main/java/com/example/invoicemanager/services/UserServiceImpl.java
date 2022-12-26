package com.example.invoicemanager.services;

import com.example.invoicemanager.models.User;
import com.example.invoicemanager.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.addOrUpdate(user);
    }

    public User getUser(long id) {
        return userRepository.getUser(id);
    }

    public boolean IsUserBanned(User user) {
        //create query
        return false;
    }

}
