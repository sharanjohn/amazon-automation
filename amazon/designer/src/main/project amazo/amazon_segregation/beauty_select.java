package amazon_segregation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class beauty_select {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Beauty']")
	 private WebElement beauty;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public beauty_select(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements( driver2, this);
		
	}
}
