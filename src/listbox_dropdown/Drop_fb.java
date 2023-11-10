package listbox_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Drop_fb {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Irfan\\Downloads\\edgedriver_win64\\msedgedriver(2).exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
         driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
	}

}
