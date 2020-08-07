package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
@Test(invocationCount=10)
public void Sum() {
	int a=10;
	int b=20;
	int c= a+b;
	System.out.println("Sum of C=="+ c);
}
}
