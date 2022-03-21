#Author: Julian Alejandro Ortiz Medina
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Pruebas
Feature: Segundo escenario - Manejo de selenium
  I want to use this template for my feature file
  
  @Prueba1
  

  @Prueba2
  Scenario: Title of your scenario
    Given la siguiente url "https://somosmakers.co/"
    When hacemos clic en el enlace de "CONTACTO"
    Then capturar el numero de celular de servicio al cliente
    And llenar el formulario "dejanos un mensaje" y en el campo mensaje adjuntar el numero de celular capturado
    And antes de hacer clic en el boton "enviar mensaje" tomar un pantallazo con la informacion diligenciada
    
    

