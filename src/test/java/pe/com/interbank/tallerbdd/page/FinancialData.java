package pe.com.interbank.tallerbdd.page;

import org.openqa.selenium.By;

public class FinancialData {
    public static final By CREDIT_AVAILABLE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
}
