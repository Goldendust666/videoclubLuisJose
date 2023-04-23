/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoclublj;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    public int codigo;
    public String titulo;
    public String director;

    public Pelicula() {
    }

    public Pelicula(int codigo, String titulo, String director) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", titulo=" + titulo + ", director=" + director + '}';
    }
    

}
