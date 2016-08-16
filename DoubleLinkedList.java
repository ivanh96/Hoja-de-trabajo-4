/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase que contiene los metodos para
 * utilizar la lista Doble. 
 --------------------------------------*/

public class DoubleLinkedList<E> extends AbstractList<E>{
protected int count;
protected DoubleLinkedNode<E> head;
protected DoubleLinkedNode<E> tail;

public DoubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoubleLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoubleLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoubleLinkedNode<E> temp = tail;
   tail = tail.previousElement;
   if (tail == null) {
       head = null;
   } else {
       tail.next();
   }
   count--;
   return temp.value();
}
}