package com.ictacademy.student;

public class CompInterest {
	
	double i;
	
	double compoundinterest(double p,double r, double t)
	{
			i=p*(Math.pow((1+r/100), t));
			return i;
	}
}
