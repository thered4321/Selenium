package SeleniumTutorial;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotPractice {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.com/");
		TakeScreenshot("Anand_Test");
		driver.findElement(By.xpath("//a[@href = '/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl_52df97a2eee74206a8343034e85cd058']"));
		TakeScreenshot("Afterclick");
		driver.close();
	}
	
	public static void TakeScreenshot(String fileName) throws IOException
	{
		//1. Take a screenshot and store it as a Files
		TakesScreenshot tshot = (TakesScreenshot)driver;
		File file = tshot.getScreenshotAs(OutputType.FILE);
		
		//2. Copy the file into desired location by uing Filecopy() Method
		FileUtils.copyFile(file, new File("D:eclipse-workspace/Selenium/src/SeleniumTutorial/Screenshots/"+fileName +".png"));
		
	}

}
