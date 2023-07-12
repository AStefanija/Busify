package com.busify.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum BusifyError {
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST);

    private final HttpStatus httpStatus;
}
