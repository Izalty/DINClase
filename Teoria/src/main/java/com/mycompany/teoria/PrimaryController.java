package com.mycompany.teoria;

import Models.Asignatura;
import Models.Aula;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class PrimaryController {

    @FXML
    private Label lbl1;
    @FXML
    private Button primaryButton;
    @FXML
    private Button primaryButton2;
    @FXML
    private ComboBox<Asignatura> CBenum;

    private static final Logger LOGGER = Logger.getLogger(PrimaryController.class.getName());
    
    //método único que se lanza en cuanto la ventana carta todos los objetos
    @FXML
    private void initialize() {
    
        lbl1.setText("Prueba");
        
        primaryButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                lbl1.setText("Normal");
            }
            
        });
        
        primaryButton.setOnAction(event -> {lbl1.setText("Flecha");});
        
        primaryButton2.setOnAction(this::handleTextChanged);
        
        CBenum.setItems(FXCollections.observableArrayList(Asignatura.values()));
        
        try {
            Aula a = new Aula(20, "Aula DAM 1", "A002");
            LOGGER.info("Empleado creado: " + a.getNombre());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al crear el empleado", e);
            new Alert(Alert.AlertType.ERROR, "No se pudo guardar el empleado").showAndWait();
        }
        
    }
    
    private void handleTextChanged(ActionEvent event) {
        lbl1.setText("método");
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
