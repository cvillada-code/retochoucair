package com.retochoucair.stepdefinitions;

import com.retochoucair.exceptions.AssertionPosts;
import com.retochoucair.questions.posts.ThePost;
import com.retochoucair.tasks.posts.AccessPosts;
import com.retochoucair.tasks.posts.AddPost;
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

public class PostsStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor carlos = Actor.named("Carlos");

    @Before
    public void InitialConfiguration() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Yo Ingreso a la opcion de post$")
    public void yoIngresoALaOpcionDePost() {
        carlos.attemptsTo(AccessPosts.option());
    }


    @When("^Yo publico un nuevo post$")
    public void yoPublicoUnNuevoPost() {
        carlos.attemptsTo(AddPost.publish());
    }

    @Then("^Verifico que se haya creado el post$")
    public void verificoQueSeHayaCreadoElPost() {
        carlos.should(GivenWhenThen.seeThat(ThePost.creation(), is(true))
                .orComplainWith(AssertionPosts.class, AssertionPosts.NOFOUNDELEMENT));
    }

}
