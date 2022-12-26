package com.example.invoicemanager.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Transaction {

    private Long id;

    private UserTariff userTariff;

    private Date date;

    private boolean bIsSuccessful;
}
