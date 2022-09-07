package tk.leooresende01.calculadora.ui.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CalculadoraUtil {
	
	public static void definirCena(String fxmlLocation, Scene cena) {
		try {
			Parent load = FXMLLoader.load(CalculadoraUtil.class.getResource(fxmlLocation));
			cena.setRoot(load);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
