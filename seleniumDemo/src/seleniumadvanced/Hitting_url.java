package seleniumadvanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hitting_url {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		String url="http://www.google.co.in";
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.location=\'"+url+"\'");
	}

}
