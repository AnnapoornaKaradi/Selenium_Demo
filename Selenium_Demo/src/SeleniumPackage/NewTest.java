package SeleniumPackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public static void main(String[] args){
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/chromedriver.exe");
	  	ChromeOptions options = new ChromeOptions(); 
	  	options.addArguments("--remote-allow-origins=*");
	  	ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
  }
 
}
