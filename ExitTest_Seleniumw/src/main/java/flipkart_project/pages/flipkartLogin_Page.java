package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flipkartLogin_Page {
	WebDriver driver;

	public flipkartLogin_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement entermobileNumer_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement requestOTP_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/button")
	WebElement loginPageClose_btn;

	public void login_flipkart(String MNumber) {
		entermobileNumer_txt.sendKeys(MNumber);
		requestOTP_btn.click();
		loginPageClose_btn.click();

	}

}
