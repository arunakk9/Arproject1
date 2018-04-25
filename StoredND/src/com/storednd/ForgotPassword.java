package com.storednd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ForgotPassword {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void f() throws Exception {
	    driver.get(baseUrl + "/");
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.cssSelector("strong")).click();
	    driver.findElement(By.id("emailforget")).clear();
	    driver.findElement(By.id("emailforget")).sendKeys("eulb86@gmail.com");
	    driver.findElement(By.id("forget")).click();
	  }

  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://stagesnd.inspire.technology:551";
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
