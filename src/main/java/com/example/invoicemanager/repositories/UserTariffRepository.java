package com.example.invoicemanager.repositories;

import com.example.invoicemanager.models.UserTariff;

public interface UserTariffRepository {

    UserTariff getUserTariff(long id);

    UserTariff addOrUpdate(UserTariff user);
}
