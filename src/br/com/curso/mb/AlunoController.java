/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 */
package br.com.curso.mb;

import br.com.curso.model.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Pedro
 */
public class AlunoController implements Initializable {
    
    @FXML
    private TextField nomea;
    
    @FXML
    public void cadastro(ActionEvent event){
    Aluno a = new Aluno ();
    a.setNome(nomea.getText());
        System.out.println(a.getNome());
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
