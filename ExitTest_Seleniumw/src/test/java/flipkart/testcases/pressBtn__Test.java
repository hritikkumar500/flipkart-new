package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.pressBtn__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class pressBtn__Test extends BasePage {
	@Test
	public void pressbtnTest() throws InterruptedException {

		pressBtn__Page pressbtnTest = PageFactory.initElements(driver, pressBtn__Page.class);
		pressbtnTest.pressbtnPage();
		String sustainiblityheading = pressBtn__Page.sustainabilityPageHeading_txt.getText();
		Assert.assertEquals(sustainiblityheading, ReadingTestdataFile.getProperty("Expectedsustainiblitypageheading"));
		for (int i = 1; i <= 4; i++) {
			driver.navigate().back();
		}
		test.log(LogStatus.PASS, "Press button page tested");
		Thread.sleep(3000);
	}

}
