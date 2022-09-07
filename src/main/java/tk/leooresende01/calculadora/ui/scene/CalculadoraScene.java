package tk.leooresende01.calculadora.ui.scene;

import com.gluonhq.charm.glisten.application.MobileApplication;

import javafx.scene.Scene;
import tk.leooresende01.calculadora.ui.util.CalculadoraUtil;

public class CalculadoraScene extends MobileApplication {
	private static final String FXML_LOCATION = "/fxml/calculadora.fxml";

	public static void inicio(String args[]) {
		launch(args);
	}

	@Override
	public void postInit(Scene scene) {
		CalculadoraUtil.definirCena(CalculadoraScene.FXML_LOCATION, scene);
	}
}
