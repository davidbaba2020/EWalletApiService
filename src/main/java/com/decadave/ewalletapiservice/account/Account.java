package com.decadave.ewalletapiservice.account;

import com.decadave.ewalletapiservice.shared.BaseClass;
import com.decadave.ewalletapiservice.wallet.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts_table")
public class Account extends BaseClass {
    private String accountName;
    private Long accountHolderId;
    @ManyToOne
    private Wallet wallet;
}
