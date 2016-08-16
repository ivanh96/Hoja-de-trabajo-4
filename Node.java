/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase Abstracta que contiene los 
 * metodos de los nodos a crear. 
 --------------------------------------*/

public class Node<E>
{
    protected E datos; 
    protected Node<E> nextElement; 
    
    public Node(E value, Node<E> next)
	// pre: value, siguiente termino en referencia
	// post: Elemento contruido como primero de la lista
	{
	    datos = value;
	    nextElement = next;
	}
    
    public Node(E value)
    // post: Contruye una nueva cola con value 
    {
    this(value,null);
    }
	    
    public Node<E> next()
    // post: Retorna la referencia para el siguiente valor en la lista
    {
    return nextElement;
    }
	    
	public void setNext(Node<E> next)
	// post: Propone la referencia al siguiente valor 
	{
	nextElement = next;
	}
	
	public E value()
	// post: Retorna el valor asociado con este elemento
	{
	return datos;
	}
	
	public void setValue(E value)
	// post: pone el valor asociado con este elemento
	{
	datos = value;
	}
}
