
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bing {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		WebElement header = driver.findElement(By.className("below_sbox"));
		
		List<WebElement> hearderLinks = driver.findElements(By.tagName("a"));
		System.out.println("Available Links :" + hearderLinks.size());
		for(int i=0; i<hearderLinks.size(); i++) {
			System.out.println(hearderLinks.get(i).getText());
		}
		driver.quit();
	

	}

}
