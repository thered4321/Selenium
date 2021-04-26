package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/");
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
		//driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.switchTo().frame(0);
		
		System.out.println("entering username");		
		driver.findElement(By.name("email")).sendKeys("anand");
		System.out.println("entering password");
		driver.findElement(By.name("password")).sendKeys("dalal123");
		System.out.println("Clicking on login");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		WebElement wb = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		
		System.out.println("Display status: "+wb.isDisplayed());
		wb.click();
		
		
		
	
	}

}
