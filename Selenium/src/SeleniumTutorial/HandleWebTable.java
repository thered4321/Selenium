package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Revision/first.html");
		
		WebElement wbtext = driver.findElement(By.xpath("//table//tbody//tr[2]//td[1]"));
		System.out.println(wbtext.getText());
		//finding the rows	
		//WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Total no of rows are: "+rows.size());

		//finding coloumns
		List<WebElement> coloumn= driver.findElements(By.xpath("//table//tbody//th"));
		System.out.println("Total coloumn size is: "+coloumn.size());
		
		//table//tbody//tr[2]//td[1]
		//table//tbody//tr[3]//td[1]
		//table//tbody//tr[4]//td[1]
		
		String Beforexpath = "//table//tbody//tr[";
		String Middlexpath = "]//td[";
		String Afterxpath = "]";
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=coloumn.size();j++)
			{
			String Actualxpath = Beforexpath+i+Middlexpath+j+Afterxpath;
			WebElement member = driver.findElement(By.xpath(Actualxpath));
			System.out.println(member.getText());
			
			}
			System.out.println("------------");
		}
		
	}
}
