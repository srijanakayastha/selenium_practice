/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumwebdriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

/**
 *
 * @author srijana
 */
public class SeleniumWebdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //System.setProperty("webdriver.gecko.driver", "/Users/srijana/Downloads/selenium-java-3.0.1/geckodriver");
        // geko driver is used for selenium 3.to generate o/p in browser. In selenium 2 we don't need
       WebDriver driver = new FirefoxDriver();// initialise the firefox, opens the browser //
        //String baseURL = "http://en.dawanda.com/";
       // driver.get("http://en.dawanda.com/");// this get method helps to open any browser //it brings website to us 
       //driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
       driver.get("https://www.google.de/");
        /*
        
        
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(".//*[@id='shared_header_user_nav']/a"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath(".//*[@id='shared_header_user_dropdown']/ul/li[2]/a"))).click().build().perform();
        
         //driver.findElement(By.xpath(".//*[@id='shared_header_user_nav']/a/div[2]")).click();// to click on login 
        
         
         /*
         try {
            Thread.sleep(3000);
            driver.findElement(By.xpath(".//*[@id='login_form_container']/p/a")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("frontend-test-user");
            driver.findElement(By.xpath(".//*[@id='firstname']")).click();
            driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("1032090980");
            driver.findElement(By.xpath(".//*[@id='lastname']")).click();
            driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("frontend-test-user-110120172021");
            driver.findElement(By.xpath(".//*[@id='username']")).click();
            driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("frontend-tests-110120172021@dawandamail.com");
            driver.findElement(By.xpath(".//*[@id='email']")).click();
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("110120172021");
            driver.findElement(By.xpath(".//*[@id='password']")).click();
            driver.findElement(By.xpath(".//*[@id='confirm_privacy']/label")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(".//*[@id='register_submit']")).click();
        } catch (InterruptedException ex) {
            Logger.getLogger(SeleniumWebdriver.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         /*
         driver.findElement(By.xpath(".//*[@id='username]")).sendKeys("srijana-kayastha");
        driver.findElement(By.xpath(".//*[@id='shared_header_user_nav']/a/div[2]")).sendKeys("Srijana01");
        driver.findElement(By.id("login_submit")).click();
       */
        
        
        
       
        
        //driver.findElement(By.xpath(.//*[@id='login_form']/fieldset/dl/dd[1]/div/span]")).click();
     //driver.findElement(By.name("form-control")).click();
        
        //driver.findElement(By.id("lst-ib")).sendKeys("dawanda");
      //driver.findElement(By.xpath(" .//*[@id='_fZl']/button")).click();
        
        
        
        
        
        
        
        
        
        
        /*driver.manage().window().maximize();
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendkeys("letskoedit");
        driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();      
        
          //Here we initialize the firefox webdriver
        Webdriver firefoxDriver=new FirefoxDriver();
       
        //Open the url which we want in firefox
        firefoxDriver.get("Http://www.google.com");*/
    }
    
    
}
