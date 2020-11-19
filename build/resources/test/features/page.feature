#Author: Carlos Villada
@Regression
Feature: Como usuario de la plataforma, requiero crear pages en la plataforma y validar escenarios alternos

  Background: Diligenciamiento exitoso del formulario de autenticación, no se presenta ningún mensaje de validación.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con usuario "opensourcecms" y clave "opensourcecms"
    Then Verifico ingreso exitoso con usuario "opensourcecms"

  @CreacionPagesExitoso
  Scenario: Creación de page de manera exitosa
    Given Yo Ingreso a la opcion de page
    When Yo publico un nuevo page
    Then Verifico que se haya creado el page
