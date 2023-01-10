package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class cartBtn__Page {

	WebDriver driver;

	public cartBtn__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div[1]/div[2]/div[6]/div/div/a")
	WebElement GotoCart_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]")
	WebElement missingCartItem_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div/div/div[1]/div/div/a[2]")
	WebElement grocery_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]")
	WebElement basketEmpty_txt;

	public void cartbtnpage() throws InterruptedException {

		GotoCart_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Shopping Cart | Flipkart.com"));
		Assert.assertEquals(driver.getTitle(), "Shopping Cart | Flipkart.com");
		Assert.assertTrue(missingCartItem_txt.isDisplayed());
		grocery_btn.click();
		wait.until(ExpectedConditions.visibilityOf(basketEmpty_txt));
		Assert.assertTrue(basketEmpty_txt.isDisplayed());

	}

}
