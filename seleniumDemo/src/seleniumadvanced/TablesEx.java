package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://www.leafground.com/dynamicgrid.xhtml");
		counting no.of rows and columns
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		List<WebElement> rows=driver.findElements(By.xpath("//*[@role=\"grid\"]//tr"));
		int columnCount=columns.size();
		int rowCount=rows.size();
		System.out.println("Number of columns "+columnCount);
		System.out.println("Number of rows "+rowCount);
		*/
		
		/*get specific element
		driver.get("https://letcode.in/table");
		WebElement getEmail=driver.findElement(By.xpath("//td[normalize-space()=\"Koushik\"]/following::td[2]"));
		String email=getEmail.getText();
		System.out.println(email);
		*/
		
		//clicking checkbox for particular element
		driver.get("https://letcode.in/table");
		List<WebElement> lastnames=driver.findElements(By.xpath("//table[@id=\"simpletable\"]//td[2]"));
		for (WebElement lastname : lastnames) {
			String lastnametext=lastname.getText();
			if(lastnametext.equals("Man")) {
				String text="Man";
				String fxpath="//td[normalize-space()="+"\""+text+"\""+"]/following::td[2]/input";
				WebElement check=driver.findElement(By.xpath(fxpath));
				check.click();
			}
		
		
		
	}

}
}

