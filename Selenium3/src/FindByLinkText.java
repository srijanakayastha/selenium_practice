/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srijana
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws Exception {
		String baseURL = "http://demostore.x-cart.com/";
            System.setProperty("webdriver.gecko.driver", "/Users/srijana/Documents/seleniumpractise notes/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
	
		driver.get(baseURL);
		
		//driver.findElement(By.xpath(".//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[4]/a/span")).click();
		
		
		//driver.findElement(By.xpath(".//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[7]/a/span")).click();
                
                driver.findElement(By.tagName("a")).click();
                
		
	}
}

/*public -its the access specifier means from every where we can access it; 
static  - access modifier means we can call this method directly using class name without creating an object of it; 
void - its the return type;
main - method name 
string [] args - it accept only string type of argument..and stores it in a string ...*/