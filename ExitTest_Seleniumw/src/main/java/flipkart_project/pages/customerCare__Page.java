package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class customerCare__Page {

	WebDriver driver;

	public customerCare__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/div/div")
	WebElement moreOption_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/ul/li[2]/a/div")
	WebElement customerCare_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[1]/h1")
	WebElement customerCarePageHeading_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div[2]")
	WebElement trackOrder_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[4]")
	WebElement howTOTrackOrder_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/div[2]")
	WebElement freqAskedQstSubHeading_txt;

	public void customercarepage() {

		WebElement login_btn = moreOption_btn;
		System.out.println("Search result page title correct");
		Actions actions = new Actions(driver);
		actions.moveToElement(login_btn).build().perform();
		customerCare_btn.click();

		if (customerCarePageHeading_txt.isDisplayed()) {

			System.out.println("Customer Care page opened");

		} else {
			System.out.println("Unable to open customer care page");
		}
		trackOrder_btn.click();
		howTOTrackOrder_btn.click();
		if (freqAskedQstSubHeading_txt.isDisplayed()) {

			System.out.println("Frequently asked question working fine");
		} else {
			System.out.println("Unable to open frequently asked question");

		}
	}

}
