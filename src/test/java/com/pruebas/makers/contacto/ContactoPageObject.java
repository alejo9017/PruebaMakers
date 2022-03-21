package com.pruebas.makers.contacto;


import com.pruebas.makers.utils.AccionesObjetos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class ContactoPageObject extends PageObject{
	public ContactoPageObject() {
		
	}
	
	ContactoUi contactoUi = new ContactoUi();
	AccionesObjetos accionesObjetos = new AccionesObjetos(); 

	public void clickBotonContacto() {
		accionesObjetos.clickElementoWeb(contactoUi.getLblContacto());
		
	}

	public String obtenerCelularServicioAlCliente() {
		return accionesObjetos.obtenerTextoWeb(contactoUi.getTxtCelular());
	}

	public void ingresarElNombre(String nombre_Contacto) {
		accionesObjetos.escribirTextoWeb(contactoUi.getInpNombre(),nombre_Contacto);
		
	}
	public void ingresarElApellido(String apellido_Contacto) {
		accionesObjetos.escribirTextoWeb(contactoUi.getInpApellido(),apellido_Contacto);
		
	}
	public void ingresarElEmail(String email_Contacto) {
		accionesObjetos.escribirTextoWeb(contactoUi.getInpEmail(),email_Contacto);
		
	}
	public void ingresarElCelular(String celular_Contacto) {
		accionesObjetos.escribirTextoWeb(contactoUi.getInpCelular(),celular_Contacto);
		
	}
	public void ingresarElMensaje(String mensaje_Contacto) {
		accionesObjetos.escribirTextoWeb(contactoUi.getInpMensaje(),mensaje_Contacto);
		
	}

	public void hacerClicEnElBoton() {
		accionesObjetos.clickElementoWeb(contactoUi.getBtnEnviarMensaje());
		
	}

}
