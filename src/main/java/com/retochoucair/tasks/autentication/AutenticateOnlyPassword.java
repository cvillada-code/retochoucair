package com.retochoucair.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.retochoucair.userinterfaces.AutenticationPageObject.*;

public class AutenticateOnlyPassword implements Task {

    private String clave;

    public AutenticateOnlyPassword(String clave) {
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(this.clave).into(TEXTBOX_PASS));
        actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }


    public static AutenticateOnlyPassword inThePlatform(String clave) {
            return new AutenticateOnlyPassword(clave);
    }
}
