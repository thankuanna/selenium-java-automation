import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\thank\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  
  driver.get("https://rahulshettyacademy.com/locatorspractice/");
  //find elements n for entering details(sendkeys)
  driver.findElement(By.id("inputUsername")).sendKeys("Thanku");
  //pwd
  driver.findElement(By.name("inputPassword")).sendKeys("Hai23");
  //click on submit button
  driver.findElement(By.className("signInBtn")).click();
  driver.quit();
  }

}
