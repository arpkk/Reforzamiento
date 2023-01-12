package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TsoftContactoPage;
import pages.TsoftPage;

public class Tsoft {

    TsoftPage tsoftPage = new TsoftPage();


    @When("Visualizo el home e ingreso a el apartado de {string}")
    public void visualizoElHomeEIngresoAElApartadoDe(String navGherkin) {
        tsoftPage.validarUrl("https://www.tsoftglobal.com/");
        tsoftPage.clickNav(navGherkin);
    }

    @Then("Visualizo la pagina {string}")
    public void visualizoLaPagina(String url) {
        tsoftPage.validarUrl(url);
    }

    @When("Navego hasta el apartado de {string}")
    public void navegoHastaElApartadoDe(String valores) {
        tsoftPage.navegarHasta(valores);
    }


    @Then("Visualizamos los cinco valores de tsoft")
    public void visualizamosLosCincoValoresDeTsoft() {

    }

}
