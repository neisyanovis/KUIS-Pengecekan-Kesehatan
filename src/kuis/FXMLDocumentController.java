/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {
    
    String nama1;
    @FXML
    Label tinggi1, beratbadan1, Ideal;
    int tmp;
    
    @FXML
    private Label nama;

    @FXML
    private Label tinggi;

    private Label beratbadan;

    @FXML
    private Label gender;

    @FXML
    private RadioButton laki;

    @FXML
    private RadioButton perempuan;

    @FXML
    private Button proses;

    @FXML
    private Button reset;
 @FXML
    void proses(ActionEvent event) {
        int Ideal =0;
        String saran1 = " ";
        String analisa = " ";
        String nama1 = nama.getText();
        int tinggi1 = Integer.parseInt(tinggi.getText());
        int beratbadan1 = Integer.parseInt(beratbadan.getText());
        
        if(laki.isSelected()){
        Ideal = tinggi1 - 105;
        if(Ideal == beratbadan1){
            analisa = "Anda Ideal";
            saran1 = "Saran : \n Alhamdulillah";
        }else if(Ideal < beratbadan1){
            analisa = "Overweight";
            saran1 = "Saran : \n1. Makan yang bergizi \n2.Jangan sering tidur setelah makan";
        }else if(Ideal > beratbadan1){
            analisa = "Underweight";
            saran1 ="Saran : \n1. Makan yang banyak \n2. Banyakin tidur ";
        }
        }if(perempuan.isSelected()){
            Ideal = tinggi1 - 110;
           if(Ideal == beratbadan1){
               analisa = "Anda Ideal :)";
               saran1 = "Alhamdulillah";
           } else if(Ideal > beratbadan1){
               analisa = "Underweight";
               saran1 = "Saran : \n1. Makan yang banyak dan bergizi \n2. Jangan banyak makan hati(galau)";
           }else if(Ideal < beratbadan1){
               analisa = "Overweight";
               saran1 = "Saran : \n1. Jangan galau \n2. Atur pola makan \n Olahraga teratur";
           }
        }
        ideal.setText(""+Ideal);
        hasil.setText("Nama: "+nama+"\nTinggi: "+tinggi+"\nBerat Badan: "+beratbadan+"\nAnalisa: "+hasil);
        saran.setText(saran1);
    }

    @FXML
    void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        beratbadan.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
    }
    @FXML
    private TextField ideal;

    @FXML
    private TextField hasil;

    @FXML
    private TextField saran;
    private Label label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
