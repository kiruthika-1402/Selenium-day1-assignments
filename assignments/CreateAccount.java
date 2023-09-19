package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        
        // To launch Url
        
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        // To maximize
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Accounts")).click();
        
        driver.findElement(By.linkText("Create Account")).click();
        
        driver.findElement(By.id("accountName")).sendKeys("Sales account 2");
        
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        WebElement element = driver.findElement(By.name("industryEnumId"));
        
        Select option = new Select(element);
        
        option.selectByIndex(3);
        
        WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
        
        Select option1 = new Select(element2);
        
        option1.selectByVisibleText("S-Corporation");
        
        WebElement element3 = driver.findElement(By.id("dataSourceId"));
        
        Select option3 = new Select(element3);
        
        option3.selectByValue("LEAD_EMPLOYEE");
        
        WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
        
        Select option4 = new Select(element4);
        
        option4.selectByIndex(6);
        
        WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
        
        Select option5 = new Select(element5);
        
        option5.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        String s = "Sales account 2";
        
        String title = driver.getTitle();
        System.out.println(title);
        
        if (title.equals(s)) {
        	
        	System.out.println("Account name is displayed");
			
		} else {
			
			System.out.println("Not displayed");
		}
        
        driver.close();
        
        
        
       
       
        
       

	}

}
