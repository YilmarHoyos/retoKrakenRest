package com.petstore.swagger.io.test.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/petstore/swagger/io/test/features/CrearUsuario.feature",
glue="com.petstore.swagger.io.test.stepdefinitions",
snippets=SnippetType.CAMELCASE)
public class CrearUsuarioRunner {

}
