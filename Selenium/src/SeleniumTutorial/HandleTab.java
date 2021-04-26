package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
		
		String parentID = it.next();
		System.out.println("The ParentID is: "+parentID);
		
		String childID = it.next();
		System.out.println("The ChildID is: "+childID);
		
		
		driver.switchTo().window(childID);
		System.out.println("Child ID url: "+driver.getCurrentUrl());
		driver.findElement(By.name("emailid")).sendKeys("xyz@yahoo.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		System.out.println("The Username for xyz@yahoo.com is: "+driver
									.findElement(By.xpath("//table//tbody//tr[4]//td[2]")).getText());
		System.out.println("The Password for xyz@yahoo.com is: "+driver	
									.findElement(By.xpath("//table//tbody//tr[5]//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table//tbody//tr[6]//td[1]//h3")).getText());
		
		driver.close();
		
		driver.switchTo().window(parentID);
		System.out.println("ParentID url"+driver.getCurrentUrl());
		
	}

}
