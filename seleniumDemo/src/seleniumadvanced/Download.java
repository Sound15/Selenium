package seleniumadvanced;

import java.io.File;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Download {

	public static void main(String[] args) throws InterruptedException {                                                                                                                                          
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		WebElement download=driver.findElement(By.xpath("//a[@type=\"button\"]"));
		download.click();
		Thread.sleep(30000);
		File location=new File("C:\\Users\\sound\\Downloads");
		File[] totalFiles=location.listFiles();
		for (File file : totalFiles) {
			
			if(file.getName().equals("samplefile.pdf")) {
				System.out.println("File is downloaded");
				break;
			}
			
		}
		
		
		

	}

}
