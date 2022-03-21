package com.pruebas.makers.contacto;

public class ContactoUi {
	private final String TIPO_XPATH = "xpath";
	private final String TIPO_ID = "id";
	private final String TIPO_CSS_SELECTOR = "cssSelector";
	
	private final String [] lblContacto = {TIPO_XPATH,"//*[@id=\"menu-principal\"]/li[5]"};
	private final String [] txtCelular= {TIPO_XPATH,"//*[@id=\"post-211\"]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/p/span[3]/a"};
	private final String [] inpNombre = {TIPO_ID,"et_pb_contact_first_0"};
	private final String [] inpApellido = {TIPO_ID,"et_pb_contact_last_0"};
	private final String [] inpEmail = {TIPO_XPATH,"//*[@id=\"et_pb_contact_email_0\"]"};
	private final String [] inpCelular = {TIPO_XPATH,"//*[@id=\"et_pb_contact_phone_0\"]"};
	private final String [] inpMensaje = {TIPO_XPATH,"//*[@id=\"et_pb_contact_message_0\"]"};
	private final String [] btnEnviarMensaje = {TIPO_XPATH,"//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button"};
	
	
	
	public String[] getLblContacto() {
		return lblContacto;
	}
	public String[] getTxtCelular() {
		return txtCelular;
	}
	
	public String[] getInpNombre() {
		return inpNombre;
	}
	public String[] getInpApellido() {
		return inpApellido;
	}
	public String[] getInpEmail() {
		return inpEmail;
	}
	public String[] getInpCelular() {
		return inpCelular;
	}
	public String[] getInpMensaje() {
		return inpMensaje;
	}
	public String[] getBtnEnviarMensaje() {
		return btnEnviarMensaje;
	}
	
	



}
