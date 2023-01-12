package steps;

import driverConfig.DriverContext;
import io.cucumber.java.en.Given;
import util.MetodosGenericos;

import static constants.Constant.URL_TSOFT;
import static org.junit.Assert.assertEquals;

public class BackgroundTsoft {
    @Given("Ingresar a la pagina de tsoft")
    public void ingresarALaPaginaDeTsoft() {
        DriverContext.getDriver().navigate().to(URL_TSOFT);
        MetodosGenericos.esperar(2);
        String url = DriverContext.getDriver().getCurrentUrl();
        assertEquals(URL_TSOFT, url);
    }

}
