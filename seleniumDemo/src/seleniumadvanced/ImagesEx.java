package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		/*clicking an image
		driver.get("https://demo.nopcommerce.com/");
		WebElement apparel=driver.findElement(By.xpath("//img[@title=\"Show products in category Apparel\"]"));
		apparel.click();
		 */

		//to find whether an image is broken
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> images=driver.findElements(By.xpath("//div[@class=\"example\"]/img"));

		for (WebElement image : images) { 
			if(image.getAttribute("naturalWidth").equals("0")) { 
				System.out.println("The image is broken"); 
			}else { 
				System.out.println("The image is not broken"); 
			} 
		}



	}

}
