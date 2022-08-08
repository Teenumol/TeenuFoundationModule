package com.ictacademy.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainFuncTest {
	SimpleInterest testobj=new SimpleInterest();
	CompInterest testobj1=new CompInterest();
	Perimeter testobj2=new Perimeter();
	Swap testobj3=new Swap();
	
	@Test
	void test1()
	{
		int si=testobj.interest(10000,10,2);
		assertEquals(2000,si);
	}
	@Test
	void Test2()
	{
		double ci=testobj1.compoundinterest(10000,10,5);
		assertEquals(16105,ci);
	}
	
	@Test
	void Test3()
	{
		int pe=testobj2.perimeter(4,6);
		assertEquals(20,pe);
	}
	@Test
	void Test4()
	{
		int sw=testobj3.swap(4,6);
		assertEquals(6,sw);
	}
	/*
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
