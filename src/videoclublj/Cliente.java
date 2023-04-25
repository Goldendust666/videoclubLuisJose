/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoclublj;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String apellidos;
    private ArrayList alquilada;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String apellidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean alquilada(Pelicula pelicula){
        if(alquilada.contains(pelicula)){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void listadoPeliculasAlquiladas(){
        System.out.println("Películas alquiladas:");
        for(Object pelicula:alquilada){
            System.out.println("pelicula.getTitulo");
        }
    }
    
}

