package com.example.invoicemanager.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {

    private Long id;

    private String name;

    private String cardNumber;

    //don`t store if user is banned as this can be deduced from the number of unsuccessful transactions connected with this user
}
