package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Souris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		String Website = "https://szimek.github.io/signature_pad/";
		WebDriver d = new ChromeDriver();
		d.get(Website);
		WebElement element = d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/canvas[1]"));
		Actions draw = new Actions(d); // action interface 
		Action drawAction = draw.moveToElement(element, 50, 50) // start point
		   .clickAndHold(element)   // click mawjouda f el actions ( el encourr )
		   .moveByOffset(100, 60)
		   .moveByOffset(0, 0)
		   .moveByOffset(0, 90)
		   .moveByOffset(90, 50)
		   .moveByOffset(100, 0)
		   .moveByOffset(-300,0)
		   .moveByOffset(-50,-200)
		   .release(element) // el click lisar bech ysayab e souris ( 2nd point )
		   .build();
		drawAction.perform();
		d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/button[1]")).click();
		   // ba3d hedha lazem ta3mal cree la chaine + excuter les actions 
		  
	}
	
}