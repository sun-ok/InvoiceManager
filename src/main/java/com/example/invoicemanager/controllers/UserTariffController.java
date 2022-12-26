package com.example.invoicemanager.controllers;

import com.example.invoicemanager.models.UserTariff;
import com.example.invoicemanager.services.UserTariffService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/userTariff")
@Validated
@AllArgsConstructor
public class UserTariffController {
    private final UserTariffService userTariffService;

    @GetMapping("/{id}")
    public UserTariff getUserTariff(Long id) {
        return userTariffService.getUserTariff(id);
    }

    @PostMapping
    public UserTariff createUserTariff(UserTariff userTariff) {
        return userTariffService.createUserTariff(userTariff);
    }
}
