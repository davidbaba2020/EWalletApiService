package com.decadave.ewalletapiservice.shared.exceptions;

import org.springframework.http.HttpStatus;

public interface WalletException {
    String getMessage ();

    HttpStatus getStatus();
}
