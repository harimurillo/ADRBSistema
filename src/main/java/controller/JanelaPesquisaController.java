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

public class JanelaPesquisaController {

    @FXML
    private Label lblPesquisa;

    @FXML
    void ajudaOnAction(ActionEvent event) {

    }

    @FXML
    void pesquisarPacienteOnAction(ActionEvent event) throws IOException{
    	
    	 Parent parent = FXMLLoader.load(getClass().getResource("/view/PesquisaPaciente.fxml"));
         Scene scene = new Scene(parent);
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         stage.hide();
         stage.setScene(scene);
         stage.show();

    }

    @FXML
    void pesquisarFuncionarioOnAction(ActionEvent event) {

    }

    @FXML
    void pesquisarOrcamentoOnAction(ActionEvent event) {

    }

    @FXML
    void pesquisarServicoOnAction(ActionEvent event) {

    }

    @FXML
    void pesquisarVisitaOnAction(ActionEvent event) {

    }

    @FXML private javafx.scene.control.Button sairButton;

    @FXML
    void sairOnAction(ActionEvent event) {

        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void voltarOnAction(ActionEvent event) throws IOException {

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/JanelaPrincipal.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();

    }

}
