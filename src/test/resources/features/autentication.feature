#Author: Carlos Villada
@Regression
Feature: Como usuario de la plataforma, requiero validar la autenticación, tambien de algunos escenarios alternos

  @AutenticacionExitosa
  Scenario: Diligenciamiento exitoso del formulario de autenticación, no se presenta ningún mensaje de validación.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con usuario "opensourcecms" y clave "opensourcecms"
    Then Verifico ingreso exitoso con usuario "opensourcecms"

  @AutenticacionFallidaConUsuarioRegistrado
  Scenario: Diligenciamiento fallido del formulario de autenticación con usuario registrado y clave invalida, se presenta mensaje de error.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con usuario "opensourcecms" y clave "123456"
    Then Verifico mensaje de error "ERROR: The password you entered for the username opensourcecms is incorrect. Lost your password?"

  @AutenticacionFallidaSinUsuarioRegistrado
  Scenario: Diligenciamiento fallido del formulario de autenticación con usuario no registrado, se presenta mensaje de error.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con usuario "123456" y clave "123456"
    Then Verifico mensaje de error "ERROR: Invalid username. Lost your password?"

  @AutenticacionSinEscribirUsuario
  Scenario: Diligenciamiento del formulario de autenticación sin escribir usuario, se presenta mensaje de error.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con clave "test"
    Then Verifico mensaje de error "ERROR: The username field is empty."

  @AutenticacionSinEscribirClave
  Scenario: Diligenciamiento del formulario de autenticación sin escribir clave, se presenta mensaje de error.
    Given Ingreso a la plataforma  opensourcecms
    When Me autentico con usuario "test"
    Then Verifico mensaje de error "ERROR: The password field is empty."