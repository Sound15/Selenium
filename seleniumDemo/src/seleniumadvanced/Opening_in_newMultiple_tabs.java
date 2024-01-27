package seleniumadvanced;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_in_newMultiple_tabs {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		//new tab
//		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
//		driver.findElement(By.linkText("Get started")).sendKeys(tab);
		
		//multiple tabs and multiple windows
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.google.co.in");



	}


}
