package amazon_segregation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pom {
   
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	private home_page_amazon aa;
	
	private beauty_select bb;
	
	private  order_place ee;

	public home_page_amazon getAa() {
		aa = new home_page_amazon(driver);
		return aa;
	}

	public beauty_select getBb(){
		bb = new beauty_select(driver);
		return bb;
	}

	public order_place getEe() {
		ee = new order_place(driver);
		return ee;
	}
	public pom(WebDriver driver4) {
		// TODO Auto-generated constructor stub
		this. driver = driver4;
		PageFactory.initElements( driver4,this);
		
	}
}
