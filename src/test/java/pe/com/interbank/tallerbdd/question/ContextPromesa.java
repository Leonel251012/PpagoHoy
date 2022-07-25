package pe.com.interbank.tallerbdd.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import pe.com.interbank.tallerbdd.page.Promesap;

public class ContextPromesa {


    public static <T> Question<String> promesah() {
            return actor -> TextContent.of(Promesap.COD_PROMESA).viewedBy(actor).asString();

    }
}
