package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PesquisaPacienteController {
	
    @FXML
    private Label lblPesquisarPaciente;

    @FXML
    private Label lblNome;

    @FXML
    private TextField txtBoxNome;

    @FXML
    private Label lblTelefone;

    @FXML
    private TextField txtBoxTelefone;

    @FXML
    private ScrollBar scrollPaciente;

    @FXML
    private TableView<?> tbviewPaciente;

    @FXML
    void ajudaOnAction(ActionEvent event) {

    }

    @FXML
    void limparOnAction(ActionEvent event) {

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException {
    	
    	Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaPesquisa.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();

    }

}
