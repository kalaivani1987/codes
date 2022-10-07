package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	boolean isEnabled =	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).isEnabled();
	boolean isDisplayed =	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).isDisplayed();
	if(isEnabled) {
	
	System.out.println("isEnabled");
		

	}else {
		System.out.println("not isEnabled");
}

	
	
if(isDisplayed) {
	System.out.println("isDisplayed");
}else {
	System.out.println("not isDisplayed");
	
}}}