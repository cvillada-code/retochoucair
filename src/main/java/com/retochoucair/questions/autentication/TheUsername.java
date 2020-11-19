package com.retochoucair.questions.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.retochoucair.userinterfaces.AutenticationPageObject.LABEL_VALIDATE_LOGIN;

public class TheUsername implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LABEL_VALIDATE_LOGIN).viewedBy(actor).asString();
    }

    public static TheUsername is() {
        return new TheUsername();
    }

}
