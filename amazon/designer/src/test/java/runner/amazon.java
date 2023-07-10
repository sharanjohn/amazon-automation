package runner;

import amazon_segregation.beauty_select;
import amazon_segregation.home_page_amazon;
import amazon_segregation.order_place;
import useable.base_class;

public class amazon extends base_class{
	public static void main(String[] args) throws InterruptedException {
		browser_launch("chrome");
		get_url("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=14209900793164551202&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		
		Thread.sleep(2000);
		pom obj = new pom(driver);
	    
	    obj.getAa().getHome().click();
	    
	   obj.getBb().getBeauty().click();
	    
	   obj.getEe(). getSoap().click();
	   obj.getEe().getBuy().click();
	    sendkeys(obj.getEe().getSignin(), "9443311428");
	    obj.getEe().getButton().click();
	   
	}
	

}
