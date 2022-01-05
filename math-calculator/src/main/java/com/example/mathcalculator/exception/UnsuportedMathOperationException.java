package com.example.mathcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnsuportedMathOperationException(String message) {
		super(message);
	}

}
