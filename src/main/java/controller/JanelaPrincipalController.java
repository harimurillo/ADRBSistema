package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class JanelaPrincipalController {

	@FXML
	private ImageView logoImageView;

	@FXML
	void ajudaOnAction(ActionEvent event) {

	}

	@FXML
	void cadastrarOnAction(ActionEvent event) throws IOException {

		Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaCadastro.fxml"));
		Scene scene = new Scene(parent);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.hide();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	void pesquisarOnAction(ActionEvent event) throws IOException {

		Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaPesquisa.fxml"));
		Scene scene = new Scene(parent);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.hide();
		stage.setScene(scene);
		stage.show();

	}
	
	@FXML private javafx.scene.control.Button sairButton;

	@FXML
	void sairOnAction(ActionEvent event) {
		
		Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();

	}

}