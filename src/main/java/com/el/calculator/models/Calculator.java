package com.el.calculator.models;

import java.util.ArrayList;

public class Calculator {
	public double doCalculation(double a, double b, String s) {
		
		ArrayList<String> operations = new ArrayList<String>();
		
		if(s.equals("+")) {
			return a + b;
		}
		else if(s.equals("-")) {
			return a - b;
		}
		else if(s.equals("/")) {
			return a / b;
		}
		else if(s.equals("*")) {
			return a * b;
		}
		else if(s.equals("^")){
			return (double) Math.pow(a, b);
		}
		else if(s.equals("nth-root")) {
			return Math.pow(a, 1/b);
		}
		else if(s.equals("log")) {
			return Math.log(a)/Math.log(b);
		}
		else if(s.equals("sin")) {
			return Math.sin(a);
		}
		else if(s.equals("cos")) {
			return Math.cos(a);
		}
		else if(s.equals("tan")) {
			return Math.tan(a);
		}
		else if(s.equals("sinh")) {
			return Math.sinh(a);
		}
		else if(s.equals("cosh")) {
			return Math.cosh(a);
		}
		else if(s.equals("tanh")) {
			return Math.tanh(a);
		}
		
		
		
		return (Double) null;
	}

}
