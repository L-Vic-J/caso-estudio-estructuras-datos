# Caso de Estudio Estructuras de Datos 

Proyecto académico correspondiente al II Caso de Estudio del curso Estructuras de Datos de la Universidad Fidélitas.  
El proyecto integra la implementación manual de listas doblemente enlazadas circulares y árboles binarios de búsqueda, aplicados a escenarios de evaluación académica y gestión de libros.

## Objetivo
Aplicar estructuras de datos avanzadas mediante el desarrollo de un sistema en **Java**, implementando listas y árboles sin utilizar estructuras precompiladas, reforzando el manejo de nodos, recorridos, búsquedas y estadísticas.

## Funcionalidades principales

### Gestión de Evaluaciones (Lista Doble Circular)
- Implementación de una lista doblemente enlazada circular ordenada por número de carnet.
- Inserción, búsqueda, extracción y eliminación de evaluaciones.
- Búsqueda por nombre y apellido.
- Ordenamiento alfabético:
  - Nombres de A → Z
  - Apellidos de Z → A
- Cálculo de estadísticas:
  - Total de evaluaciones
  - Aprobados y reprobados
  - Promedio de aprobados
  - Promedio general
- Identificación de la nota mayor** y nota menor.

---

### Gestión de Libros (Árbol Binario de Búsqueda)
- Implementación de un árbol binario de búsqueda.
- Inserción de libros ordenados por índice.
- Búsqueda de libros por índice.
- Cálculo del nivel de un libro dentro del árbol.
- Impresión del árbol indicando el tipo de recorrido utilizado.


## Estructuras de datos utilizadas
- Lista doblemente enlazada circular
- Árbol binario de búsqueda 
- Nodos genéricos
- Enlaces manuales entre nodos

## Clases principales

- Evaluacion
- NodoC
- ListaC
- Libro
- Nodo<T>
- Arbol
- EstudioCaso2 (Main)

---

## Cómo ejecutar
1. Abrir el proyecto en un IDE compatible con Java (IntelliJ IDEA, NetBeans o Eclipse).
2. Ejecutar la clase principal EstudioCaso2.
3. Observar la salida en consola según los casos solicitados.


## Notas
- No se utilizan estructuras de datos precompiladas de Java (`List`, `ArrayList`, `Vector`, arreglos, etc.).
- Todas las estructuras se implementan manualmente siguiendo el modelo Estructura – Nodo – Dato.

