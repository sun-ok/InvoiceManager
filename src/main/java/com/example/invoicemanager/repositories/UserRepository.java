package com.example.invoicemanager.repositories;

import com.example.invoicemanager.models.User;

public interface UserRepository {

    User getUser(long id);

    User addOrUpdate(User user);
}
