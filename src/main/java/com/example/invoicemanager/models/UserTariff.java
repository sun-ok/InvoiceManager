package com.example.invoicemanager.models;

import lombok.*;

import java.util.Date;

/**
 * A template for user`s transactions
 * Stores the creator of operation, tariff, some additional info about the payment(frequency, automation type etc.)
 * */

@AllArgsConstructor
@Getter
@Setter
public class UserTariff {

    private Long id;

    private User user;

    private Tariff tariff;

    private PaymentFrequency paymentFrequency;

    private PaymentAutomationType paymentType;

    //to calculate when transaction has to be done
    private Date creationDate;

    enum PaymentFrequency{
        MONTHLY, ANNUALLY
    }

    enum PaymentAutomationType {
        //enum not bool as some other modes may be added(e.g. semi-automated)
        AUTOMATIC, MANUAL
    }
}
