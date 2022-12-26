package com.example.invoicemanager.controllers;

import com.example.invoicemanager.models.Transaction;
import com.example.invoicemanager.services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/transactions")
@Validated
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}
