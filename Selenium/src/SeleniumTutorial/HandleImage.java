package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleImage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement wb = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]"));
		System.out.println(wb.isDisplayed());
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		
		WebElement wb1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/a[1]/img[1]"));
		System.out.println("Image Link status: "+wb1.isDisplayed());
		wb1.click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
