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

public class FirefoxDriverDemo {

	public static void main(String[] args) {
            String baseURL = "http://www.google.com";
		WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "/Users/srijana/Documents/seleniumpractise notes/geckodriver");
		
		driver.get(baseURL);
	}
}
