package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentID = it.next();
		System.out.println("The parent id is: "+parentID);
		
		String ChildID = it.next();
		System.out.println("The Child id is: "+ChildID);
		
		
		driver.switchTo().window(ChildID);
		driver.manage().window().maximize();
		System.out.println("switched to child");
		Thread.sleep(3000);
		System.out.println("Child Title: "+driver.getTitle());
		
//		WebElement text = driver.findElement(By.xpath("sampleHeading"));
//		System.out.println(text.getText());
//		Thread.sleep(5000);
//		driver.close();
//		
		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		System.out.println("Parent Title: "+driver.getTitle());
		
	}

}
