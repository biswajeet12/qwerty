package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://m.facebook.com/");
}
}
