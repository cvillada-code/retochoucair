package com.retochoucair.questions.posts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.assertj.core.api.SoftAssertions;
import static com.retochoucair.userinterfaces.PostsPageObject.LABEL_NEW_POST;

public class ThePost implements Question<Boolean> {

    private SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;
        if(LABEL_NEW_POST.resolveFor(actor).isPresent()){
            flag = true;
            validate.assertThat(Text.of(LABEL_NEW_POST).viewedBy(actor).asString()).isEqualTo("Prueba");
            validate.assertAll();
        }
        return flag;
    }

    public static ThePost creation() {
        return new ThePost();
    }
}
