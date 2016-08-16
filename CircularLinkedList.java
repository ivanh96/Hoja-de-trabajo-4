/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase que contiene los metodos para
 * utilizar la lista Circular. 
 --------------------------------------*/

public class CircularLinkedList<E> extends AbstractList<E>
{

	protected Node<E> tail; 
	protected int contador;
	
	public CircularLinkedList()
	// pre: construye la lista circular
	{
	   tail = null;
	   contador = 0;
	}
	
	public void addFirst(E value)
	// post: agrega elemento a la cabeza
	{
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { 
	       tail = temp;
	       tail.setNext(tail);
	   } 
	   else 
	   { 
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   contador++;
	}
	
	public void addLast(E value)
	// post: agrega elemento a la cola
	{
	   addFirst(value);
	   tail = tail.next();
	}
	
	public E removeLast()
	// post: retorna y remueve el ultimo valor de la lista
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) 
	   {
	       finger = finger.next();
	   }
	   
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } 
	   else
	   {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   contador--;
	   return temp.value();
	}
}