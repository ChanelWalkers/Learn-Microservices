package com.tiendat.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseDTO {
    private String statusCode;
    private String statusMsg;
}
