package seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement calender=driver.findElement(By.id("datepicker"));
		calender.click();
		//calender.sendKeys("31/12/2023");
		
		
		WebElement next=driver.findElement(By.xpath("//a[@title=\"Next\"]"));
		next.click();
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),\"10\")]"));
		date.click();
		

	}

}
