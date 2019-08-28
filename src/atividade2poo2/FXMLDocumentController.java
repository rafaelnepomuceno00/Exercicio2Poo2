/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2poo2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private RadioButton jumanji;
    @FXML
    private ToggleGroup Radiofilme;
    @FXML
    private RadioButton Titanic;
    @FXML
    private RadioButton Nenhum;
    @FXML
    private TextArea textarea;
    @FXML
    private Label label1;
    @FXML
    private CheckBox Acao;
    @FXML
    private CheckBox Romance;
    @FXML
    private CheckBox Comedia;
    @FXML
    private CheckBox terror;
    @FXML
    private Label label11;
    @FXML
    private Label labelfinal;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String Info = "Filmes que gosta: ";
        if (Acao.isSelected()){
        Info += Acao.getText()+" | ";}
    
    if (Romance.isSelected()){
        Info += Romance.getText()+" | ";
            
    }
    if (Comedia.isSelected()){
        Info += Comedia.getText()+" | ";
            
    }
      
    if (terror.isSelected()){
        Info += terror.getText()+" | ";
    }
     
    
    
    if (jumanji.isSelected()){
        Info += "\n Gostaria de ver: "+ jumanji.getText();
    
    }
    
    if (Nenhum.isSelected()){
        Info += "\n Gostaria de ver: " + Nenhum.getText();
            
    }
    if (Titanic.isSelected()){
        Info += "\n Gostaria de ver: " + Titanic.getText();
            
    }
      
        Info+=  "\n Opniões: "+ textarea.getText();
    labelfinal.setText("\n"+ Info );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
