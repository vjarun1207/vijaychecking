import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	static WebDriver driver;
	
	public static void LaunchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER PC\\eclipse-workspace\\aravindh\\Day 3 Task\\java day4\\selenium day4\\UtilityClass\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
public static void gt(String url) {
driver.get(url);

}
public static void gc() {
String s = driver.getCurrentUrl();
System.out.println(s);
}
public static void sk(WebElement e,String r) {
	e.sendKeys(r);

}
public static void c(WebElement r) {
	r.click();
}
public static void close() {
	driver.close();

}

}



