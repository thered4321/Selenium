package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title = driver.getTitle();
		System.out.println("The title of the page is: "+Title);
		
		WebElement wb = driver.findElement(By.id("email"));
		
		System.out.println("Enabled state of Username is: " + wb.isEnabled());
		System.out.println("Displayed State of Username is: "+ wb.isDisplayed());
		
		wb.sendKeys("thered");
		String s = wb.getAttribute("value");
		System.out.println("The entered username is: " +s);
		
		driver.navigate().to("https://freecrm.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		 
	}

}
