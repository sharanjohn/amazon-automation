package amazon_segregation;

import org.apache.xmlbeans.soap.SOAPArrayType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order_place {
	WebDriver driver;

	@FindBy(xpath = "//div [text() ='Dettol Original Germ Protection Bathing Soap Bar, 125g (Pack Of 5)']")
	private WebElement soap;
	
	@FindBy(id = "buy-now-button")
	private WebElement buy;
	
	@FindBy(id = "ap_email")
	private  WebElement signin;
	
	@FindBy(id="continue")
	private WebElement button;


	
	
	public WebDriver getDriver() {
		return driver;
	}




	public WebElement getSoap() {
		return soap;
	}




	public WebElement getBuy() {
		return buy;
	}




	public WebElement getSignin() {
		return signin;
	}




	public WebElement getButton() {
		return button;
	}




	public order_place(WebDriver driver3) {
		// TODO Auto-generated constructor stub
		this.driver = driver3;
		PageFactory.initElements( driver3,this);
	}
}
