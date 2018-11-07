package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    private TextField txtBoxDataNascimento;

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

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException{

        Parent janelaCadastroParent = FXMLLoader.load(getClass().getResource("/view/JanelaCadastro.fxml"));
        Scene janelaCadastroScene = new Scene(janelaCadastroParent);
        Stage janelaCadastroStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        janelaCadastroStage.hide();
        janelaCadastroStage.setScene(janelaCadastroScene);
        janelaCadastroStage.show();

    }

}
