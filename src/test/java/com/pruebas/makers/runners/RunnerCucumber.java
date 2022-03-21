package com.pruebas.makers.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features"
,tags = {"@Prueba2"}
,snippets = SnippetType.CAMELCASE
,glue = "com.pruebas.makers")

public class RunnerCucumber {

}
