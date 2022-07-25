package pe.com.interbank.tallerbdd.definition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.xpath.operations.String;
import pe.com.interbank.tallerbdd.question.ContextPromesa;
import pe.com.interbank.tallerbdd.task.LoginWith;
import pe.com.interbank.tallerbdd.task.NavigationTo;
import pe.com.interbank.tallerbdd.task.PromesaPago;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class Pphoy {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Ingreso al AVI Watcher con los datos {string} ,{string}, {string}")
    public void ingreso_al_AVI_Watcher_con_los_datos(String ambiente, String bot, String identificador) throws InterruptedException {
        theActorCalled("avi").attemptsTo(NavigationTo.theApplicacionLoginPage()); //acción que va realizar el actor
        theActorCalled("avi").attemptsTo (LoginWith.credentials(ambiente, bot,identificador));
        Thread.sleep(3000);
    }

    @When("Cliente realiza una promesa de pago - hoy")
    public void cliente_realiza_una_promesa_de_pago_hoy() throws InterruptedException {
       // theActorInTheSpotlight().attemptsTo (LoginWith.credentials(username, password,ambiente));
        theActorInTheSpotlight().attemptsTo (PromesaPago.realizarpromesapago());
        Thread.sleep(3000);
    }

    @Then("Se valida que se genere el codigo de resultado PP")
    public void se_valida_que_se_genere_el_codigo_de_resultado_PP() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        //theActorInTheSpotlight().should(
                //seeThat("Se muestra el codigo PP",
                        //ContextPromesa.promesah(), equalTo("PP"));




    }

    /*@Given("{string} has an active account")
    public void has_an_active_account(String actor) {
        theActorCalled(actor).attemptsTo(NavigationTo.theApplicacionLoginPage());
    }

    @When("he sends their valid {string} and {string} and {string}")
    public void he_sends_their_valid_and(String username, String password, String ambiente) {
        theActorInTheSpotlight().attemptsTo (LoginWith.credentials(username, password,ambiente));
    }

    @Then("he should have access to manage his account.")
    public void he_should_have_access_to_manage_his_account() {
        theActorInTheSpotlight().should(
                seeThat("Se muestra el credito disponible",
                        FinancialOverview.creditAvailable(), equalTo("$17,800"))
        );
*/






}
