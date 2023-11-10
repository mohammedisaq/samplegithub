package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gettitle_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(2).exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		 String xyzabc= driver.getTitle();
		 System.out.println(xyzabc);
	}

}
