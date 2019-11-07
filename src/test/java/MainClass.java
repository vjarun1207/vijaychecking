import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends HelperClass{
	public static void main(String[] args) {
		LaunchDriver();
		gt("https://www.facebook.com/");
		gc();
	   WebElement w = driver.findElement(By.id("email"));
	   sk(w,"shsvbhsbhsb");
	   WebElement c = driver.findElement(By.id("pass"));
	   sk(c,"2345645664");
	   WebElement b = driver.findElement(By.id("loginbutton"));
	   c(b);
	   System.out.println("over");
	   
	   
	}
	
	

}
