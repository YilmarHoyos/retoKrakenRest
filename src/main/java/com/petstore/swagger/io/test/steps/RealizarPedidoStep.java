package com.petstore.swagger.io.test.steps;

import java.util.Map;

import com.sqasa.rest.demo.utils.KrakenRest;

import net.thucydides.core.annotations.Step;

public class RealizarPedidoStep {

	@Step
	public void enviarOperacionRealizarPedido(String url, Map<String,String>cuerpo) {//se implementa el Map para que tome los datos desde el feature
		KrakenRest.inicializarRequest();// inicializa para crear un nuevo request
		KrakenRest.configurarHeaders(cuerpo);// se implementa para validar que es un formato tipo Json que se trae desde el feature
		KrakenRest.configurarCuerpo(cuerpo);//toma los datos del Map del feature  ya sea string y valores
		KrakenRest.hacerPost(url);//toma el dato String que posee la URL donde está el servicio
	}
		
	@Step
	public void validarStatusDelServicioDeRealizarpedido(int status) {
		KrakenRest.compararStatus(status);//valida el objeto tipo int de la respuesta esperada del servicio
	}

}
