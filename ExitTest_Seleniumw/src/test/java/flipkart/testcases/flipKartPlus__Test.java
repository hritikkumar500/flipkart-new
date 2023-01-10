package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.flipKartPlus__Page;

import flipkart_project.utilities.BasePage;

public class flipKartPlus__Test extends BasePage {
	@Test
	public void flipkartPlus_Page() throws InterruptedException {
		
		flipKartPlus__Page flipkartPlusPage = PageFactory.initElements(driver, flipKartPlus__Page.class);
		flipkartPlusPage.login_flipkart();
		for(int i=1;i<=2;i++){  
			driver.navigate().back();  
	    }
		test.log(LogStatus.PASS, "Flipkart Plus Test page tested");
	    Thread.sleep(4000);
	    
		
	}

}
