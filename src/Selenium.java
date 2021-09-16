import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\eclipse-workspace\\Androidlogin\\lib\\selenium-server-standalone-3.141.59.jar");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		WebElement txtusername = driver.findElement(By.id("twotabsearchtextbox"));
		txtusername .sendKeys("Android", Keys.ENTER);
	}

}
