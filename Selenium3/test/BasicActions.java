/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.TimeUnit;
import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author srijana
 */
public class BasicActions {
    
    WebDriver driver;
    String baseUrl;
    
 
    
    
   /* @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
*/
    
    @Before
   
         public void setUp()  throws Exception{
       
       baseUrl = "https://letskodeit.teachable.com/";
       System.setProperty("webdriver.gecko.driver", "/Users/srijana/Documents/seleniumpractise notes/geckodriver 2");
       driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
         driver.manage().window().maximize();
    }
    
    @Test
    public void test() {
    driver.get(baseUrl);
    driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
    System.out.println("Clicked on login");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("Sending keys to password field");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing the username field");

    }
    
    
    
    
    @After
    public void tearDown() throws Exception {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
}

        
 



