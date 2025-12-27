
package cr.ac.ufidelitas.proyectoed.estudiocaso2;

import java.util.Objects;


public class Evaluacion implements Comparable<Evaluacion> {
    
    
    private String nombre;
    private String apellidos;
    private String materia;
    private int carnet;
    private int nota;

    
    
    public Evaluacion(String nombre, String apellidos,int nota, int carnet) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.materia = "Estructuras de Datos";
        this.carnet = carnet;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMateria() {
        return materia;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getNota() {
        return nota;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Evaluacion:" + "Nombre=" + nombre + ",Apellidos=" + apellidos + ",Materia=" + materia + ",Carnet=" + carnet + ",Nota=" + nota;
    }

    @Override
    public int compareTo(Evaluacion evaluacion) {
        
        return Integer.compare(evaluacion.getCarnet(),this.carnet);
        
    }
    
    public int compareToNombre(Evaluacion evaluacion) {
        
        return this.nombre.compareTo(evaluacion.getNombre());
        
    }

       public int compareToApellido(Evaluacion evaluacion) {
        
        return evaluacion.getApellidos().compareTo(this.apellidos);
        
    }
   

    
    
    
    
}
