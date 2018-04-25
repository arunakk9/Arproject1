package com.storednd;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FindallLinks {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
   WebDriver driver = new ChromeDriver();
   
  driver.get("https://contourshaveclub.com/");
  List<WebElement> links = driver.findElements(By.tagName("a"));
  System.out.println(links.size());
  
  for(int i=1;i<=links.size(); i=i+1)
  {
	  System.out.println(links.get(i).getText());
	  
  }
	  
	  
  
   
	}

}