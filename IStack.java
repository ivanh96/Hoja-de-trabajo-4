/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase que contiene los metodos para
 * utilizar la pila. 
 --------------------------------------*/

public interface IStack<E> 
{
    public void push(E element);

    public E pop();

    public boolean isEmpty();

    public E getLast();

    public int size();

    public void clear();

	E peek();
}