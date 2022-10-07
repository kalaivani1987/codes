package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bank {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://capitalone.invisionapp.com/share/YH9RH7MJATP#/screens/211496191");
driver.findElement(By.xpath("//a[@class=\"hotspot\"]")).click();

driver.findElement(By.xpath("//a[@class=\"hotspot\"]")).sendKeys("9000");


	}

}
