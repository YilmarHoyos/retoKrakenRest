package com.petstore.swagger.io.test.stepdefinitions;


import java.util.Map;
import com.petstore.swagger.io.test.steps.RealizarPedidoStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
public class RealizarPedidoStepDefinition {
	@Steps
	RealizarPedidoStep realizarpedidostep;

	@Cuando("^sebastian envia informacion para realizar el pedido al servicio \"([^\"]*)\"$")
	public void sebastianEnviaInformacionParaRealizarElPedidoAlServicio(String url, Map<String,String> cuerpo) {
		// cuerpo del servicio y url de donde se envia 
		realizarpedidostep.enviarOperacionRealizarPedido(url, cuerpo);
	}

	@Entonces("^valide que el codigo status del pedido sea (\\d+)$")
	public void valideQueElCodigoStatusDelPedidoSea(int status) {
		// validacion estatus 200
		realizarpedidostep.validarStatusDelServicioDeRealizarpedido(status);
	}

}
