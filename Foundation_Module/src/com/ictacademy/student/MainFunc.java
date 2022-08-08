package com.ictacademy.student;

public class MainFunc {

	public static void main(String[] args) {
		
		SimpleInterest si=new SimpleInterest();
		int t=si.interest(10000,10,2);
		System.out.println("The Simple Interest for amount=10000,rate=10 & year=2 is " +t);
		
		CompInterest ci=new CompInterest();
		double s=ci.compoundinterest(45000, 10, 2);
		System.out.println("The Compound Interest is " +s);
		
		Perimeter pe=new Perimeter();
		int p=pe.perimeter(4,6);
		System.out.println("The perimeter of the recatangle of length 4 and breadth 6 is  "+p);
		
		Swap sw=new Swap();
		int x=sw.swap(4,5);
		

	}

	

}
