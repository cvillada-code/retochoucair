package com.retochoucair.tasks.posts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.retochoucair.userinterfaces.PostsPageObject.*;

public class AddPost implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEW_POSTS));
        actor.attemptsTo(Enter.theValue("Prueba").into(TEXTAREA_NEW_POST));
        actor.attemptsTo(Click.on(BUTTON_PUBLISH_POST));
        actor.attemptsTo(Click.on(BUTTON_PUBLISH_POST_CONFIRM));
        actor.attemptsTo(Click.on(BUTTON_CLOSE_MESSAGE));
        actor.attemptsTo(Click.on(LINK_POST_SUCCESS));
    }

    public static AddPost publish() {
        return new AddPost();
    }

}
