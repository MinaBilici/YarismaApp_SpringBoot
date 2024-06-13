package com.minab.exception;


import lombok.Getter;


@Getter
public class YarismaAppException extends RuntimeException{
    private ErrorType errorType;

    public YarismaAppException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public YarismaAppException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
