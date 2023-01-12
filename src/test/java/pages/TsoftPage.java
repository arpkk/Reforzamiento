package pages;

import driverConfig.DriverContext;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MetodosGenericos;

public class TsoftPage {

    private WebDriver driver;

    private static final Logger log = LoggerFactory.getLogger(TsoftPage.class);

    public TsoftPage(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    // xpath ADNTsoft
    @FindBy(xpath = "(//a[text()=\"ADN TSOFT\"])[1]") WebElement btnADNTsoft;

    @FindBy (xpath = "(//a[text()=\"SOLUCIONES\"])[1]") WebElement btnSoluciones;

    @FindBy (xpath = "//span[text()=\"#VALORES\"]") WebElement txtValoresTsoft;


    public void clickNav(String nav){
        switch (nav) {
            case "ADNTsoft":
                btnADNTsoft.click();
                break;
            case "Contacto":
                break;
            case "Soluciones":
                btnSoluciones.click();
                MetodosGenericos.esperar(10);
                break;

            default:
                System.out.println("la opcion "+ nav + " no está contolada por el switch");
        }
    }

    public void validarUrl(String url){
        String urlActual = DriverContext.getDriver().getCurrentUrl();
        Assertions.assertEquals(url, urlActual);
    }

    public void navegarHasta(String seccion){
        String textoValoresTsoft = txtValoresTsoft.getText();
        System.out.println(textoValoresTsoft);
        Assertions.assertEquals(seccion, textoValoresTsoft);
    }








}
