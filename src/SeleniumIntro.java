import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {  //execution starts from main method
		// TODO Auto-generated method stub
		
		//invoking browser;
		//Chrome- ChromeDriver exten methods close get
		//Firefox - FirefoxDriver-methods close get
		//safari - safriDriver -methods close get
		
		
		// WebDriver interface
		
		//Chromedriver.exe-->Chromebrowser Selenium Manager
		
		//step to invoke chrome browser//
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\thank\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox launch  --geckodriver    ----  webdriver.gecko.driver
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\thank\\geckodriver.exe");
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\thank\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		
		//to hit the url
        driver.get("https://rahulshettyacademy.com/");  
        //to get the title
        System.out.println(driver.getTitle());
        
       // to get the url 
        System.out.println(driver.getCurrentUrl());
        
        //to close the current page
        //driver.close();
        //to close all pages
        driver.quit();
        
	}

}
