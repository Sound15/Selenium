package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		
	}

}

