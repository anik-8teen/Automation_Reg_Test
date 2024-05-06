package TryTestingThis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;
public class Test {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//firstName
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("Mehedi Hasan");
		
		//lastName
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("Anik");
		
		//RadioButton
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();
		
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		//SelectDropDown
		WebElement dropdown= driver.findElement(By.id("option"));
		Select drop = new Select(dropdown);
		
		drop.selectByIndex(2);
		
	    //Multiple Select Drop Down
		WebElement multidropdown = driver.findElement(By.id("owc"));
	
		Select multidrop = new Select(multidropdown);
		multidrop.selectByIndex(1);
		multidrop.selectByIndex(2);
		
		//CheckBox		
		WebElement CheckOption1 = driver.findElement(By.name("option1"));
	     CheckOption1.click();
		
	    WebElement CheckOption2 = driver.findElement(By.name("option2"));
	    CheckOption2.click();
		
		//inputFile
	    
	    WebElement input =driver.findElement(By.id("myfile"));
	    
	    String path = "F:\\CLASS LECTURE\\MY DOC!\\Mehedi Hasan Anik(SQA).pdf";
		
	    input.sendKeys(path);

		
		
	}

}
