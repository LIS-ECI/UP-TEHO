package com.pcvpmo.pdsw.upteho.entities;

import java.io.Serializable;

/**
 * Una clase simple que representa una Asignatura en la Unidad de Proyectos y sus detalles
 * @author Juan Camilo Mantilla
 */
public class Asignatura implements Serializable {
    private int id;
    private String nombre;
    private Programa programa;

    public Asignatura() {
    }
    
    public Asignatura(int id, String nombre, Programa programa){
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
    }
    public int getId(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Programa getPrograma(){
        return this.programa;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setPrograma(Programa progId){
        this.programa = progId;
    }
    
}
