package com.testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CalculatorPage;

public class CalTest {
	WebDriver driver;
CalculatorPage calpage;
	@BeforeTest
	public void setUp() {
		calpage = new CalculatorPage();
	}
	
	@Test(priority = 1)
	public void sumTest() {
		String result = calpage.doSum("10", "20");
		Assert.assertEquals(result, "30");
	}
	
	@Test(priority = 2)
	public void subTest() {
		String result = calpage.doSub("100", "20");
		Assert.assertEquals(result, "80");
	}
	
	@Test(priority = 3)
	public void divTest() {
		String result = calpage.doDiv("100", "20");
		Assert.assertEquals(result, "5");
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
