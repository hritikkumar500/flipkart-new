package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.flipkartCareer__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class flipkartCareer__Test extends BasePage {
	@Test
	public void careerTest() throws InterruptedException {

		flipkartCareer__Page careerTest = PageFactory.initElements(driver, flipkartCareer__Page.class);
		careerTest.careerPage();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("indiacareerPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("indiacareerPageTitle"));
		for (int i = 1; i <= 2; i++) {
			driver.navigate().back();
		}
		test.log(LogStatus.PASS, "Grocery page tested");
		Thread.sleep(3000);

	}
}
