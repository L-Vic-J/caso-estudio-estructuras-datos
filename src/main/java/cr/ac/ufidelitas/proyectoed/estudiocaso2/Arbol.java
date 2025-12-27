
package cr.ac.ufidelitas.proyectoed.estudiocaso2;


public class Arbol <T> {
    
    NodoT <Libro> raiz;
    StringBuilder sb= new StringBuilder();

    public Arbol() {
        this.raiz = null;
    }
    
    
    public void inserta (Libro libro){
        
        insertaRecursivo (libro,raiz);
        
    }
    
    private void insertaRecursivo (Libro dato,NodoT <Libro> nodo ){
        
        
        if (raiz==null){
            raiz=new NodoT<>(dato);
        }else{
             if (nodo.getDato().compareToIndice(dato)>0){
            if (nodo.getHijoIzq()==null){
                nodo.setHijoIzq(new NodoT<>(dato));
            }else{
                insertaRecursivo (dato,nodo.getHijoIzq() );
            }
            
        }else{
            if (nodo.getHijoDer()==null){
                nodo.setHijoDer(new NodoT<>(dato));
            }else{
                insertaRecursivo (dato,nodo.getHijoDer() );
            }
        }
        
       
        }

    }
    
    
    
    public boolean buscarLibro (String indice){
        
        boolean fueEncontrado= buscarLibroRecursivo(indice, raiz);
        return fueEncontrado;
    }
    
    
    
    private boolean buscarLibroRecursivo (String indice,NodoT <Libro> nodo ){
        
        
        if (nodo==null){
            return false;
        }else{
            
          if (buscarLibroRecursivo(indice,nodo.getHijoIzq())){
              return true;
          }
          
          if (nodo.getDato().getIndice().equalsIgnoreCase(indice)){
              return true;
          }
          
          return buscarLibroRecursivo (indice,nodo.getHijoDer());
              
          
          
       
        }
        

        
        
    }
    
    
    public int nivelLibro (String indice){
        
        int nivel= nivelLibroRecursivo(indice, raiz, 0);
        return nivel;
        
    }
    
    
    private int nivelLibroRecursivo (String indice,NodoT <Libro> nodo, int nivel ){
        
        if (nodo==null){
            return -1;
        }else{
            if (nodo.getDato().getIndice().equalsIgnoreCase(indice)){
                return nivel;
            }
            
            int nivelIzquierdo=nivelLibroRecursivo (indice,nodo.getHijoIzq(),nivel+1 );
            
            if (nivelIzquierdo!=-1){
                return nivelIzquierdo;
            }
              return nivelLibroRecursivo (indice,nodo.getHijoDer(),nivel+1 );
        }
              
    }

    
    public String toString (){
        
       String inOrder= toStringRecursivo(raiz);
       return inOrder;
        
    }
    
    
    
    
 
    private String toStringRecursivo(NodoT <Libro> nodo) {
        if (nodo==null){
            return "";
        }else{
            
            
            toStringRecursivo(nodo.getHijoIzq());
            sb.append(nodo.getDato().toString()).append("+");
            toStringRecursivo(nodo.getHijoDer());
            
            
            return sb.toString();
            
            
        }
    }
    
    

    
    
}
