package com.tiendat.accounts.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
