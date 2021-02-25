/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etidades;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class Huesped {
    private String nombre_apellido;
    private int telefono;
    private String nacionalidad;
    private int n_documento;
    private String sexo;

    public Huesped(String nombre_apellido, int telefono, String nacionalidad, int n_documento,String sexo) {
        this.nombre_apellido = nombre_apellido;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
        this.n_documento = n_documento;
        this.sexo = sexo;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getN_documento() {
        return n_documento;
    }

    public void setN_documento(int n_documento) {
        this.n_documento = n_documento;
    }
    
    
}
