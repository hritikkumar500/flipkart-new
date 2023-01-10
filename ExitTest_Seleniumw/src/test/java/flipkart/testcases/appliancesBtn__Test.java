package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.appliancesBtn__Page;
import flipkart_project.utilities.BasePage;

public class appliancesBtn__Test extends BasePage {
	@Test
	public void appliancesTest() throws InterruptedException {

		appliancesBtn__Page appliances = PageFactory.initElements(driver, appliancesBtn__Page.class);
		appliances.appliancesPage();
		appliancesBtn__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Appliances buton tested");
		Thread.sleep(4000);
	}
}
