package application.view;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * @author ricardo martinez;
 * @version 1.0.0
 * 
 */


public class Main extends Application {

	
Controller controlador;
	
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("Profile.fxml"));
		
		try {
			AnchorPane ventana1= loader.load();
			
			controlador = loader.getController();
			controlador.asignarVentanas(primaryStage);
			primaryStage.setScene(new Scene(ventana1));
			primaryStage.show();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
