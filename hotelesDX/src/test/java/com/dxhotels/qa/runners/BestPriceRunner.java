package com.dxhotels.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/findBestPrice.feature",
        glue = "com.dxhotels.qa.steps", snippets = SnippetType.CAMELCASE)
public class BestPriceRunner {
}
