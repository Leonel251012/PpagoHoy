package pe.com.interbank.tallerbdd.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.xpath.operations.String;
import pe.com.interbank.tallerbdd.page.LoginForm;

public class LoginWith implements Task {

    private String ambiente;
    private String bot;
    private String identificador;

    //Constructor


    public LoginWith(String ambiente, String bot, String identificador) {
        this.ambiente = ambiente;
        this.bot = bot;
        this.identificador = identificador;
    }

    public static Performable credentials(String ambiente, String bot, String identificador) {
        return Tasks.instrumented(LoginWith.class, ambiente, bot,identificador);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        //Logica de acciones con la interfaz.
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(java.lang.String.valueOf(ambiente)).from(LoginForm.AMBIENTE_FIELD),
                SelectFromOptions.byVisibleText(java.lang.String.valueOf(bot)).from(LoginForm.BOT_FIELD),
                Clear.field(LoginForm.IDENTIFICADOR_FIELD),
                Enter.theValue((CharSequence) identificador).into(LoginForm.IDENTIFICADOR_FIELD),
                Clear.field(LoginForm.START_FIELD),
                Enter.theValue("hola").into(LoginForm.START_FIELD),


                Click.on(LoginForm.BUTTON_ENVIAR)

        );



    }
}
