
//it works on Google chrome//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/srijana/Documents/seleniumpractise notes/selenium-2.53.1/chromedriver");
		driver = new ChromeDriver();
		
		driver.get(baseURL);

	}

}
