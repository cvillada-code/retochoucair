package com.retochoucair.tasks.posts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.retochoucair.userinterfaces.PostsPageObject.LINK_POSTS;

public class AccessPosts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_POSTS));
    }

    public static AccessPosts option() {
        return new AccessPosts();
    }
}
