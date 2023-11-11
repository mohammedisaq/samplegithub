package Cases_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_attribute {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(2).exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("samsung mobiles 20000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.linkText("Amazon miniTV")).click();
	//these is my change
	driver.close();
	
}
}
