package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_methods {
	public static void main(String[] args) {
		// Webdriver GET Method
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(1).exe");
		WebDriver driver=new EdgeDriver();
		 driver.get("https://www.google.com/");
	}

}
