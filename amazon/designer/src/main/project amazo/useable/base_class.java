package useable;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	public static WebDriver driver;
		

	
	public static void browser_launch(String browser) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
	}else if (browser.equals("internet")) {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
	}}
	 public static void get_url(String url) {
		driver.get(url);

	}
	 public static void sendkeys(WebElement element,String data) {
		element.sendKeys(data);

	}
	 public static  void click_element(WebElement element) {
		element.click();

	}
	 public static void navigate_to(String ac) {
		driver.navigate().to(ac);

	}
	
	public static void refresh_browser() {
	driver.navigate().refresh();

	}
			
  public static void backward_to() {
	driver.navigate().back();

    }
    public static void forward_to() {
	driver.navigate().forward();

    }
    public static void close_browser() {
		driver.close();

	}
    public static void quit_browser() {
		driver.quit();
    }		
    public static void Alert_pop(String ac) {
		if(ac.equals("accept")) {
			driver.switchTo().alert().accept();
		}else if (ac.equals("dismiss")) {
			driver.switchTo().alert().dismiss();
		} 
    }	
	
	public static void alert_pop_sendkey(String ac) {
		driver.switchTo().alert().sendKeys(ac);

	}
   public static void action_browser(String ac,WebElement element) {
	 Actions a = new Actions(driver);
	 if (ac.equalsIgnoreCase("rightclick")) {
		 a.contextClick(element).build().perform();
		  }else if (ac.equalsIgnoreCase("doulble click")) {
			  a.doubleClick(element).build().perform();
			}else if (ac.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}else if (ac.equalsIgnoreCase("clickandhold")) {
				a.clickAndHold(element).build().perform();
			}else if (ac.equalsIgnoreCase("release")) {
				a.release(element).build().perform();
			}else if (ac.equalsIgnoreCase("movetoelement")) {
				a.moveToElement(element).build().perform();
			}}

     public static void get_title(String ac) {
		driver.getTitle();

	}
    
	}
	

