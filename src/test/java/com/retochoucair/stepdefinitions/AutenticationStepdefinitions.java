package com.retochoucair.stepdefinitions;

import com.retochoucair.exceptions.AssertionAutentication;
import com.retochoucair.questions.autentication.TheMessageError;
import com.retochoucair.questions.autentication.TheUsername;
import com.retochoucair.tasks.autentication.Autenticate;
import com.retochoucair.tasks.autentication.AutenticateOnlyPassword;
import com.retochoucair.tasks.autentication.AutenticateOnlyUser;
import com.retochoucair.tasks.autentication.Enter;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.*;

public class AutenticationStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor carlos = Actor.named("Carlos");

    @Before
    public void InitialConfiguration() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Ingreso a la plataforma  opensourcecms$")
    public void ingreso_a_la_plataforma_opensourcecms() {
        carlos.wasAbleTo(Enter.toOpenSourcesCms());
    }


    @When("^Me autentico con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void me_autentico_con_usuario_y_clave(String usuario, String clave) {
        carlos.attemptsTo(Autenticate.inThePlatform(usuario, clave));
    }

    @Then("^Verifico ingreso exitoso con usuario \"([^\"]*)\"$")
    public void verificoIngresoExitosoConUsuario(String usuario) {
        carlos.should(GivenWhenThen.seeThat(TheUsername.is(), equalTo(usuario))
                .orComplainWith(AssertionAutentication.class, AssertionAutentication.NOFOUNDELEMENT));
    }

    @Then("^Verifico mensaje de error \"([^\"]*)\"$")
    public void verificoMensajeDeError(String mensaje) {
        carlos.should(GivenWhenThen.seeThat(TheMessageError.isExpected(mensaje), is(true))
                .orComplainWith(AssertionAutentication.class, AssertionAutentication.NOFOUNDMESSAGEERROR));
    }

    @When("^Me autentico con clave \"([^\"]*)\"$")
    public void meAutenticoConClave(String clave) {
        carlos.attemptsTo(AutenticateOnlyPassword.inThePlatform(clave));
    }

    @When("^Me autentico con usuario \"([^\"]*)\"$")
    public void meAutenticoConUsuario(String usuario) {
        carlos.attemptsTo(AutenticateOnlyUser.inThePlatform(usuario));

    }

}
