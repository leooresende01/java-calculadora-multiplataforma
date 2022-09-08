package tk.leooresende01.calculadora.infra.service;

import java.math.BigDecimal;
import java.util.stream.Stream;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tk.leooresende01.calculadora.ui.util.CalculadoraServiceUtil;

public class CalculadoraService {

	private Label resultado;
	private Label operador;
	private BigDecimal valor1;
	private BigDecimal valor2;
	private Label valorQueVaiSerCalculado;
	private boolean isAfterResult;

	public CalculadoraService(Label resultado, Label operador, Label valorQueVaiSerCalculado) {
		this.resultado = resultado;
		this.operador = operador;
		this.valorQueVaiSerCalculado = valorQueVaiSerCalculado;
	}

	public void definirEventoDosBotoesNumerais(Button... botoesNumerais) {
		Stream.of(botoesNumerais).forEach(button -> this.adicionarEventoAoBotaoNumeral(button));
	}

	private void adicionarEventoAoBotaoNumeral(Button button) {
		button.setOnAction(event -> this.adicionarNumeroAoCalculo(button.getText()));
	}

	private void adicionarNumeroAoCalculo(String text) {
		CalculadoraServiceUtil.verificarSeEhZero(this.resultado);
		if (this.isAfterResult) {
			this.resultado.setText("");
			this.isAfterResult = false;
		}
		if (!CalculadoraServiceUtil.verificarSePassouDoLimite(this.resultado))
			this.resultado.setText(this.resultado.getText() + text);
	}

	public void definirEventoDoBotaoDeApagar(Button apagar) {
		apagar.setOnAction(event -> {
			String text = this.resultado.getText();
			this.resultado.setText(text.substring(0, text.length() - 1));
			if (this.resultado.getText().length() == 0)
				this.resultado.setText("0");

		});
	}

	public void definirEventoAosBotoesOperadores(Button... botoesOperadores) {
		Stream.of(botoesOperadores).forEach(button -> this.definirEventosAoBotaoOperador(button));
	}

	private void definirEventosAoBotaoOperador(Button button) {
		button.setOnAction(event -> {
			String text = this.resultado.getText().replace("e", "");
			if (this.valor1 != null || text.equals("0")) return;
			this.operador.setText(button.getText());
			this.valor1 = new BigDecimal(text);				
			this.valorQueVaiSerCalculado.setText(text);
			this.resultado.setText("0");
		});
	}

	public void definirEventoDeCalcular(Button calcular) {
		calcular.setOnAction(event -> {
			this.valor2 = new BigDecimal(this.resultado.getText().replace("e", ""));
			if (CalculadoraServiceUtil.verificaSeOValorDosResultadosEhNulo(this.valor1, this.valor2)) {				
				this.valor2 = new BigDecimal(this.resultado.getText());
				String resultado = CalculadoraServiceUtil.calculaOResultado(this.valor1, this.valor2, this.operador.getText());
				if (resultado.length() > 12) resultado = resultado.substring(0, 11) + "e";
				this.resultado.setText(resultado);
				this.zerarTodosOsValores();
			}
		});
	}

	public void definirEventoDeResetarCalculo(Button resetarCalculos) {
		resetarCalculos.setOnAction(event -> {
			this.zerarTodosOsValores();
			this.resultado.setText("0");
		});
	}
	
	private void zerarTodosOsValores() {
		this.isAfterResult = true;
		this.operador.setText("");
		this.valorQueVaiSerCalculado.setText("");
		this.valor1 = null;
		this.valor2 = null;
	}
}
