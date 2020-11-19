package com.retochoucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://s1.demo.opensourcecms.com/wordpress/wp-login.php")
public class AutenticationPageObject extends PageObject {

    public static final Target TEXTBOX_USER = Target.the("Campo de texto usuario")
            .located(By.id("user_login"));
    public static final Target TEXTBOX_PASS = Target.the("Campo de texto contraseña")
            .located(By.id("user_pass"));
    public static final Target BUTTON_LOGIN = Target.the("Button make to login")
            .located(By.id("wp-submit"));
    public static final Target LABEL_VALIDATE_LOGIN = Target.the("Label for validate login success")
            .located(By.xpath("//ul[contains(@id, 'wp-admin-bar-root-default')]//li[3]//a[contains(@aria-haspopup, 'true')]"));
    public static final Target LABEL_MESSAGE_ERROR = Target.the("Label login failed")
            .located(By.id("login_error"));

}
