package MouseMovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='todrag']//span[text()='Draggable 1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		action.dragAndDrop(drag, drop).release().build().perform();
		
		
		
	}

}
