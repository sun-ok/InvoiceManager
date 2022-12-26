package com.example.invoicemanager.services;

import com.example.invoicemanager.models.Transaction;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);

    Transaction getTransaction(long id);

    //other useful methods
}
