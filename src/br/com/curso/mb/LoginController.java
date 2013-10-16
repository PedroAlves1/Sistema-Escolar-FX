/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.mb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pedro
 */
public class LoginController {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField logina;
    
    @FXML
    private PasswordField senhaa;
    
    @FXML
    private Text logintextoa;
    
    @FXML
    public void entrar(ActionEvent event) throws IOException {
        if(logina.getText().equals("login") && senhaa.getText().equals("senha123")){
            
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/br/com/curso/view/cadastro_aluno.fxml"));
        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.show();
        }
        else{
            logintextoa.setText("Erro, Usuário ou Senha Incorretos. Tente novamente. \n O cadastro somente pode ser feito com um usuário permitido.");
        }
        }
    
}
