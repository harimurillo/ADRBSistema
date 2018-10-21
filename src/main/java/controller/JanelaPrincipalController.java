package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JanelaPrincipalController {
	
	@FXML
	private BorderPane pnlRaiz;

	private Stage stage;

	public void setStage(Stage stage) {
		this.stage = stage;
	}

    @FXML
    void cadastroCargoOnAction(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/view/CadastroCargo.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("ADRB - Cadastro de Cargos");
  }

    @FXML
    void cadastroFuncionarioOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/view/CadastroFuncionario.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("Projeto Final - Cadastro de Funcionarios");

    }

    @FXML
    void cadastroPacienteOnAction(ActionEvent event) {

    }

    @FXML
    void pesquisaPacienteOnAction(ActionEvent event) {

    }

}