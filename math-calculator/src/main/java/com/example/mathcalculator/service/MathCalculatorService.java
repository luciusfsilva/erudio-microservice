package com.example.mathcalculator.service;

import org.springframework.stereotype.Service;

import com.example.mathcalculator.Utils.ClassUtils;

@Service
public class MathCalculatorService {
	
	public Double sum(String numberOne, String numberTwo) {
		return ClassUtils.convertToDouble(numberOne) + ClassUtils.convertToDouble(numberTwo);
	}
	
	public Double subt(String numberOne, String numberTwo) {
		return ClassUtils.convertToDouble(numberOne) - ClassUtils.convertToDouble(numberTwo);
	}
	
	public Double multi(String numberOne, String numberTwo) {
		return ClassUtils.convertToDouble(numberOne) * ClassUtils.convertToDouble(numberTwo);
	}
	
	public Double div(String numberOne, String numberTwo) {
		return ClassUtils.convertToDouble(numberOne) / ClassUtils.convertToDouble(numberTwo);
	}
	
	public Double media(String numberOne, String numberTwo) {
		return (ClassUtils.convertToDouble(numberOne) + ClassUtils.convertToDouble(numberTwo)) / 2;
	}
	
	public Double sqrt(String numberOne) {
		return Math.sqrt(ClassUtils.convertToDouble(numberOne));
	}

}
