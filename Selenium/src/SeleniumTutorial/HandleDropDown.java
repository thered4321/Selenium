package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		WebElement wb = driver.findElement(By.id("day"));
		
		System.out.println("Enable Status: "+wb.isEnabled());
		System.out.println("Display Status: "+ wb.isDisplayed());
		
		Select sel = new Select(wb);
		sel.selectByIndex(0);
		List<WebElement> ls=sel.getOptions();
		System.out.println(ls.size());
		
		WebElement wb1 = driver.findElement(By.id("month"));
		Select sel1 = new Select(wb1);
		sel1.selectByVisibleText("Jun");
		
		Thread.sleep(3000);
		
		WebElement wb2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(wb2);
		sel2.selectByValue("2010");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
