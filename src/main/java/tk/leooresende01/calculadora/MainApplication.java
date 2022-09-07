package tk.leooresende01.calculadora;

import com.gluonhq.charm.glisten.application.MobileApplication;

import tk.leooresende01.calculadora.ui.scene.CalculadoraScene;

public class MainApplication extends MobileApplication {

	public static void main(String args[]) {
		CalculadoraScene.inicio(args);
	}
}
