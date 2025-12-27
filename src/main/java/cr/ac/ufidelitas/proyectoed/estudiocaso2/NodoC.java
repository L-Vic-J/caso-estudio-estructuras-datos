
package cr.ac.ufidelitas.proyectoed.estudiocaso2;

public class NodoC {
    
    private Evaluacion dato;
    private NodoC next,back;

    public NodoC(Evaluacion dato) {
        this.dato = dato;
        this.next = this.back = null;
    }

    public Evaluacion getDato() {
        return dato;
    }

    public NodoC getNext() {
        return next;
    }

    public NodoC getBack() {
        return back;
    }

    public void setDato(Evaluacion dato) {
        this.dato = dato;
    }

    public void setNext(NodoC next) {
        this.next = next;
    }

    public void setBack(NodoC back) {
        this.back = back;
    }
    
    
    
    
}
