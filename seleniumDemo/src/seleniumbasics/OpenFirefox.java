package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.co.in");

	}

}
