package com.storednd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TransactionHistory {
	private WebDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Test
	  public void testUntitled() throws Exception {
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
	    driver.findElement(By.linkText("Transaction History")).click();
	    assertEquals(driver.getTitle(), "StoredNextDoor");
	    new Select(driver.findElement(By.name("transcationhistory_length"))).selectByVisibleText("50");
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.xpath("//table[@id='transcationhistory']/thead/tr/th[3]")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.xpath("//table[@id='transcationhistory']/thead/tr/th[4]")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.snd-table-padd.sorting_asc")).click();
	    driver.findElement(By.xpath("//table[@id='transcationhistory']/thead/tr/th[5]")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("th.sorting_desc")).click();
	    driver.findElement(By.cssSelector("th.sorting_asc")).click();
	    driver.findElement(By.cssSelector("input.form-control.input-sm")).clear();
	    driver.findElement(By.cssSelector("input.form-control.input-sm")).sendKeys("webner");
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


