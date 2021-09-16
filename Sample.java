package org.pro;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\rashm\\eclipse-workspace\\Single Maultple Drop Down\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
        WebElement dd = driver.findElement(By.name("mulipleSelect"));
        Select select = new Select(dd);
        select.selectByIndex(0);
        select.selectByIndex(1);
        
        
	
	
	
	
	
        
	
	
	
	
	
	
	
	
	
	
}
}
