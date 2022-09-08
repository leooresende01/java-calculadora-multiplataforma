package tk.leooresende01.calculadora.ui.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalculadoraCenaUtil {
	private static final Double JANELA_LARGURA = 350.0;
	private static final Double JANELA_ALTURA = 500.0;
	private static final String ICONE_LAUNCHER = "/icon.png";

	public static void definirCena(String fxmlLocation, Scene cena) {
		try {
			Parent load = FXMLLoader.load(CalculadoraCenaUtil.class.getResource(fxmlLocation));
			cena.setRoot(load);
			Stage palco = (Stage) cena.getWindow();
			palco.setResizable(false);
			palco.setWidth(JANELA_LARGURA);
			palco.setHeight(JANELA_ALTURA);
			palco.getIcons().add(new Image(CalculadoraCenaUtil.class.getResourceAsStream(ICONE_LAUNCHER)));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
