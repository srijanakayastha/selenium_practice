/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srijana
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo {

	public static void main(String[] args) {
            String baseURL = "http://www.google.com";
            System.setProperty("webdriver.gecko.driver", "/Users/srijana/Documents/seleniumpractise notes/geckodriver 2");
		WebDriver driver = new FirefoxDriver(); // WebDriver is interface,FirefoxDriver is class.We create a Webdriver reference driver and assign it to an object of class FirefoxDriver. 
                //To perform the testing on Firefox, make an object of class FirefoxDriver. 
                driver.get(baseURL);
                
       driver.close();
       
       
                
	}
}

