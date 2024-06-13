package com.minab.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;



@Getter
@AllArgsConstructor
public enum ErrorType {

    USERNAME_OR_PASSWORD_WRONG(5002,
            "Kullanıcı adı veya parola yanlış.",
            HttpStatus.I_AM_A_TEAPOT),
    USERNAME_ALREADY_TAKEN(2000,
            "Bu kullanıcı adı zaten alınmış.Lütfen başkabir username giriniz.",
            HttpStatus.BAD_REQUEST),
    BAD_REQUEST_ERROR(1001,
            "Girilen parametreler hatalıdır. Lütfen düzeltiniz.",
            HttpStatus.BAD_REQUEST);
    private Integer code;
    private String message;
    private HttpStatus httpStatus;

}