$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/autentication.feformatterformatter{
  "name{
  "name": "Como usuario de la plataforma, requiero validar la autenticación, tambien de algunos escenarios alternos",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Diligenciamiento exitoso del formulario de autenticación, no se presenta ningún mensaje de validación.",
  "description": "",
  "keyword": "Scformatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso a la plataforma  opensourcecms",
  "keyword": "Given "
});
fformatter.match({
  "location": "AutenticationStepdefinitions.ingreso_a_la_plataforma_opensourcecms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Me autentico con usuario \"opensourcecms\" y clave \"opensourcecms\"",
  "keyword": "When "
});fformatter.match({
  "location": "AutenticationStepdefinitions.me_autentico_con_usuario_y_clave(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico ingreso exitoso con usuario \"opensourcecms\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutenticationStepdefinitions.verificoIngresoExitosoConUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creación de post de manera exitosa",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@CreacionPostsExitosa"
    }
  ]
});
formatter.step({
  "name": "Yo Ingreso a la opcion de post",
  "keyword": "Given "
});fformatter.match({
  "location": "PostsStepdefinitions.yoIngresoALaOpcionDePost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Yo publico un nuevo post",
  "keyword": "When "
});fformatter.match({
  "location": "PostsStepdefinitions.yoPublicoUnNuevoPost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico que se haya creado el post",
  "keyword": "Then "
});fformatter.match({
  "location": "PostsStepdefinitions.verificoQueSeHayaCreadoElPost()"
});
formatter.result({
  "status": "passed"
});}});on usuario \"opensourcecms\" y clave \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutenticationStepdefinitions.me_autentico_con_usuario_y_clave(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico mensaje de error \"ERROR: The password you entered for the username opensourcecms is incorrect. Lost your password?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutenticationStepdefinitions.verificoMensajeDeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Diligenciamiento fallido del formulario de autenticación con usuario no registrado, se presenta mensaje de error.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@AutenticacionFallidaSinUsuarioRegistrado"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso a la plataforma  opensourcecms",
  "keyword": "Given "
});
formatter.match({
  "location": "AutenticationStepdefinitions.ingreso_a_la_plataforma_opensourcecms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Me autentico con usuario \"123456\" y clave \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutenticationStepdefinitions.me_autentico_con_usuario_y_clave(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico mensaje de error \"ERROR: Invalid username. Lost your password?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutenticationStepdefinitions.verificoMensajeDeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Diligenciamiento del formulario de autenticación sin escribir usuario, se presenta mensaje de error.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@AutenticacionSinEscribirUsuario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso a la plataforma  opensourcecms",
  "keyword": "Given "
});
formatter.match({
  "location": "AutenticationStepdefinitions.ingreso_a_la_plataforma_opensourcecms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Me autentico con clave \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutenticationStepdefinitions.meAutenticoConClave(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico mensaje de error \"ERROR: The username field is empty.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutenticationStepdefinitions.verificoMensajeDeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Diligenciamiento del formulario de autenticación sin escribir clave, se presenta mensaje de error.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@AutenticacionSinEscribirClave"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso a la plataforma  opensourcecms",
  "keyword": "Given "
});
formatter.match({
  "location": "AutenticationStepdefinitions.ingreso_a_la_plataforma_opensourcecms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Me autentico con usuario \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutenticationStepdefinitions.meAutenticoConUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico mensaje de error \"ERROR: The password field is empty.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutenticationStepdefinitions.verificoMensajeDeError(String)"
});
formatter.result({
  "status": "passed"
});
});