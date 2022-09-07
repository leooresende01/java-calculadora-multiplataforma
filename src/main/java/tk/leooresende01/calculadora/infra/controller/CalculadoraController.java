package tk.leooresende01.calculadora.infra.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tk.leooresende01.calculadora.infra.service.CalculadoraService;

public class CalculadoraController implements Initializable {
	@FXML
	private Button um, dois, tres, quatro, 
	cinco, seis, sete, oito, nove, 
	menos, mais, multiplicacao, 
	divisao, apagar, calcular;
	
	@FXML
	private Label operador, resultado;
	
	private CalculadoraService service;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.service = new CalculadoraService(this.resultado, this.operador);
		this.service.definirEventoDosBotoesNumerais(um, dois, tres, quatro, 
				cinco, seis, sete, oito, nove);
		this.service.definirEventoDosBotaoDeApagar(this.apagar);
	}
}