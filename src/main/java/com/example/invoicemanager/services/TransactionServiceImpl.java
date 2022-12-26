package com.example.invoicemanager.services;

import com.example.invoicemanager.models.Transaction;
import com.example.invoicemanager.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.addOrUpdate(transaction);
    }

    public Transaction getTransaction(long id) {
        return transactionRepository.getTransaction(id);
    }
}
