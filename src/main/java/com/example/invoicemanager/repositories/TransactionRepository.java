package com.example.invoicemanager.repositories;

import com.example.invoicemanager.models.Transaction;

public interface TransactionRepository {

    Transaction addOrUpdate(Transaction transaction);

    Transaction getTransaction(long id);

}
