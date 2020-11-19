package com.retochoucair.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.retochoucair.userinterfaces.AutenticationPageObject.*;

public class Autenticate implements Task {

    private String usuario;
    private String clave;

    public Autenticate(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.usuario).into(TEXTBOX_USER));
        actor.attemptsTo(Enter.theValue(this.clave).into(TEXTBOX_PASS));
        actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }

    public static Autenticate inThePlatform(String usuario, String clave) {
        return new Autenticate(usuario, clave);
    }
}
