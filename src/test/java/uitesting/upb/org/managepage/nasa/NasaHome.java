package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.sql.Driver;

public class NasaHome extends BasePage {

    @FindBy(xpath = "//div[@class='tocify-wrapper']//li[@data-unique='api-listing']")
    private WebElement listingButton;

    @FindBy(xpath = "//div[@class='tocify-wrapper']//li[@data-unique='authentication']")
    private WebElement authenticationButton;

    @FindBy(xpath = "//div[@class='tocify-wrapper']//li[@data-unique='demo_key-rate-limits']")
    private WebElement demoKeyRateLimitsButton;



    public void clickListingButton()
    {
        Events.click(listingButton);
    }
    public void clickAuthButton()
    {
        Events.click(authenticationButton);
    }
    public void clickDemoKeyButton()
    {
        Events.click(demoKeyRateLimitsButton);
    }
    public void executeOperations() throws InterruptedException {
        Events.isVisibleWebElement(listingButton);
        clickListingButton();
        Events.isVisibleWebElement(listingButton);
        clickListingButton();
        Events.isVisibleWebElement(authenticationButton);
        clickAuthButton();
        Events.isVisibleWebElement(demoKeyRateLimitsButton);
        clickDemoKeyButton();

        System.out.println(By.xpath("//body//div[@class='page-wrapper']//ul[2]//li//text()"));
        System.out.println(By.xpath("//body//div[@class='page-wrapper']//ul[2]//li[last()]//text()"));
    }
}
