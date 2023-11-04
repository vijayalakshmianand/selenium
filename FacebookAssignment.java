package Assignment.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {

	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://en-gb.facebook.com/");
	 
	 driver.manage().window().maximize();
	 
	 WebElement createNewButton = driver.findElement(By.className("createNewButton"));createNewButton.click();
	
		 
	 WebElement firstName = driver.findElement(By.id("FirstName"));firstName.sendKeys("Test");
	 
	 WebElement surName = driver.findElement(By.id("surname"));surName.sendKeys("leaf");
	 
     driver.findElement(By.id("email")).sendKeys("Testleaf@2023.gmail.com");
     
     driver.findElement(By.id("password")).sendKeys("leaf");
     
     WebElement birthDate = driver.findElement(By.id("Date_date of the birth"));
     
     
      Select birthdate = new Select(birthDate);
     
      birthdate.selectByIndex(3);
      
      WebElement sex = driver.findElement(By.id("sex"));sex.sendKeys("Female");
      
      
                 
      
      
       
	 
	}

}
