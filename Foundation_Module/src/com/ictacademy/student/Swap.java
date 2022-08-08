package com.ictacademy.student;

public class Swap {
	int t;
	int swap(int x,int y)
	{
		System.out.println("The values before swap function is x= "+x +" & y= "+y);
		t=x;
		x=y;
		y=t;
	
		System.out.println("The values after swap function is x= "+x +" & y= "+y);
		return x;
	}
}
