package in.goair;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookNow {

   public static void main(String[] args) throws InterruptedException
   {
       // TODO Auto-generated method stub

       WebDriver driver = new FirefoxDriver();
       Actions a = new Actions(driver);
       
       driver.get("https://www.goair.in/");
        driver.manage().window().maximize();
       
       //driver.findElement(By.xpath(".//*[@id='togglechange']/ul/li[1]/a")).click();
       //driver.findElement(By.xpath(".//*[@id='togglechange']/ul/li[1]/ul/li[1]/a")).click();
       
       // Oneway Trip
       driver.findElement(By.xpath(".//*[@id='owt']")).click();
       //origin
       driver.findElement(By.xpath(".//*[@id='txtTags0']")).click();
       driver.findElement(By.xpath(".//*[@id='ui-id-5']/li[2]")).click();
       //Destination 
       driver.findElement(By.xpath(".//*[@id='ui-id-2']/li[3]")).click();
       //Date picker
       driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[4]/a")).click();
       // Student Booking
       driver.findElement(By.xpath(".//*[@id='bookflights']/div/div[2]/div[2]/div/div[1]/div/div[1]/div/label")).click();
       // Book Now Button
       driver.findElement(By.xpath(".//*[@id='bookflights']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button")).click();
       Thread.sleep(2000);
       
       
   // Continue button in Inbound or outbound page.
       driver.findElement(By.cssSelector("#submit_search_button")).click();
       //Thread.sleep(2000);
           
       // Passenger Information
           
           driver.findElement(By.xpath(".//*[@id='goAirPassengers_0__Name_Title']")).click();
       //JavascriptExecutor jse = (JavascriptExecutor) driver;    // for scrolling bar to up and down.
       //jse.executeScript("window.scrollby(0,100,0)", "");
       
                    //title select
       
                          Select Title = new Select(driver.findElement(By.id("goAirPassengers_0__Name_Title")));
                           Title.selectByIndex(3);
                           Thread.sleep(2000);
                   // First Name 
                           driver.findElement(By.xpath(".//*[@id='goAirPassengers_0__Name_First']")).sendKeys("Kishore");
                           Thread.sleep(2000);
                  // Last Name
                           driver.findElement(By.xpath(".//*[@id='goAirPassengers_0__Name_Last']")).sendKeys("V");
                           Thread.sleep(2000);
                  // Gender 
                     //driver.findElement(By.xpath(".//*[@id='goAirPassengers_0__Info_Gender']")).click();      
                           Select Gender = new Select(driver.findElement(By.xpath(".//*[@id='goAirPassengers_0__Info_Gender']")));
                                Gender.selectByValue("1");
                   //Nationality 
                              Select Nationality = new Select(driver.findElement(By.id("nationality_0")));
                              Nationality.selectByValue("IN");
                              Thread.sleep(2000);
                    
                   // DOB- Day of Birth 
                              Select Day = new Select(driver.findElement(By.id("date_of_birth_day_0")));
                              Day.selectByValue("29");
                              Thread.sleep(2000);
                         
                               Select Month = new Select(driver.findElement(By.id("date_of_birth_month_0")));
                               Month.selectByVisibleText("April");
                               Thread.sleep(2000);
                               
                               Select Year = new Select(driver.findElement(By.id("date_of_birth_year_0")));
                               Year.selectByValue("2001");
                               Thread.sleep(2000);
                               
                      // require a wheel chair
                              driver.findElement(By.xpath(".//*[@id='passengerForm']/div[2]/div/div[1]/label/span[4]")).click();

                                
                  // Contact Information
                                driver.findElement(By.xpath(".//*[@id='passengerForm']/div[3]/div[1]/label/span[4]")).click();
                                
                                // Mobile Number
                                driver.findElement(By.id("goAirContact_MobileISDNumber")).sendKeys("01191"); //ISD code
                                driver.findElement(By.id("goAirContact_MobileNumber")).sendKeys("9182017345"); // Number
                                //Email Address
                                driver.findElement(By.id("goAirContact_EmailAddress")).sendKeys("Kishorev@gmail.com");
                                
                                // Emergency number
                                driver.findElement(By.id("goAirContact_EmergencyContactISDNumber")).sendKeys("011"); //isd code
                                driver.findElement(By.id("goAirContact_EmergencyContactAreaNumber")).sendKeys("91"); // Area code
                                driver.findElement(By.id("goAirContact_EmergencyNumber")).sendKeys("9182017475");    // Number
                              Thread.sleep(3000);
                              JavascriptExecutor jse14 = (JavascriptExecutor)driver;
                              jse14.executeScript("window.scrollBy(0,250)", "");
                                //continue button
                         driver.findElement(By.id("submit_search_button")).click();
                               
                        // WebElement element = driver.findElement(By.id("submit_search_button"));
                            //action.moveToElement(element).click().build().perform();     
                                
                                //passenger extras
                        driver.findElement(By.xpath(".//*[@id='sectionBody']/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[3]/button")).click();
                                //view seats 
                      // driver.findElement(By.id("sectionBody")).click();
                        driver.findElement(By.xpath(".//*[@id='sectionBody']/div[1]/div[2]/div/div[1]/div/div[3]/a/span")).click();
                        Thread.sleep(5000);
                                 // select seat 
                      //  driver.findElement(By.xpath(".//*[@id='20171018 G8 327 BOMDEL']/div[2]/div[2]/div/div[171]/div")).click();
                       // Thread.sleep(2000);
                             
                      // continue button
                             driver.findElement(By.xpath(".//*[@id='saveSelectedSeats']")).click();
                                 // No insurance
                         driver.findElement(By.xpath(".//*[@id='insuranceNo']/span[2]")).click();
                               
                         Thread.sleep(3000);   
                         JavascriptExecutor jse15 = (JavascriptExecutor)driver;
                         jse15.executeScript("window.scrollBy(0,250)", "");
                            driver.findElement(By.id("submit_search_button")).click();
                                
                             
                             //pop up window of gst
                           driver.findElement(By.xpath(".//*[@id='gstDismissBtn']")).click();
                             
                              
                        // card type :
                           
                           driver.findElement(By.id("payment_card_type")).click();

                           Select cardtype = new Select(driver.findElement(By.id("payment_card_type")));
                             cardtype.selectByValue("V1");

                          // card number
                           
                            driver.findElement(By.xpath(".//*[@id='AccountNumber_v1_0']")).sendKeys("5123456789012346");

                          //exp month
                            // Select expmon = new Select(driver.findElement(By.id("goAirExternalPayment_expMonth")));
                             //   expmon.selectByValue("May");
                            a.sendKeys(Keys.TAB).build().perform();
                            Thread.sleep(3000); 
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(3000);
                          // expyr
                            // Select expyr = new Select(driver.findElement(By.id("goAirExternalPayment_expYear")));
                             // expyr.selectByValue("2019");
                            
                            a.sendKeys(Keys.TAB).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.DOWN).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys(Keys.TAB).build().perform();
                            Thread.sleep(2000);
                            a.sendKeys("123").build().perform();
                            Thread.sleep(2000);
                           
                          // security code 
//                           Select secode = new Select(driver.findElement(By.id("goAirExternalPayment_PaymentFields_0__FieldValue")));
//                               secode.selectByValue("123");
                               Thread.sleep(3000);   
//                             
//                               if(driver.findElement(By.xpath(".//*[@id='inlineDccContainer_v1_0']/div/h4")).isDisplayed())
//                               {
//                                   driver.findElement(By.xpath(".//*[@id='inlineDccContainer_v1_0']/div/div[3]/div/label/span[4]")).click(); 
//                               }
                               Thread.sleep(4000);
                               driver.findElement(By.cssSelector(".mdl-checkbox__ripple-container.mdl-js-ripple-effect.mdl-ripple--center")).click();
                               // persist of confirm pay
                          // driver.findElement(By.xpath(".//*[@id='sectionBody']/div[1]/div[2]/div/div[2]/div/div[7]/div[1]/label/span[4]")).click();

                          //pay button
                          // driver.findElement(By.xpath(".//*[@id='sectionBody']/div[1]/div[2]/div/div[2]/div/div[7]/div[1]/label/span[4]")).click();
     
                                           
                           //WebElement element = driver.findElement(By.linkText("Product Category"));

                           //Actions action = new Actions(driver);---->This line add once.no need to write every time.

                           //action.moveToElement(element).click().build().perform();       
		                         
   }
   }	                         
		                    
		  

