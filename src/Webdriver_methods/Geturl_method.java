package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Geturl_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(1).exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		String a=driver.getTitle();
		System.out.println(	a);
	}

}
