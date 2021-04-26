package SeleniumTutorial;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenshotDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		takescreenshot("Test"); 	
	}
	
	public static void takescreenshot(String fileName) throws IOException
	{
		//1. Take ScreenShot and store it as a file
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File file = tsc.getScreenshotAs(OutputType.FILE);
		//2. Now Copy the file into desired location using copyfie() method
		FileUtils.copyFile(file, new File("D:/eclipse-workspace/Selenium/src/SeleniumTutorial/Screenshots/"+fileName+".jpg"));
	}
	
}
