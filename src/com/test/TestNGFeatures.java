package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
@Test
public void loginTest() {
	System.out.println("login test");
	int i= 9/0;
}
@Test(dependsOnMethods="loginTest")
public void homePageTest() {
	System.out.println("Home Page");
}
@Test(dependsOnMethods="loginTest")
public void searchPageTest() {
	System.out.println("Search Page");
}
@Test(dependsOnMethods="loginTest")
public void RegPageTest() {
	System.out.println("Registeratin Page");
}
}