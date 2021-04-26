package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();

		WebElement wb = driver.findElement(By.id("day"));
		
		System.out.println("Enable Status: "+wb.isEnabled());
		System.out.println("Display Status: "+ wb.isDisplayed());
		
		Select sel = new Select(wb);
		sel.selectByIndex(16);
		
		Thread.sleep(3000);
		
		WebElement wb1 = driver.findElement(By.id("month"));
		Select sel1 = new Select(wb1);
		sel1.selectByVisibleText("Dec");
		
		List <WebElement> ls = sel1.getOptions();
		System.out.println("List: "+ls.size());
		
		Thread.sleep(3000);
		WebElement wb2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(wb2);
		sel2.selectByValue("1919");
		Thread.sleep(3000);
	
		driver.close();
	}

}
