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

public class JanelaConsultaController {

    @FXML
    private Label lblConsultar;

    @FXML
    void ajudaOnAction(ActionEvent event) {

    }

    @FXML
    void consultarPacienteOnAction(ActionEvent event) {

    }

    @FXML
    void consultarFuncionarioOnAction(ActionEvent event) {

    }

    @FXML
    void consultarOrcamentoOnAction(ActionEvent event) {

    }

    @FXML
    void consultarServicoOnAction(ActionEvent event) {

    }

    @FXML
    void consultarVisitaOnAction(ActionEvent event) {

    }

    @FXML private javafx.scene.control.Button sairButton;

    @FXML
    void sairOnAction(ActionEvent event) {

        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException {

        Parent janelaPrincipalParent = FXMLLoader.load(getClass().getResource("/view/JanelaPrincipal.fxml"));
        Scene janelaPrincipalScene = new Scene(janelaPrincipalParent);
        Stage janelaPrincipalStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        janelaPrincipalStage.hide();
        janelaPrincipalStage.setScene(janelaPrincipalScene);
        janelaPrincipalStage.show();

    }

}
