package tk.leooresende01.calculadora.ui.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraUtil {
	private static final Double JANELA_LARGURA = 325.0;
	private static final Double JANELA_ALTURA = 450.0;

	public static void definirCena(String fxmlLocation, Scene cena) {
		try {
			Parent load = FXMLLoader.load(CalculadoraUtil.class.getResource(fxmlLocation));
			cena.setRoot(load);
			Stage palco = (Stage) cena.getWindow();
			palco.setResizable(false);
			palco.setWidth(CalculadoraUtil.JANELA_LARGURA);
			palco.setHeight(CalculadoraUtil.JANELA_ALTURA);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
