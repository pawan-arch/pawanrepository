package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

//	setup sytem property fot chrome
//	Lunch chrome browser
//	login into App
//	Enter URL
//	OrangeHRM Title test
//	Logout from app
//	closeBrowser
//	DeleteAllCookies
	//pre-conditions annotation-- Start with Before
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite----setup sytem property fot chrome");
	}
	@BeforeTest()
	public void lunchBrowser() {
		System.out.println("@BeforeTest----Lunch chrome browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass-----login into App");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod-----Enter URL");	
	}
	//Test cases-- Start with @Test
	@Test
	public void orangeHRMTitleTest() {
		System.out.println("@Test-----OrangeHRM Title test");
	}
	@Test
	public void titleMatched() {
		System.out.println("@Test-----Title Matched");
	}
	//Post conditions Annotation-- Start with After
	@AfterMethod
		public void logOut() {
		System.out.println("@AfterMethod-----Logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass-----closeBrowser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest----DeleteAllCookies");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite----generateTestReport");
	}
}