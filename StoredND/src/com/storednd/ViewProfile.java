package com.storednd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ViewProfile {

	private WebDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Test
	  public void testSigninViewprofileSND() throws Exception {
	    driver.get(baseUrl + "/");
	    /*assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("eulb86@gmail.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Delete@9");
	    driver.findElement(By.id("login")).click();    */
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Welcome Zebra")).click();
	    driver.findElement(By.linkText("Account Details")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.xpath("//div[2]/div/a/button")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.name("MobileNumber")).clear();
	    driver.findElement(By.name("MobileNumber")).sendKeys("69464598675");
	    driver.findElement(By.name("SecEmail")).clear();
	    driver.findElement(By.name("SecEmail")).sendKeys("victor@gmail.com");
	    driver.findElement(By.name("Address")).clear();
	    driver.findElement(By.name("Address")).sendKeys("566 bloor street");
	    new Select(driver.findElement(By.id("province"))).selectByVisibleText("Nova Scotia");
	    driver.findElement(By.name("City")).clear();
	    driver.findElement(By.name("City")).sendKeys("columbia");
	    driver.findElement(By.name("Occupation")).clear();
	    driver.findElement(By.name("Occupation")).sendKeys("Software tester");
	    driver.findElement(By.name("About")).clear();
	    driver.findElement(By.name("About")).sendKeys("tell the lummy yummy the rummy");
	    driver.findElement(By.name("Hobbies")).clear();
	    driver.findElement(By.name("Hobbies")).sendKeys("indoor games, tennis, swimming");
	    driver.findElement(By.cssSelector("input[name=\"Save Details\"]")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
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





