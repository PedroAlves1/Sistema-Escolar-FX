/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.view;

import br.com.curso.model.Aluno;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Cadastro_aluno extends Application {

    @Override
    public void start(Stage stage) throws IOException  {
         
        Parent root = FXMLLoader.load(getClass().getResource("cadastro_aluno.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();

    }
    
        public static void main(String[] args) {
        launch(args);
    }
}