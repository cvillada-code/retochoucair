package com.retochoucair.questions.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.assertj.core.api.SoftAssertions;
import static com.retochoucair.userinterfaces.PagesPageObject.LABEL_NEW_PAGE;

public class ThePage implements Question<Boolean> {

    private SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;
        if(LABEL_NEW_PAGE.resolveFor(actor).isPresent()){
            flag = true;
            validate.assertThat(Text.of(LABEL_NEW_PAGE).viewedBy(actor).asString()).isEqualTo("PRUEBA PAGE");
            validate.assertAll();
        }
        return flag;
    }

    public static ThePage creation() {
        return new ThePage();
    }
}
