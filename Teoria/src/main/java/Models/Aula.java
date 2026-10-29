/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author iandasal
 */
public class Aula {
    
    private int maxAlumnos;
    private String nombre;
    private String lugar;

    public Aula(int maxAlumnos, String nombre, String lugar) {
        this.maxAlumnos = maxAlumnos;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }
    
    public int getMaxAlumnosDos(){
        return maxAlumnos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }
    
    public static ObservableList<Aula> getAulas(){
        ObservableList<Aula> aulas = FXCollections.observableArrayList(
                new Aula(20, "Aula DAM 1", "A002"),
                new Aula(20, "Aula DAM 2", "A003"),
                new Aula(25, "Aula DAW 1", "A101"),
                new Aula(25, "Aula DAW 2", "A102"),
                new Aula(18, "Aula ASIR", "A201"),
                new Aula(30, "Laboratorio de Redes", "A010"),
                new Aula(15, "Aula Ciberseguridad", "A012"),
                new Aula(40, "Salón de Actos", "A001"),
                new Aula(12, "Sala de Reuniones", "A105"),
                new Aula(24, "Aula Polivalente", "A004")
        );
        
        return aulas;
        
    }
    
    
}
