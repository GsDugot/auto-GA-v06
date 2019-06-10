package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.localhost.Menu;

import java.awt.*;

public class LocalhostStepdefs {
    private Menu localhostMenu;
    @Given("^localhost page loaded$")
    public void localhostPageLoaded() {
        localhostMenu = LoadPage.loadHostMenu();
        System.out.println("Page Loaded");
    }

    @Then("^Navbar button is visible$")
    public void navbarButtonIsVisible() {
        boolean isVisible = localhostMenu.isNavDrawerBtnVisible();
        Assert.assertEquals(isVisible, true);
        System.out.println("Navbar Button Visible");
    }

    @And("^Navbar button is clicked$")
    public void navbarButtonIsClicked() {
        localhostMenu.clickNavDrawerBtn();
        //localhostMenu.isAddAccountBtnVisible();

        //Thread.sleep(1000);
    }

    @And("^Add account button is clicked$")
    public void addAccountButtonIsClicked() {
        localhostMenu.clickAddAccountBtn();
        //Thread.sleep(1000);
    }

    @Then("^Name input is visible$")
    public void nameInputIsVisible() {
        boolean isVisible = localhostMenu.isAccountNameInputVisible();
        Assert.assertEquals(isVisible, true);
    }

    @But("^Create Account button should not be visible$")
    public void createAccountButtonShouldNotBeVisible() {
        boolean isVisible = localhostMenu.isAccountCreateBtnVisible();
        Assert.assertEquals(isVisible, false);
    }
}
