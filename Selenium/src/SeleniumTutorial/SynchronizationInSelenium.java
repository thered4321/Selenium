package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName =driver.findElement(By.name("lastname"));
		WebElement mobileno =driver.findElement(By.name("reg_email__"));
		WebElement Password =driver.findElement(By.id("password_step_input"));
		
		
		
		sendKeys(driver,firstName,10,"Anand");
		sendKeys(driver,lastName,5,"Dalal");
		sendKeys(driver,mobileno,10,"9485830398");
		sendKeys(driver,Password,10,"23fghj56");
		
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		signup.click();
		System.out.println("clicked successfully");
		//clickOn(driver,signup,10);
	}
	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout, String value ){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
//	public static void clickOn(WebDriver driver, WebElement element, int timeout)
//	{
//		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//	}

}
