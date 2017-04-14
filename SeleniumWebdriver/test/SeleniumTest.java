/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srijana
 */


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Please change the extension of the file to .java
// I added .txt because udemy currently does not allow to add .java files
public class SeleniumTest {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.letskodeit.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testSelenium() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("i90scv3glabel")).click();
        driver.findElement(By.linkText("Practice")).click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        // driver.quit();
    }
}
