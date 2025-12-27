
package cr.ac.ufidelitas.proyectoed.estudiocaso2;

public class ListaC {
    
    
    private NodoC cabeza,ultimo;

    public ListaC() {
        this.cabeza = this.ultimo =null;
    }
    
    public void Inserta(Evaluacion evaluacion) {

        NodoC nuevoNodo = new NodoC(evaluacion);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
            cabeza.setNext(ultimo);
            ultimo.setBack(cabeza);
        } else {
            if (cabeza.getDato().compareTo(nuevoNodo.getDato()) < 0) {
                nuevoNodo.setNext(cabeza);
                nuevoNodo.setBack(ultimo);
                cabeza.setBack(nuevoNodo);
                ultimo.setNext(nuevoNodo);
                cabeza = nuevoNodo;

           } else if (ultimo.getDato().compareTo(nuevoNodo.getDato()) > 0) {
                nuevoNodo.setNext(cabeza);
                nuevoNodo.setBack(ultimo);
                ultimo.setNext(nuevoNodo);
                cabeza.setBack(nuevoNodo);
                ultimo = nuevoNodo;

            } else {

                NodoC actual = cabeza;

                while (actual.getNext() != cabeza && actual.getDato().compareTo(nuevoNodo.getDato()) > 0) {
                    actual = actual.getNext();
                }
                
                actual.getBack().setNext(nuevoNodo);
                nuevoNodo.setBack(actual.getBack());
                nuevoNodo.setNext(actual);
                actual.setBack(nuevoNodo);

            }
                   
        }
          
    }
    
    
    
    public Evaluacion busquedaID (int id){
        
        NodoC actual= cabeza;
        
        
        do{
            if (actual.getDato().getCarnet()==id){
                Evaluacion evalucion= actual.getDato();
                return evalucion;
            }
               
            
             actual= actual.getNext();
        } while (actual!=cabeza);
           
        
        
     return null;
        
        
        
    }
    
    
    public Evaluacion evaluacionExtrae (int id ){
         NodoC actual= cabeza;
         
          do{
            if (actual.getDato().getCarnet()==id){
                Evaluacion evalucion= actual.getDato();
                actual.getBack().setNext(actual.getNext());
                actual.getNext().setBack(actual.getBack());
                return evalucion;
            }
               
            
             actual= actual.getNext();
         
         
         } while (actual!=cabeza);
           
        
      
        return null;
        
        
    }
    
    public void elimina(int id) {

        NodoC actual = cabeza;
        
        
        do {
            
            if (actual.getDato().getCarnet() == id){
                 actual.getBack().setNext(actual.getNext());
                 actual.getNext().setBack(actual.getBack());
            }
            actual = actual.getNext();
        }    while (actual!= cabeza);
       
            
        }
        
      
    
    
    public void busquedaNombre(String nombre) {

        StringBuilder bd = new StringBuilder();
        NodoC actual = cabeza;

        do {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                bd.append(actual.getDato().toString());
            }

            actual = actual.getNext();

        } while (actual!= cabeza);

        System.out.println(bd.toString());

    }


   
    
        public void busquedaApellidos (String apellido){
        
        StringBuilder bd = new StringBuilder();
        NodoC actual = cabeza;

        do {
            if (actual.getDato().getApellidos().equalsIgnoreCase(apellido)) {
                bd.append(actual.getDato().toString());
            }

            actual = actual.getNext();

        } while (actual!= cabeza);

        System.out.println(bd.toString());

       
    }
    
    public void estadisticas() {

        int totalEvaluaciones=0;
        int totalAprobados=0;
        int totalReprobados = 0;
        double sumaNotasAprobados=0.0;
        double sumaNotas=0.0;
        double promedioAprobadas=0.0;
        double promedioGeneral = 0.0;

        NodoC actual = cabeza;
        
        
        
        do {
             
            totalEvaluaciones++;
            sumaNotas+= actual.getDato().getNota();
            
            if (actual.getDato().getNota()>=70){
                totalAprobados++;
                sumaNotasAprobados+=actual.getDato().getNota();
            }else if (actual.getDato().getNota()<70){
                totalReprobados++;
            }
               
            actual = actual.getNext();
               
        }

        while (actual!= cabeza);
        
        
        promedioAprobadas=sumaNotasAprobados/totalAprobados;
        promedioGeneral= sumaNotas/totalEvaluaciones;
        
        System.out.println("Estadisticas:"+"Total de evaluaciones:"+totalEvaluaciones+",Total de aprobados:"+totalAprobados+",Total de reprobados:"+totalReprobados+",Promedio de notas de los aprobados:"+promedioAprobadas+",Promedio general:"+promedioGeneral);
       
        }
    
    
    
    public String toString (){
        
        NodoC actual = cabeza;
        StringBuilder sb= new StringBuilder();
        
        
        
        do {
            
           sb.append(actual.getDato().toString()).append("--->");
           actual=actual.getNext(); 
            
        } while (actual!= cabeza);
           
        return sb.toString();
        
    }
        
       
    
    
    public ListaC ordenaNombre (){
        
        NodoC actual = cabeza;
       ListaC listaOrdenada= new ListaC();
         
         
         do {
             
            listaOrdenada.listaCopiaNombre(actual);
            
            actual=actual.getNext();
             
         } while (actual!= cabeza);
            
      
        return listaOrdenada;
        
        
    }
    
    public ListaC ordenaApellidos (){
        
        NodoC actual = cabeza;
         ListaC listaOrdenada= new ListaC();
         
         
         do {
             
            listaOrdenada.listaCopiaApellido(actual);
            
            actual=actual.getNext();
             
         } while (actual!= cabeza);
            
      
        return listaOrdenada;
        
    }
    
    
    
    
    public void listaCopiaNombre (NodoC nodo){
        
        
         NodoC nuevoNodo = new NodoC(nodo.getDato());

        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
            cabeza.setNext(ultimo);
            ultimo.setBack(cabeza);
        } else {                                                      
            if (cabeza.getDato().compareToNombre(nuevoNodo.getDato()) > 0) {
                nuevoNodo.setNext(cabeza);                            
                nuevoNodo.setBack(ultimo);
                cabeza.setBack(nuevoNodo);
                ultimo.setNext(nuevoNodo);
                cabeza = nuevoNodo;

            } else if (ultimo.getDato().compareToNombre(nuevoNodo.getDato()) < 0) {
                nuevoNodo.setNext(cabeza);
                nuevoNodo.setBack(ultimo);
                ultimo.setNext(nuevoNodo);
                cabeza.setBack(nuevoNodo);
                ultimo = nuevoNodo;

            } else {

                NodoC actual = cabeza;

                while (actual.getNext() != cabeza && actual.getDato().compareToNombre(nuevoNodo.getDato()) > 0) {
                    actual = actual.getNext();
                }
                
                actual.getBack().setNext(nuevoNodo);
                nuevoNodo.setBack(actual.getBack());
                nuevoNodo.setNext(actual);
                actual.setBack(nuevoNodo);

            }
                   
        }
        
        
        
        
        
         
    }
    
    
        public void listaCopiaApellido (NodoC nodo){
        
        
         NodoC nuevoNodo = new NodoC(nodo.getDato());

        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
            cabeza.setNext(ultimo);
            ultimo.setBack(cabeza);
        } else {
            if (cabeza.getDato().compareToApellido(nuevoNodo.getDato()) > 0) {
                nuevoNodo.setNext(cabeza);
                nuevoNodo.setBack(ultimo);
                cabeza.setBack(nuevoNodo);
                ultimo.setNext(nuevoNodo);
                cabeza = nuevoNodo;

            } else if (ultimo.getDato().compareToApellido(nuevoNodo.getDato()) < 0) {
                nuevoNodo.setNext(cabeza);
                nuevoNodo.setBack(ultimo);
                ultimo.setNext(nuevoNodo);
                cabeza.setBack(nuevoNodo);
                ultimo = nuevoNodo;

            } else {

                NodoC actual = cabeza;

                while (actual.getNext() != cabeza && actual.getDato().compareToApellido(nuevoNodo.getDato()) < 0) {
                    actual = actual.getNext();
                }
                
                actual.getBack().setNext(nuevoNodo);
                nuevoNodo.setBack(actual.getBack());
                nuevoNodo.setNext(actual);
                actual.setBack(nuevoNodo);

            }
                   
        }
        
        
        
        
        
         
    }
    
        
    public Evaluacion NotaMayor() {

        NodoC actual = cabeza;
        Evaluacion evaluacionMayor= cabeza.getDato();
        int notaMayor= cabeza.getDato().getNota();
 

        
        
        do {
            
             if (actual.getDato().getNota()>notaMayor){
                notaMayor= actual.getDato().getNota();
                evaluacionMayor=actual.getDato();
                
            }
            
            actual=actual.getNext();
            
            
        }while (actual!= cabeza);
            


        
         return evaluacionMayor;
    }
    
    
       public Evaluacion NotaMenor() {

        NodoC actual = cabeza;
        Evaluacion evaluacionMenor= cabeza.getDato();
        int notaMenor= cabeza.getDato().getNota();
 

        
        
        do {
            
             if (actual.getDato().getNota()<notaMenor){
                notaMenor= actual.getDato().getNota();
                evaluacionMenor=actual.getDato();
                
            }
            
            actual=actual.getNext();
            
            
        }while (actual!= cabeza);
            


        
         return evaluacionMenor;
    }
    
    
  
    
    
    
}
