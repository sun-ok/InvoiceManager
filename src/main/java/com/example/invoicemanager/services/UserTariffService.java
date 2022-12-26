package com.example.invoicemanager.services;

import com.example.invoicemanager.models.UserTariff;

public interface UserTariffService {

    UserTariff createUserTariff(UserTariff userTariff);
    UserTariff getUserTariff(Long id);

    //... get all tariffs of user, get all manual/automatic tariffs
}
