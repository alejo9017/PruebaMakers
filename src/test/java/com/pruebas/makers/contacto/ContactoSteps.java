package com.pruebas.makers.contacto;

import java.util.Map;

import org.junit.Assert;

import com.pruebas.makers.utils.AccionesObjetos;



import com.pruebas.makers.utils.AccionesObjetos;
import com.pruebas.makers.contacto.ContactoConstantes;
import com.pruebas.makers.contacto.ContactoPageObject;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class ContactoSteps {
	ContactoPageObject contactoPageObject;
	ContactoConstantes contactoConstantes = new ContactoConstantes();
	AccionesObjetos accionesObjetosWeb;
	
	
	
	public void ingresoContacto() {
		contactoPageObject.clickBotonContacto();
		
	}



	public void capturarElNumeroDeCelularDeServicioAlCliente() {
		contactoConstantes.setCelular_Contacto(contactoPageObject.obtenerCelularServicioAlCliente());
		
	}



	public void llenarElFormulario() {
		contactoPageObject.ingresarElNombre(contactoConstantes.getNombre_Contacto());
		contactoPageObject.ingresarElApellido(contactoConstantes.getApellido_Contacto());
		contactoPageObject.ingresarElEmail(contactoConstantes.getEmail_Contacto());
		contactoPageObject.ingresarElCelular(contactoConstantes.getCelular_Contacto());
		contactoPageObject.ingresarElMensaje(contactoConstantes.getMensaje_Contacto());
		
		
		
	}



	public void hacerClicEnElBoton() {
		Serenity.takeScreenshot();
		contactoPageObject.hacerClicEnElBoton();
		
	}
	
	
	
	


}
