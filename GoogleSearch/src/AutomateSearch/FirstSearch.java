package AutomateSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSearch {
	 
	 public static void main(String[] args) throws InterruptedException {
	 
	 // Create a new instance of the Firefox driver
		 String exePath = "C:\\Users\\amandave\\Downloads\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 
	        //Launch the Online Store Website
		 driver.get("http://www.google.com");
		 //driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Ajit Mandave");
	        // Print a Log In message to the screen
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Ajit Mandave");

		 driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[3]/center/input[1]")).click();
	     System.out.println("Successfully opened ");
	 
	 //Wait for 5 Sec
	    Thread.sleep(5000);
	 
	        // Close the driver
	        driver.quit();
	    }
	}