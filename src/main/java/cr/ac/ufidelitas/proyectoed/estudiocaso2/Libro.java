
package cr.ac.ufidelitas.proyectoed.estudiocaso2;


public class Libro implements Comparable {
    
    private String indice;
    private String nombre;
    private String genero;
    private int estante;

    public Libro(String indice, String nombre, String genero, int estante) {
        this.indice = indice;
        this.nombre = nombre;
        this.genero = genero;
        this.estante = estante;
    }

    public String getIndice() {
        return indice;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEstante() {
        return estante;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    @Override
    public String toString() {
        return "Libro:" + "Indice=" + indice + ",Nombre=" + nombre + ",Genero=" + genero + ",Estante=" + estante;
    }

 
    public int compareToIndice(Libro libro) {
        return this.indice.compareTo(libro.getIndice());
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
