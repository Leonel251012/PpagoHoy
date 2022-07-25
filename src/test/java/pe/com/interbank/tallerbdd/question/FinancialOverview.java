package pe.com.interbank.tallerbdd.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import pe.com.interbank.tallerbdd.page.FinancialData;

public class FinancialOverview {



    public static Question<String> creditAvailable() {
        return actor -> TextContent.of(FinancialData.CREDIT_AVAILABLE)
                .viewedBy(actor).asString().trim();
    }
}
