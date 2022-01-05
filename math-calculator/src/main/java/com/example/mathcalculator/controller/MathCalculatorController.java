package com.example.mathcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mathcalculator.Utils.ClassUtils;
import com.example.mathcalculator.exception.UnsuportedMathOperationException;
import com.example.mathcalculator.service.MathCalculatorService;

@RestController
@RequestMapping("api/calculator")
public class MathCalculatorController {
	
	@Autowired
	private MathCalculatorService service;
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ClassUtils.isNumeric(numberOne) || !ClassUtils.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.sum(numberOne, numberTwo);
		
	}
	
	@GetMapping("/subt/{numberOne}/{numberTwo}")
	public Double subt(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ClassUtils.isNumeric(numberOne) || !ClassUtils.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.subt(numberOne, numberTwo);
	}
	
	@GetMapping("/multi/{numberOne}/{numberTwo}")
	public Double multi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ClassUtils.isNumeric(numberOne) || !ClassUtils.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.multi(numberOne, numberTwo);
	}
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ClassUtils.isNumeric(numberOne) || !ClassUtils.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.div(numberOne, numberTwo);
	}
	
	@GetMapping("/media/{numberOne}/{numberTwo}")
	public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ClassUtils.isNumeric(numberOne) || !ClassUtils.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.media(numberOne, numberTwo);
	}
	
	@GetMapping("/sqrt/{numberOne}")
	public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!ClassUtils.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("please set a numeric value!");
		}
		return service.sqrt(numberOne);
		
	}

	

}
