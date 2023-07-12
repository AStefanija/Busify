package com.busify.exception;

import lombok.Getter;

@Getter
public class BusifyAppException extends RuntimeException{

    private final BusifyError error;

    public BusifyAppException(String message, BusifyError error) {
        super(message);
        this.error = error;
    }
}
