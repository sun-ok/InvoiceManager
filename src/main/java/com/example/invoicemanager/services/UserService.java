package com.example.invoicemanager.services;

import com.example.invoicemanager.models.User;

public interface UserService {

    User createUser(User user);

    User getUser(long id);

    boolean IsUserBanned(User user);

}
