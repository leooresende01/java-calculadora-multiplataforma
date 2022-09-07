package tk.leooresende01.calculadora.ui.util;

import javafx.scene.control.Label;

public class CalculadoraServiceUtil {
	
	public static void verificarSeEhZero(Label label) {
		if(label.getText().equals("0")) label.setText("");;
	}

	public static boolean verificarSePassouDoLimite(Label resultado) {
		if (resultado.getText().length() > 8) return true;
		return false;
	}
}
