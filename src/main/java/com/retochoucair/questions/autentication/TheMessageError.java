package com.retochoucair.questions.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.assertj.core.api.SoftAssertions;

import static com.retochoucair.userinterfaces.AutenticationPageObject.LABEL_MESSAGE_ERROR;

public class TheMessageError implements Question<Boolean> {

    private SoftAssertions validate = new SoftAssertions();
    private String mensaje;

    public TheMessageError(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;
        if(LABEL_MESSAGE_ERROR.resolveFor(actor).isPresent()){
            flag = true;
            validate.assertThat(Text.of(LABEL_MESSAGE_ERROR).viewedBy(actor).asString()).isEqualTo(this.mensaje);
            validate.assertAll();
        }
        return flag;
    }

    public static TheMessageError isExpected(String mensaje) {
        return new TheMessageError(mensaje);
    }
}
