package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TryError {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Prerequisite
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Initializing the browser
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();;
		System.out.println("pop closed");
		
		Thread.sleep(3000);
		System.out.println("clicking on input forms");
		driver.findElement(By.linkText("Input Forms")).click();
		System.out.println("clicked");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkbox Demo")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type= 'checkbox' and @id='isAgeSelected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type= 'checkbox' and @id='isAgeSelected']")).click();
		//check
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//div[@class = 'panel-body']//preceding-sibling::div[@class = 'checkbox']//input[@id='isAgeSelected']")).click();
		
		//driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]")).click();
		System.out.println("Success");
	}

}
