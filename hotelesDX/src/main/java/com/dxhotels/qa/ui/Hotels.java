package com.dxhotels.qa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Hotels {

    public static final Target PRICE = Target.
            the("Price").locatedBy("//*[@class='current-hotels']/*[{0}]//*[@class='rate-number']");

    public static final Target HOTELS_DETAILS = Target.
            the("Details").locatedBy("//*[@class='current-hotels']/*");

    public static final Target BEST_PRICE = Target.
            the("Btn Valor {0}").locatedBy("//*[@class='current-hotels']//*[contains(text(),'{0}')]/ancestor::div[3]//*[@class='dx-button-content']");
    public static final Target TOTAL_PAY = Target.
            the("{0}").locatedBy("//h4[@class='total-price']");
}
