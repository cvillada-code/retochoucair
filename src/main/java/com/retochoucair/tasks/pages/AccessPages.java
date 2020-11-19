package com.retochoucair.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.retochoucair.userinterfaces.PagesPageObject.LINK_PAGES;

public class AccessPages implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PAGES));
    }

    public static AccessPages option() {
        return new AccessPages();
    }
}
