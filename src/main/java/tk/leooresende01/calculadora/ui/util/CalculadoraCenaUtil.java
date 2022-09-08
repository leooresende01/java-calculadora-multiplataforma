package tk.leooresende01.calculadora.ui.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraCenaUtil {
	private static final Double JANELA_LARGURA = 350.0;
	private static final Double JANELA_ALTURA = 500.0;

	public static void definirCena(String fxmlLocation, Scene cena) {
		try {
			Parent load = FXMLLoader.load(CalculadoraCenaUtil.class.getResource(fxmlLocation));
			cena.setRoot(load);
			Stage palco = (Stage) cena.getWindow();
			palco.setResizable(false);
			palco.setWidth(JANELA_LARGURA);
			palco.setHeight(JANELA_ALTURA);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
