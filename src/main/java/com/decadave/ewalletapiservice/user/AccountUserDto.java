package com.decadave.ewalletapiservice.user;

import com.decadave.ewalletapiservice.shared.BaseClass;
import com.decadave.ewalletapiservice.shared.enums.Gender;
import com.decadave.ewalletapiservice.shared.TransactionLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountUserDto extends BaseClass {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private TransactionLevel transactionLevel;
}
