package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.customerCare__Page;
import flipkart_project.utilities.BasePage;

public class customerCare__Test extends BasePage {
	@Test
	public void customerhelp() throws InterruptedException {

		customerCare__Page customerCare = PageFactory.initElements(driver, customerCare__Page.class);
		customerCare.customercarepage();
		for (int i = 1; i <= 2; i++) {
			driver.navigate().back();
		}
		test.log(LogStatus.PASS, "Customer care test success");
		Thread.sleep(4000);
		
	}
}
