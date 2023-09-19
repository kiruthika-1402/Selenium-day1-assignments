package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("firstname")).sendKeys("Kiruthika");
		
		driver.findElement(By.name("lastname")).sendKeys("laxmi");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kiruthikalaxmi1402@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("kiruthika123");
		
		WebElement element = driver.findElement(By.id("day"));
		
		Select option = new Select(element);
		
		option.selectByIndex(13);
		
		WebElement element2 = driver.findElement(By.id("month"));
		
		Select option1 = new Select(element2);
		
		option1.selectByVisibleText("Feb");
		
		WebElement element3 = driver.findElement(By.id("year"));
		
		Select option3 = new Select(element3);
		
		option3.selectByValue("2002");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		

	}

}
