package com.pruebas.makers.utils;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pruebas.makers.utils.AccionesObjetos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;


public class AccionesObjetos extends PageObject {
public AccionesObjetos() {
		
	}
	
	private static final Logger LOGGER = Logger.getLogger(AccionesObjetos.class.getName());
   
	public void escribirLog(String texto) {
		LOGGER.info("EscribirLog: "+texto);
	}
	
	public String obtenerTituloPagina() {
		return getDriver().getTitle();
	}
	
    public void abrirUrl() {
    		String expectedTitle = getSerenityProperties("webdriver.title.page");
			openAt(getSerenityProperties("webdriver.base.url"));
			Serenity.getWebdriverManager().getWebdriver().manage().window().maximize();
			Serenity.getWebdriverManager().getWebdriver().manage().deleteAllCookies();
			Serenity.getWebdriverManager().getWebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(obtenerTituloPagina().equals(expectedTitle)) {
				escribirLog("La pagina abrio exitosamente");
			}else {
				escribirLog("La pagina no cargo");
				fail();	
			}
	}
    
    public static String getSerenityProperties(String variable) {
    	EnvironmentVariables environmentVariables=null;
    	String serenityValue = "";
    	try {
        	environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        	serenityValue=environmentVariables.getProperty(variable);
        	LOGGER.info("valor: "+serenityValue);
    	}catch(Exception e) {
    		LOGGER.info("getSerenityProperties");	
    	}
    	return	serenityValue;
    }
    
    public void clickElementoWeb(String[] valores) {
    	WebElement elemento = obtenerElementos(valores);
    	elemento.click();
    }
    
    public String obtenerTextoWeb(String[] valores) {
    	WebElement elemento = obtenerElementos(valores);
    	String texto = elemento.getText();
    	LOGGER.info("texto encontrado:" + texto);
    	return texto;
    }
    
    public void escribirTextoWeb(String[] valores, String texto) {
    	WebElement elemento = obtenerElementos(valores);
    	elemento.sendKeys(texto);
    }
    
    public boolean validarElementoVisible(String[] valores) {
    	boolean estado = false;
    	WebElement elemento = obtenerElementos(valores);
    	if(elemento.isDisplayed()) {
    		estado=true;
    	}
    	return estado;
    }
	
    public WebElement obtenerElementos(String[] dato) {
    	String identificador = dato[0];
    	String valor = dato[1];
    	WebElement element = null;
    	WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        
    	switch (identificador.toLowerCase()) {
			case "id":
					element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(valor)));
				break;
			case "xpath":
					element =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(valor)));
				break;
			case "cssselector":
					element =wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(valor)));
				break;
			default:
				LOGGER.info("obtenerElementos: No se encuentra el tipo de identificador");
		}
    	return element;
    }
    
    public void cambiarFrame() {
    	getDriver().switchTo().frame("onboarding-iframe");
    }
    
    public void restaurarFrame() {
    	getDriver().switchTo().defaultContent();
    }
    
    
    public void tiempoEsperaElemento(String[] valores) {
    	WebElement elemento = obtenerElementos(valores);
		WebDriverWait  wait = new WebDriverWait(getDriver(),5000);
		wait.until(ExpectedConditions.visibilityOf(elemento));
    }
    
    public void tiempoEsperaImplicito(int tiempo) {
  		waitFor(tiempo).seconds();
    }
    
	/**
	 *reemplaza un caracter indicado dentro de un array
	 *
	 * @param path elemento de tipo String[] - array que se quiere reemplazar
	 * @param caracter elemento de tipo String - caracter a buscar 
	 * @param reemplazo caracter elemento de tipo String - caracter de reeemplazo
	 */
	public String[] reemplazarCaracter(String[] path,String caracter, String reemplazo) {
		String[] lblTextos = path;
		String [] identificador =lblTextos.clone();
		identificador [1] = identificador[1].replace(caracter, reemplazo );
		return identificador;
	}
    
}
   
