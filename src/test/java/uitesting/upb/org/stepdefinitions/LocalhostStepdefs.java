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
        boolean navVisible = localhostMenu.isNavDrawerBtnVisible();
        Assert.assertTrue(navVisible);
    }

    @Then("^Navbar button is clicked$")
    public void navbarButtonIsClicked() {
        localhostMenu.clickNavDrawerBtn();
    }

    @And("^Add account button should be visible$")
    public void addAccountButtonShouldBeVisible() {
        boolean accVisible = localhostMenu.isNavDrawerBtnVisible();
        Assert.assertTrue(accVisible);
    }
}
