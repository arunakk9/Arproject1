package com.storednd;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class signup {

	  private WebDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();


  @Test
  public void f() throws Exception {
	    driver.get(baseUrl + "/");
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    driver.findElement(By.linkText("Sign Up")).click();
	    driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("blue");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("k");
	    driver.findElement(By.id("pno")).clear();
	    driver.findElement(By.id("pno")).sendKeys("9182018765");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("eulb86@gmail.com");
	    driver.findElement(By.id("create_password")).clear();
	    driver.findElement(By.id("create_password")).sendKeys("Delete@9");
	    driver.findElement(By.id("confirm_password")).clear();
	    driver.findElement(By.id("confirm_password")).sendKeys("Delete@9");
	    driver.findElement(By.cssSelector("div.snd-signup-checkbox-chek > input.form-control")).click();
	    driver.findElement(By.id("rentersignup")).click();
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
  }}

