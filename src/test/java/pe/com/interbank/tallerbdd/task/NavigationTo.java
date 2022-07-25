package pe.com.interbank.tallerbdd.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pe.com.interbank.tallerbdd.page.ApplicationLogin;

public class NavigationTo {

    public static Performable theApplicacionLoginPage() {
        return Task.where("Abre la pagina de login",
                Open.browserOn().the(ApplicationLogin.class));
    }
}
