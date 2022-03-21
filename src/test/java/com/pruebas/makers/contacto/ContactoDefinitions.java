package com.pruebas.makers.contacto;

import java.util.Map;

import com.pruebas.makers.utils.AccionesObjetos;

import com.pruebas.makers.contacto.ContactoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ContactoDefinitions {
	AccionesObjetos accionesObjetos;
	
	@Steps
	ContactoSteps contactoSteps;

	@Given("^la siguiente url \"([^\"]*)\"$")
	public void laSiguienteUrl(String arg1) {
		accionesObjetos.abrirUrl();
	}


	@When("^hacemos clic en el enlace de \"([^\"]*)\"$")
	public void hacemosClicEnElEnlaceDe(String arg1) {
		contactoSteps.ingresoContacto();
	}

	@Then("^capturar el numero de celular de servicio al cliente$")
	public void capturarElNumeroDeCelularDeServicioAlCliente() {
		contactoSteps.capturarElNumeroDeCelularDeServicioAlCliente();
	}

	@Then("^llenar el formulario \"([^\"]*)\" y en el campo mensaje adjuntar el numero de celular capturado$")
	public void llenarElFormularioYEnElCampoMensajeAdjuntarElNumeroDeCelularCapturado(String arg1) {
		contactoSteps.llenarElFormulario();

	}

	@Then("^antes de hacer clic en el boton \"([^\"]*)\" tomar un pantallazo con la informacion diligenciada$")
	public void antesDeHacerClicEnElBotonTomarUnPantallazoConLaInformacionDiligenciada(String arg1) {
		contactoSteps.hacerClicEnElBoton();
	}


}
