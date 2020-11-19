package com.retochoucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PostsPageObject extends PageObject {

    public static final Target LINK_POSTS = Target.the("Link posts page")
            .located(By.xpath("//ul[@id='adminmenu']/li[3]"));

    public static final Target BUTTON_NEW_POSTS = Target.the("Button add new post")
            .located(By.xpath("//div[@class='wrap']//a[contains(text(), 'Add New')]"));

    public static final Target TEXTAREA_NEW_POST = Target.the("Textarea for new post")
            .located(By.id("post-title-0"));

    public static final Target BUTTON_PUBLISH_POST = Target.the("Button publish post")
            .located(By.xpath("//div[@class='edit-post-header__settings']//button[contains(text(), 'Publish')]"));

    public static final Target BUTTON_PUBLISH_POST_CONFIRM = Target.the("Button confirm publish post")
            .located(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']//button[contains(text(), 'Publish')]"));

    public static final Target BUTTON_CLOSE_MESSAGE = Target.the("Button close message popup")
            .located(By.xpath("//button[@aria-label='Disable tips']"));

    public static final Target LINK_POST_SUCCESS = Target.the("Link view post success")
            .located(By.xpath("//div[@class='components-notice is-success is-dismissible']//a"));

    public static final Target LABEL_NEW_POST = Target.the("Label new post")
            .located(By.xpath("//h1"));

}
