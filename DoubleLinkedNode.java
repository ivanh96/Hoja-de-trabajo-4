/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase que contiene los metodos para
 * utilizar para el nodo doble. 
 --------------------------------------*/

public class DoubleLinkedNode<E>
{
    protected E datos;
    protected DoubleLinkedNode<E> nextElement;
    protected DoubleLinkedNode<E> previousElement;

	public DoubleLinkedNode(E value, DoubleLinkedNode<E> next, DoubleLinkedNode<E> previous)
	{
	    datos = value;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}
	
	public DoubleLinkedNode(E value)
	// post: contruye un elemento unicamente
	{
	    this(value,null,null);
	    
	}
	
	public DoubleLinkedNode<E> next()
	// post: retorna la referencia al siguiente valor de la lista
	{
	    return nextElement;
	}
	
	public DoubleLinkedNode<E> previous(){
	    return previousElement;
	}
	
	public void setPrevious(DoubleLinkedNode<E> previous)
	// post: pone la referencia al valor anterior 
	{
	previousElement = previous;
	}
	
	public void setNext(DoubleLinkedNode<E> next)
	// post: pone la referencia al sigueinte valor 
	{
	nextElement = next;
	}
	
	public E value()
	// post: retona el valor asociado con este elemento
	{
	return datos;
	}
	
	public void setValue(E value)
	// post: setea el valor de este elemento
	{
	datos = value;
	}
}