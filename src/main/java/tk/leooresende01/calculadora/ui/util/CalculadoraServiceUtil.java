package tk.leooresende01.calculadora.ui.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javafx.scene.control.Label;

public class CalculadoraServiceUtil {
	
	public static void verificarSeEhZero(Label label) {
		if(label.getText().equals("0")) label.setText("");;
	}

	public static boolean verificarSePassouDoLimite(Label resultado) {
		if (resultado.getText().length() > 8) return true;
		return false;
	}

	public static boolean verificaSeOValorDosResultadosEhNulo(BigDecimal valor1, BigDecimal valor2) {
		if(valor1 == null || valor2 == null) return false;
		return true;
	}

	public static String calculaOResultado(BigDecimal valor1, BigDecimal valor2, String operador) {
		if (operador.equals("+")) return valor1.add(valor2).toString();
		if (operador.equals("x")) return valor1.multiply(valor2).toString();
		if (operador.equals("-")) return valor1.subtract(valor2).toString();
		if (operador.equals("/")) return valor1.divide(valor2, 2, RoundingMode.HALF_UP).toString();
		return "0";
	}
}
