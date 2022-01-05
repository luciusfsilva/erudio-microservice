package com.example.mathcalculator.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter
	private LocalDateTime timeStamp;
	@Getter
	private String message;
	@Getter
	private String details;
	
	public ExceptionResponse(LocalDateTime timeStamp, String message, String details) {
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
	

}
