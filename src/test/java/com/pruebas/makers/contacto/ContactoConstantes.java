package com.pruebas.makers.contacto;

public class ContactoConstantes {
	public ContactoConstantes() {
		
	}
	private final String Title_Contacto = "Contacto | Makers";
	private final String Nombre_Contacto = "Julian Alejandro";
	private final String Apellido_Contacto = "Ortiz Medina";
	private final String Email_Contacto = "juaortizme@unal.edu.co";
	private final String Mensaje_Contacto = "I want to be a maker";
	private String Celular_Contacto = "";
	

	public String getTitle_Contacto() {
		return Title_Contacto;
	}
	public String getNombre_Contacto() {
		return Nombre_Contacto;
	}
	public String getApellido_Contacto() {
		return Apellido_Contacto;
	}
	public String getEmail_Contacto() {
		return Email_Contacto;
	}
	public String getMensaje_Contacto() {
		return Mensaje_Contacto;
	}
	public String getCelular_Contacto() {
		return Celular_Contacto;
	}
	public void setCelular_Contacto(String celContacto) {
		Celular_Contacto = celContacto;
	}



}
