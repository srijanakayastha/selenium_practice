/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 *
 * @author srijana
 */
public class Selenium_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Here we initialize the firefox webdriver
        WebDriver firefoxDriver = new FirefoxDriver();
       
        //Open the url which we want in firefox
        firefoxDriver.get("https://google.com");

    }

}
