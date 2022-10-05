package com.petstore.swagger.io.test.stepdefinitions;

import java.util.Map;

import com.petstore.swagger.io.test.steps.CrearUsuarioStep;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class CrearUsuarioStepDefinition {
	@Steps
	CrearUsuarioStep crearusuariostep;

	
	@Cuando("^sebastian envia informacion para crear un usuario al servicio \"([^\"]*)\"$")
	public void sebastianEnviaInformacionParaCrearUnUsuarioAlServicio(String url, Map<String,String> cuerpo) {
		// cuerpo del servicio y url de donde se envia 
		crearusuariostep.enviarOperacionCrearUsuario(url, cuerpo);
	   
	
	}

	@Entonces("^valide que el codigo status sea (\\d+)$")
	public void valideQueElCodigoStatusSea(int status) {
		// validacion estatus 200
		crearusuariostep.validarStatusDelServicio(status);
	}
	


}
