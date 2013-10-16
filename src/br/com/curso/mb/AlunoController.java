/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 */
package br.com.curso.mb;

import br.com.curso.model.Aluno;
import br.com.curso.model.Endereco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Pedro
 */
public class AlunoController implements Initializable {
        


    @FXML
    private TextField nomea;
    
 //   @FXML
//    private TextField dataa;
    
    @FXML
    private TextField raa;
    
    @FXML
    private TextField sexoa;
    
    @FXML
    private TextField anoa;
    
    @FXML
    private TextField numeroa;
    
    @FXML
    private TextField ruaa;
    
    @FXML
    private TextField bairroa;
    
    @FXML
    private TextField cidadea;
    
    @FXML
    private TextField estadoa;
    
    @FXML
    private TextField cepa;
    
    @FXML
    private TextField numerocasaa;
    
    @FXML
    private TextField paisa;
    
    @FXML
    private TextArea complementoa;    
    
    @FXML
    public void cadastro(ActionEvent event){
    //Aluno
    Aluno nome = new Aluno();
    Aluno ra = new Aluno();
    Aluno sexo = new Aluno();
    Aluno ano = new Aluno();
    Aluno numero = new Aluno();
    //----
    //Endereço
    Endereco rua = new Endereco();
    Endereco bairro = new Endereco();
    Endereco cidade = new Endereco();
    Endereco estado = new Endereco();
    Endereco cep = new Endereco();
    Endereco numerocasa = new Endereco();
    Endereco pais = new Endereco();
    Endereco complemento = new Endereco();
    //-----
    //Aluno
    nome.setNome(nomea.getText());
    ra.setRa(raa.getText());
    sexo.setSexo(sexoa.getText());
    ano.setAnoLetivo(anoa.getText());
    numero.setNumero(numeroa.getText());
        //sout
        System.out.println(nome.getNome());   
        System.out.println(ra.getRa());
        System.out.println(sexo.getSexo());   
        System.out.println(ano.getAnoLetivo());
        System.out.println(numero.getNumero());
     //------
    //Endereço
    rua.setRua(ruaa.getText());
    bairro.setBairro(bairroa.getText());
    cidade.setCidade(cidadea.getText());
    estado.setEstado(estadoa.getText());
    cep.setCep(cepa.getText());
    numerocasa.setNumero(numerocasaa.getText());
    pais.setPais(paisa.getText());
    complemento.setComplemento(complementoa.getText());
        //sout
        System.out.println(rua.getRua());
        System.out.println(bairro.getBairro());
        System.out.println(cidade.getCidade());
        System.out.println(estado.getEstado());
        System.out.println(cep.getCep());
        System.out.println(numerocasa.getNumero());
        System.out.println(pais.getPais());
        System.out.println(complemento.getComplemento());
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
