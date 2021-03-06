package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class JanelaCadastroController {

    @FXML
    private Label lblCadastrar;

    @FXML
    void ajudaOnAction(ActionEvent event) {

    }

    @FXML
    void cadastrarPacienteOnAction(ActionEvent event) throws IOException{

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/CadastroPaciente.fxml"));
		Scene scene = new Scene(parent);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.hide();
		stage.setScene(scene);
		stage.show();

    }

    @FXML
    void cadastrarFuncionarioOnAction(ActionEvent event) {

    }

    @FXML
    void cadastrarOrcamentoOnAction(ActionEvent event) {

    }

    @FXML
    void cadastrarServicoOnAction(ActionEvent event) {

    }

    @FXML
    void cadastrarVisitaOnAction(ActionEvent event) {

    }

    @FXML private javafx.scene.control.Button sairButton;

    @FXML
    void sairOnAction(ActionEvent event) {

        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException{

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaPrincipal.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();

    }

}
