package com.example.invoicemanager.services;

import com.example.invoicemanager.models.UserTariff;
import com.example.invoicemanager.repositories.UserTariffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserTariffServiceImpl implements UserTariffService {

    private final UserTariffRepository userTariffRepository;

    public UserTariff createUserTariff(UserTariff userTariff) {
        return userTariffRepository.addOrUpdate(userTariff);
    }

    public UserTariff getUserTariff(Long id) {
        return userTariffRepository.getUserTariff(id);
    }

    //...
}
