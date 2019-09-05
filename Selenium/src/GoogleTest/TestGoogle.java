package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\MyInstalls\\Selenium\\selenium-java-3.141.59\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("https://www.google.com/gmail/about/", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();	
	       String url = "https://www.google.com/gmail/about/";
           driver.get(url);					
	    }		
		

	}


