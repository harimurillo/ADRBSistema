package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroPacienteController {

    @FXML
    private Label lblNome;

    @FXML
    private TextField txtBoxNome;

    @FXML
    private Label lblEndereco;

    @FXML
    private TextField txtBoxEndereco;

    @FXML
    private Label lblDataNascimento;
    
    @FXML
    void dtPickerOnAction(ActionEvent event) {

    }
    
    @FXML
    private DatePicker txtDtPicker;

    @FXML
    private Label lblTelefone;

    @FXML
    private TextField txtBoxTelefone;

    @FXML
    private Label lblBairro;

    @FXML
    private ComboBox<?> cbBoxBairro;

    @FXML
    private Label lblCpf;

    @FXML
    private TextField txtBoxCpf;

    @FXML
    private Label lblRg;

    @FXML
    private TextField txtBoxRg;

    @FXML
    private Label lblCadastrarPaciente;

    @FXML
    void ajudaOnAction(ActionEvent event) {

    }

    @FXML
    void limparOnAction(ActionEvent event) {
    	
    	txtBoxNome.clear();
    	txtBoxEndereco.clear();
    	txtBoxTelefone.clear();
    	txtDtPicker.getEditor().clear();
    	cbBoxBairro.setValue(null);
    	txtBoxCpf.clear();
    	txtBoxRg.clear();

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException{

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaCadastro.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();

    }

}
