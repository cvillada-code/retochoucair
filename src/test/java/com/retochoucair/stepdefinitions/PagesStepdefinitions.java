package com.retochoucair.stepdefinitions;

import com.retochoucair.exceptions.AssertionPages;
import com.retochoucair.questions.pages.ThePage;
import com.retochoucair.tasks.pages.AccessPages;
import com.retochoucair.tasks.pages.AddPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.is;

public class PagesStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor carlos = Actor.named("Carlos");

    @Before
    public void InitialConfiguration() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Yo Ingreso a la opcion de page$")
    public void yoIngresoALaOpcionDePage() {
        carlos.attemptsTo(AccessPages.option());
    }


    @When("^Yo publico un nuevo page$")
    public void yoPublicoUnNuevoPage() {
        carlos.attemptsTo(AddPage.publish());
    }

    @Then("^Verifico que se haya creado el page$")
    public void verificoQueSeHayaCreadoElPage() {
        carlos.should(GivenWhenThen.seeThat(ThePage.creation(), is(true))
                .orComplainWith(AssertionPages.class, AssertionPages.NOFOUNDELEMENT));
    }

}
