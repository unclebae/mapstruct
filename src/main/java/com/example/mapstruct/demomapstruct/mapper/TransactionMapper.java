package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.transaction.Transaction;
import com.example.mapstruct.demomapstruct.entity.transaction.TransactionDTO;
import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Mapper
abstract class TransactionMapper {
    public TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal()
                .multiply(new BigDecimal("100")).longValue());
        return transactionDTO;
    }

    public abstract List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions);

}
