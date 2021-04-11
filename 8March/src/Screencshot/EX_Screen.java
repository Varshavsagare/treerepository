package Screencshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX_Screen {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav\\Desktop\\velocity\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	File s=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File D=new File("C:\\Users\\vaibhav\\Desktop\\velocity\\ab.png");
		FileHandler.copy(s, D);
	}

}
