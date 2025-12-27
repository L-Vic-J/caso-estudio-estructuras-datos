package cr.ac.ufidelitas.proyectoed.estudiocaso2;

public class EstudioCaso2 {

    public static void main(String[] args) {

        ListaC lista = new ListaC();

        Evaluacion evaluacion1 = new Evaluacion("Victor", "Leiton", 80, 2);
        Evaluacion evaluacion2 = new Evaluacion("Victor", "Perez", 85, 1);
        Evaluacion evaluacion3 = new Evaluacion("Jimena", "Gonzalez", 86, 4);
        Evaluacion evaluacion4 = new Evaluacion("Pedro", "Zuñiga", 70, 3);
        Evaluacion evaluacion5 = new Evaluacion("Carla", "Gomez", 90, 5);

        lista.Inserta(evaluacion1);
        lista.Inserta(evaluacion2);
        lista.Inserta(evaluacion3);
        lista.Inserta(evaluacion4);
        lista.Inserta(evaluacion5);
        
        

        System.out.println("=== Lista ===");
        System.out.println(lista.toString());

        System.out.println("=== Busqueda ID ===");
        Evaluacion evaluacion = lista.busquedaID(4);
        System.out.println(evaluacion.toString());

        System.out.println("=== Ordena nombre ===");
        ListaC listaOrdenaNombre = lista.ordenaNombre();

        System.out.println(listaOrdenaNombre.toString());

        System.out.println("=== Busqueda nombre ===");
        lista.busquedaNombre("Victor");

        System.out.println("=== Ordena apellidos ===");
        ListaC listaOrdenaApellidos = lista.ordenaApellidos();

        System.out.println(listaOrdenaApellidos.toString());

        System.out.println("=== Busqueda apellidos ===");

        lista.busquedaApellidos("Gomez");

        System.out.println("=== Metodo to String ===");

        System.out.println(lista.toString());

        System.out.println("=== Estadisticas ===");

        lista.estadisticas();

        System.out.println("=== Nota mayor ===");

        evaluacion = lista.NotaMayor();
        System.out.println(evaluacion.toString());

        System.out.println("=== Nota menor ===");

        evaluacion = lista.NotaMenor();
        System.out.println(evaluacion.toString());

        System.out.println("=== Extraer evaluacion ===");
        evaluacion = lista.evaluacionExtrae(5);
        System.out.println(evaluacion.toString());

        System.out.println("=== Eliminar evaluacion ===");

        lista.elimina(5);
        System.out.println(lista.toString());
        
        
        System.out.println("=== Arbol ===");
        
        
        Arbol arbol= new Arbol();
        
        Libro libro1= new Libro("A", "Harry Potter","Fantasia", 10);
        Libro libro2= new Libro("B", "IT","Terror", 11);
        Libro libro3= new Libro("C", "Nacidos de la bruma","Fantasia", 10);
        Libro libro4= new Libro("D", "Historia de Costa Rica","Vida real",13);
        Libro libro5= new Libro("E", "Conceptos Matematicos","Vida Real", 14);
        Libro libro6= new Libro("F", "Dune","Ciencia Ficcion", 15);
        Libro libro7= new Libro("G", "El señor de los anillos","Fantasia", 10);
        Libro libro8= new Libro("H", "Jurassic Park","Ciencia Ficcion", 23);
        Libro libro9= new Libro("I", "Los juegos del hambre","Ciencia ficcion", 5);
        Libro libro10= new Libro("J", "Juego de tronos","Fantasia", 6);
        Libro libro11= new Libro("K", "Ana Frank","Vida Real", 7);
        Libro libro12= new Libro("L", "Fundementos de Java","Vida Real", 9);
        Libro libro13= new Libro("M", "Frankenstein","Ciencia ficcion", 23);
        Libro libro14= new Libro("N", "El eco de los pasos","Fantasia", 12);
        Libro libro15= new Libro("O", "Manual de Scrum","Vida real", 11);
        Libro libro16= new Libro("P", "The Hobbit","Fantasia", 7);
        Libro libro17= new Libro("Q", "Animales fantasticos","Fantasia", 3);
        Libro libro18= new Libro("R", "Narnia","Fantasia", 1);
        Libro libro19= new Libro("S", "La historia de la WW2","Vida real", 9);
        Libro libro20= new Libro("T", "Dune parte 2","Ciencia ficcion", 17);
        
        
        arbol.inserta(libro9);
        arbol.inserta(libro3);
        arbol.inserta(libro2);
        arbol.inserta(libro11);
        arbol.inserta(libro20);
        arbol.inserta(libro12);
        arbol.inserta(libro6);
        arbol.inserta(libro17);
        arbol.inserta(libro4);
        arbol.inserta(libro14);
        arbol.inserta(libro5);
        arbol.inserta(libro16);
        arbol.inserta(libro18);
        arbol.inserta(libro19);
        arbol.inserta(libro1);
        arbol.inserta(libro15);
        arbol.inserta(libro7);
        arbol.inserta(libro13);
        arbol.inserta(libro10);
        arbol.inserta(libro8);
        
        
        System.out.println("=== to String in order ===");
        
        System.out.println(arbol.toString());
        
         System.out.println("=== Busqueda por indice ===");
         
         boolean estaLibro= arbol.buscarLibro("S");
         System.out.println("El libro esta?:"+estaLibro);
        
         System.out.println("=== Nivel libro ===");

         int nivelLibro= arbol.nivelLibro("S");
         System.out.println("El nivel del libro es:"+nivelLibro);
         
    }
}
