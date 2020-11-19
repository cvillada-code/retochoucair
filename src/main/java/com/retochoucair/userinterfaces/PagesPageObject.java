package com.retochoucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagesPageObject extends PageObject {

    public static final Target LINK_PAGES = Target.the("Link pages page")
            .located(By.xpath("//ul[@id='adminmenu']/li[5]"));

    public static final Target BUTTON_NEW_PAGE = Target.the("Button add new page")
            .located(By.xpath("//div[@class='wrap']//a[contains(text(), 'Add New')]"));

    public static final Target TEXTAREA_NEW_PAGE = Target.the("Textarea for new post")
            .located(By.id("post-title-0"));

    public static final Target BUTTON_PUBLISH_PAGE = Target.the("Button publish post")
            .located(By.xpath("//div[@class='edit-post-header__settings']//button[contains(text(), 'Publish')]"));

    public static final Target BUTTON_PUBLISH_PAGE_CONFIRM = Target.the("Button confirm publish post")
            .located(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']//button[contains(text(), 'Publish')]"));

    public static final Target BUTTON_CLOSE_MESSAGE_PAGE = Target.the("Button close message popup")
            .located(By.xpath("//button[@aria-label='Disable tips']"));

    public static final Target LINK_PAGE_SUCCESS = Target.the("Link view page success")
            .located(By.xpath("//div[@class='components-notice is-success is-dismissible']//a"));

    public static final Target LABEL_NEW_PAGE = Target.the("Label new page")
            .located(By.xpath("//h1"));

}
