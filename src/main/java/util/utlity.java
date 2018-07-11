package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.driver;

public class utlity extends driver

{
	
	WebDriverWait wait;

	public boolean explicitWait(By locator) {
		try {
			wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		}catch (Exception e) {
			e.getMessage();
			return false;
		}
	}
	
	public boolean explicitWait(WebElement element) {
		try {
			wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		}catch (Exception e) {
			e.getMessage();
			return false;
		}
	}
	
	public Actions ac;
	public void move(WebElement element) {
		explicitWait(element);
		ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}
	 public void isselected(WebElement element)
		{
			if(element.isSelected()==true)
			{
				System.out.println("Checkbox is already selected");
			}
			else {
				element.click();
			}
		}
	 
	public void listItertor() {
		
	}
	
	
}
