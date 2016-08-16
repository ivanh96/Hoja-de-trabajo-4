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

import java.util.Vector;

public class ArrayList <E> 
implements IStack<E>
{
    
    protected Vector<E> datos;

        public ArrayList ()
        {
            datos = new Vector<E>();
        }
    
	public void push(E item)
	// post: valor agregado al stack
	{
		datos.addElement(item);
	}

	public E pop()
	// post: el elemento mas nuevo el la pila se saca y se retorna
	{
		return datos.remove(size()-1);
	}

	public E peek()
	// post: pop del ultimo valor
	{
		return datos.get(size() - 1);
	}
	
	public int size()
	// post: retorna la cantidad de elemtos en la lista
	{
		return datos.size();
	}
  
    public boolean empty()
	// post: retorna true si la lista esta vacia
	{
		return size() == 0;
	}


	public boolean isEmpty() 
	{
		return false;
	}

	public E getLast() 
	{
		return null;
	}

	public void clear()
	{
			
	}
}