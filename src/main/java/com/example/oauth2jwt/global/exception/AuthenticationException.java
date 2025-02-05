package com.example.oauth2jwt.global.error.exception;

import com.example.oauth2jwt.global.response.responseItem.ErrorCode;
import lombok.Getter;

@Getter
public class AuthenticationException extends CustomException {

    public AuthenticationException(ErrorCode errorCode) {
        super(errorCode);
    }

    public AuthenticationException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
