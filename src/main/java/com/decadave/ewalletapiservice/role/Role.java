package com.decadave.ewalletapiservice.role;

import com.decadave.ewalletapiservice.shared.BaseClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role extends BaseClass {
    private String name;
}
