package com.example.demo.domain;

public class InvalidDummmyException extends RuntimeException {
   
	private static final long serialVersionUID = 8534415187684309725L;

	public InvalidDummmyException(String message) {
        super(message);
    }
}
