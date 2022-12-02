package com.example.carrental.common.exception;

public class NonExistingCarException extends RuntimeException{
    public NonExistingCarException(String message) {
        super(message);
    }
}
