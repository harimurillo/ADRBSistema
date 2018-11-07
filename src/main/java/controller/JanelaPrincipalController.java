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

		Parent janelaCadastroParent = FXMLLoader.load(getClass().getResource("/view/JanelaCadastro.fxml"));
		Scene janelaCadastroScene = new Scene(janelaCadastroParent);
		Stage janelaCadastroStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		janelaCadastroStage.hide();
		janelaCadastroStage.setScene(janelaCadastroScene);
		janelaCadastroStage.show();

	}

	@FXML
	void consultarOnAction(ActionEvent event) throws IOException {

		Parent janelaConsultaParent = FXMLLoader.load(getClass().getResource("/view/JanelaConsulta.fxml"));
		Scene janelaConsultaScene = new Scene(janelaConsultaParent);
		Stage janelaConsultaStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		janelaConsultaStage.hide();
		janelaConsultaStage.setScene(janelaConsultaScene);
		janelaConsultaStage.show();

	}

	@FXML
	void sairOnAction(ActionEvent event) {

	}

}