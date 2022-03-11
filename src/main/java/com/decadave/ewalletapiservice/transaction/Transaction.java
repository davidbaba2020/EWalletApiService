package com.decadave.ewalletapiservice.transaction;

import com.decadave.ewalletapiservice.shared.BaseClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_table")
public class Transaction extends BaseClass {
    private Long walletId;
    private Long userId;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;
    private BigDecimal transactionAmount;
}
