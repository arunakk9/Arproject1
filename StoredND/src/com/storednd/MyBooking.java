package com.storednd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyBooking {


	  private WebDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();
	  @Test
	  public void testMyBookingSND() throws Exception {
	    driver.get(baseUrl + "/");
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("eulb86@gmail.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Delete@9");
	    driver.findElement(By.id("login")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Welcome Zebra")).click();
	    driver.findElement(By.linkText("Account Details")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("My Bookings")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.xpath("//div[@id='bookingsArea']/div/div[2]/div[3]/form/button")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Back")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Welcome Zebra")).click();
	  }



  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://stagesnd.inspire.technology:551/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }


  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}

