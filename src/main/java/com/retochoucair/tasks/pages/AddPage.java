package com.retochoucair.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.retochoucair.userinterfaces.PagesPageObject.*;

public class AddPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEW_PAGE));
        actor.attemptsTo(Enter.theValue("Prueba page").into(TEXTAREA_NEW_PAGE));
        actor.attemptsTo(Click.on(BUTTON_PUBLISH_PAGE));
        actor.attemptsTo(Click.on(BUTTON_PUBLISH_PAGE_CONFIRM));
        actor.attemptsTo(Click.on(BUTTON_CLOSE_MESSAGE_PAGE));
        actor.attemptsTo(Click.on(LINK_PAGE_SUCCESS));
    }

    public static AddPage publish() {
        return new AddPage();
    }

}
