package com.decadave.ewalletapiservice.user;

import com.decadave.ewalletapiservice.role.Role;
import com.decadave.ewalletapiservice.shared.BaseClass;
import com.decadave.ewalletapiservice.shared.enums.Gender;
import com.decadave.ewalletapiservice.shared.TransactionLevel;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_table")
public class AccountUser extends BaseClass {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private TransactionLevel transactionLevel;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

}
