package com.el.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.el.calculator.models.Calculator;

@Controller
@RequestMapping("/")
public class CalculatorController {
	private Calculator calc;
	private ArrayList<String> history = new ArrayList<String>();
	
	public CalculatorController() {
		calc = new Calculator();
    }
	
	@GetMapping("")
	public String showBase() {
		return "/calculator";
	}
	
    @PostMapping("")
    public ModelAndView doCalculation(double firstNumber, double secondNumber, String operation) {
    	double result = calc.doCalculation(firstNumber, secondNumber, operation);
    	
    	history.add(0, firstNumber + " " + operation + " " + secondNumber + " = " + result);
        ModelAndView mv = new ModelAndView("/calculator");
        
        mv.addObject("finalResult", result);
        mv.addObject("history", history);
        return mv;
    }

}
