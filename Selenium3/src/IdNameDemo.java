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

public class IdNameDemo {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
            System.setProperty("webdriver.gecko.driver", "/Users/srijana/Documents/seleniumpractise notes/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
	
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");		
		driver.findElement(By.name("btnG")).click();
	}

}

