package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/view/JanelaPrincipal.fxml"));
		
		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.getIcons().add(new Image(getClass().getResourceAsStream("/image/adrbicone.png")));
		stage.setTitle("Sistema ADRB");
		stage.setWidth(600);
		stage.setHeight(400);
		stage.setResizable(false);
		stage.show();
	}

}