package uitesting.upb.org.managepage.localhost;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Menu extends BasePage {
    @FindBy(xpath = "//*[@id='openDrawer']")
    private WebElement navDrawerBtn;
    @FindBy(xpath = "//*[@id='crearCuentaNav']")
    private WebElement addAccountBtn;
    @FindBy(xpath = "//*[@id='nombreCrearCuenta']")
    private WebElement accountNameInput;
    @FindBy(xpath = "//*[@id='crearCuenta']")
    private WebElement accountCreateBtn;

    public void addAccount() throws InterruptedException {
        isNavDrawerBtnVisible();
        clickNavDrawerBtn();
        Thread.sleep(1000);
        isAddAccountBtnVisible();
        clickAddAccountBtn();
        Thread.sleep(1000);
        isAccountNameInputVisible();
        setText("Negocio");
        Thread.sleep(1000);
        isAccountCreateBtnVisible();
        clickCreateAccountBtn();
        Thread.sleep(1000);
        isNavDrawerBtnVisible();
        clickNavDrawerBtn();
    }
    public void clickNavDrawerBtn() {
        Events.click(navDrawerBtn);
    }
    public void clickAddAccountBtn() {
        Events.click(addAccountBtn);
    }
    public void clickCreateAccountBtn() {
        Events.click(accountCreateBtn);
    }
    public boolean isNavDrawerBtnVisible() {
        return Events.isVisibleWebElement(navDrawerBtn);
    }
    public boolean isAddAccountBtnVisible() {
        return Events.isVisibleWebElement(addAccountBtn);
    }
    public boolean isAccountNameInputVisible() {
        return Events.isVisibleWebElement(accountNameInput);
    }
    public boolean isAccountCreateBtnVisible() {
        return Events.isVisibleWebElement(accountCreateBtn);
    }

    public Menu setText(String txt)
    {
        Events.fillField(accountNameInput, txt);
        return this;
    }
}
