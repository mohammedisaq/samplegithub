package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(2).exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile under 20000");
	//	driver.findElement(By.id("nav-search-submit-button")).click();
	//driver.findElement(By.cssSelector("input[id= nav-search-submit-button']")).click();
		
		
	}

}
