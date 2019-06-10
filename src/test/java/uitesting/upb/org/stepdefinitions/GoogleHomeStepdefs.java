package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.managepage.nasa.NasaHome;

public class GoogleHomeStepdefs {
    private NasaHome home;
    @Given("^google page is loaded$")
    public void googlePageIsLoaded() throws Throwable {
        home = LoadPage.loadNasaHome();
        System.out.println("Porceso ejecutado");
    }

}
