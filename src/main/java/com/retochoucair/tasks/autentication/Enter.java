package com.retochoucair.tasks.autentication;

import com.retochoucair.userinterfaces.AutenticationPageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Enter implements Task{
	
	private AutenticationPageObject autenticationPageObject;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(autenticationPageObject));
	}
	
	public static Enter toOpenSourcesCms() {
		return instrumented(Enter.class);
	}

}
