package amazon_segregation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page_amazon {

	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHome() {
		return home;
	}

	@FindBy (xpath = "//a[text()='Best Sellers']")
	private WebElement home;
	
	public home_page_amazon(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
}