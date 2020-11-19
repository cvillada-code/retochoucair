package com.retochoucair.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.retochoucair.userinterfaces.AutenticationPageObject.*;

public class AutenticateOnlyUser implements Task {

    private String usuario;

    public AutenticateOnlyUser(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(this.usuario).into(TEXTBOX_USER));
        actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }


    public static AutenticateOnlyUser inThePlatform(String usuario) {
            return new AutenticateOnlyUser(usuario);
    }
}
