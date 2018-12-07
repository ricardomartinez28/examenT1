package application.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

/**
 * @author Ricardo martinez
 *  Only one controller for the app
 */
public class Controller {
	

	@FXML
	private Stage primaryStage;
	
	public void asignarVentanas(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}
	
	public void cerrarApp() {
		System.exit(0);
	}

	@FXML
	public void cambiarVentana() {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("GetMe.fxml"));
		
		AnchorPane ventana2;
		try {
			ventana2 = loader.load();
			primaryStage.setScene(new Scene(ventana2));
			Scene scene = new Scene(ventana2);

			// adding Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Gamja+Flower");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
