package pe.com.interbank.tallerbdd.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.com.interbank.tallerbdd.page.LoginForm;

public class PromesaPago implements Task {

    public static Performable waitTime() {
        Integer wait = 3000;
        return Task.where("{0} uses thread sleep", (actor) -> {
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static Performable realizarpromesapago() {
        return Tasks.instrumented(PromesaPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Logica de acciones con la interfaz.
        actor.attemptsTo(
                Clear.field(LoginForm.START_FIELD),
                Enter.theValue("a").into(LoginForm.START_FIELD),
                Click.on(LoginForm.BUTTON_ENVIAR),
                PromesaPago.waitTime()
               /* Clear.field(LoginForm.START_FIELD),
                Enter.theValue("1234").into(LoginForm.START_FIELD),
                Click.on(LoginForm.BUTTON_ENVIAR),
                PromesaPago.waitTime(),
                Enter.theValue("c").into(LoginForm.START_FIELD),
                Click.on(LoginForm.BUTTON_ENVIAR),
                PromesaPago.waitTime(),
                Enter.theValue("b").into(LoginForm.START_FIELD),
                Click.on(LoginForm.BUTTON_ENVIAR),
                PromesaPago.waitTime(),
                Enter.theValue("a").into(LoginForm.START_FIELD),
                Click.on(LoginForm.BUTTON_ENVIAR),
                PromesaPago.waitTime()*/

        );



    }




}