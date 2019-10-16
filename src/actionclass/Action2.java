package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {
	
	
	
	private static String baseurl="http://demo.guru99.com/test/simple_context_menu.html";
	private static String chromedrive="C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe";
	private static WebDriver driver;
	

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",chromedrive);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
		
		Actions action = new Actions(driver);
		WebElement element =driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		action.doubleClick(element).perform();
		Alert alt=driver.switchTo().alert();
		String text =alt.getText();
		
		System.out.println(text);
		alt.accept();
		
		driver.close();
		
	}
	
}
