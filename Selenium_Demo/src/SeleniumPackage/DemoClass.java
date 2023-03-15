package SeleniumPackage;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
public class DemoClass {
	@Test
	public static void main(String[] args) {
	
		{
			     System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/chromedriver.exe");
			     ChromeOptions options = new ChromeOptions(); 
			 	 options.addArguments("--remote-allow-origins=*");
			 	 ChromeDriver driver = new ChromeDriver(options);
			     driver.manage().window().maximize();
			     driver.get("https://www.facebook.com");
			     driver.findElement(By.id("email")).sendKeys("annuannu108@gmail.com");
			     driver.findElement(By.id("pass")).sendKeys("Poorvi5028!");
			     driver.findElement(By.name("login")).click(); 
			     }
			}


}
