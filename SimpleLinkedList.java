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

public class SimpleLinkedList<E> extends AbstractList<E>
{
	protected int contador; 
    protected Node<E> head; 

    public SimpleLinkedList()
    // post: genera una lista vacia
    {
       head = null;
       contador = 0;
    }
   
    public int size()
    // post: retorna el numero de elementos de la lista
    {
      return contador;
    }
  
    public void addFirst(E value)
    // post: se agrega un valor al inicio
    {
       head = new Node<E>(value, head);
       contador++;
    }
  
    public E removeFirst()
    // post: remueve el primer parametro de la lista
    {
       Node<E> temp = head;
       head = head.next();
       contador--;
       return temp.value();
    }
  
    public E getFirst()
    // post: retorna el primer valor de la lista
    {
        return head.value();
    }
  
    public void addLast(E value)
    // post: agrega un valor al final de la lista
    {
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
           Node<E> finger = head;
           while (finger.next() != null)
           {
                  finger = finger.next();
           }
		 
           finger.setNext(temp);
         } 
         else head = temp;
         contador++;
     }
   
     public boolean contains(E value)
     // post: retorna true si el valor no es null
     {
        Node<E> finger = head;
	   
        while (finger != null &&
               !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
     }
}