
package cr.ac.ufidelitas.proyectoed.estudiocaso2;


public class NodoT <T> {
    
    private T dato;
    private NodoT <T> hijoIzq,hijoDer;

    public NodoT(T dato) {
        this.dato = dato;
        this.hijoIzq = this.hijoDer = null;
    }

    public T getDato() {
        return dato;
    }

    public NodoT<T> getHijoIzq() {
        return hijoIzq;
    }

    public NodoT<T> getHijoDer() {
        return hijoDer;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijoIzq(NodoT<T> hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public void setHijoDer(NodoT<T> hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
    
}
