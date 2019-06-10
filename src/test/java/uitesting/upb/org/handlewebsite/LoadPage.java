package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.managepage.localhost.Menu;
import uitesting.upb.org.managepage.nasa.NasaHome;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static NasaHome loadNasaHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new NasaHome();
    }

    public static Menu loadHostMenu() {
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getHostURL());
        return new Menu();
    }
    public static void main(String[] args) throws InterruptedException {
        loadHostMenu().addAccount();
    }
}
