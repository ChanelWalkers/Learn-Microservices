package com.tiendat.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(
        name = "Account",
        description = "Schema to hold  Account information"
)
public class AccountDTO {
    @Schema(
            name = "Account number of Eazy Bank account"
    )
    private Long accountNumber;

    @Schema(
            name = "Account type of Eazy Bank account", example = "Savings"
    )
    private String accountType;


    @Schema(
            name = "Eazy Bank branch address"
    )
    private String branchAddress;
}
