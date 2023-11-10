package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate_method {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(1).exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
	//	driver.navigate().back();
	//  driver.navigate().back();
	//   driver.navigate().forward();
	/*	driver.navigate().back();
		driver.navigate().forward();*/
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
