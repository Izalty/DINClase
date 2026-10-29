package com.mycompany.teoria;

import Models.Aula;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SecondaryController {

    @FXML
    private Button secondaryButton;
    @FXML
    private TableView<Aula> tvAulas;
    @FXML
    private TableColumn<Aula, Integer> tcMaxAlumnos;
    @FXML
    private TableColumn<Aula, String> tcNombre;
    @FXML
    private TableColumn<Aula, String> tcLugar;

    @FXML
    private void initialize() {
        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tcLugar.setCellValueFactory(new PropertyValueFactory<>("lugar"));
        tcMaxAlumnos.setCellValueFactory(new PropertyValueFactory<>("maxAlumnosDos"));

        tvAulas.setItems(Aula.getAulas());
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}