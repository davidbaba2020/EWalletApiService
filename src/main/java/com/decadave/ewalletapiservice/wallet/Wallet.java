package com.decadave.ewalletapiservice.wallet;

import com.decadave.ewalletapiservice.account.Account;
import com.decadave.ewalletapiservice.shared.BaseClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "wallet_table")
public class Wallet extends BaseClass {
    private Long accountId;
    private String walletAccountNumber;
    private BigDecimal walletBalance;
}
