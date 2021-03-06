package com.retochoucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/posts.feature",
				 glue="com.retochoucair.stepdefinitions",
		  		 monochrome = true,
				 plugin = {"pretty", "html:target/cucumber"},
				 strict = true,
				 snippets=SnippetType.CAMELCASE)
public class PostsRunner {

}

