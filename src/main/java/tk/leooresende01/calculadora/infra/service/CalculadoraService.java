package tk.leooresende01.calculadora.infra.service;

import java.util.stream.Stream;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tk.leooresende01.calculadora.ui.util.CalculadoraServiceUtil;

public class CalculadoraService {

	private Label resultado;
	private Label operador;

	public CalculadoraService(Label resultado, Label operador) {
		this.resultado = resultado;
		this.operador = operador;
	}

	public void definirEventoDosBotoesNumerais(Button... botoes) {
		Stream.of(botoes).forEach(button -> this.adicionarEventoAoBotao(button));
	}

	private void adicionarEventoAoBotao(Button button) {
		button.setOnAction(event -> this.adicionarNumeroAoCalculo(button.getText()));
	}

	private void adicionarNumeroAoCalculo(String text) {
		CalculadoraServiceUtil.verificarSeEhZero(this.resultado);
		if(!CalculadoraServiceUtil.verificarSePassouDoLimite(this.resultado)) this.resultado.setText(this.resultado.getText() + text);
	}

	public void definirEventoDosBotaoDeApagar(Button apagar) {
		apagar.setOnAction(event -> {
			String text = this.resultado.getText();
			this.resultado.setText(text.substring(0, text.length() - 1));
			if(this.resultado.getText().length() == 0) this.resultado.setText("0");
	
		});
	}
	
}
