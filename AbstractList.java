/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase Abstracta que contiene los 
 * metodos de las listas que Implementa. 
 --------------------------------------*/

import java.util.Iterator;

public class AbstractList<E> implements IStack<E>, List<E>
{
    public int size() 
    {
		return 0;
    }

    public boolean isEmpty() 
    {
		return false;   
    }

    public void clear() 
    {
       
    }

    public void addFirst(E value) 
    {
        
    }

    public void addLast(E value) 
    {
        
    }

    public E getFirst() 
    {
		return null;  
    }

    public E getLast() 
    {
		return null;
    }

    public E removeFirst() 
    {
		return null;    
    }

    public E removeLast() 
    {
		return null;      
    }

    public E remove(E value) 
    {
		return value;
    }

    public void add(E value) 
    {
       
    }

    public E remove() 
    {
		return null;
    }

    public E get() 
    {
		return null;     
    }

    public boolean contains(E value) 
    {
		return false;  
    }


    public int indexOf(E value) 
    {
		return 0;      
    }

    public int lastIndexOf(E value) 
    {
		return 0;   
    }

    public E get(int i) 
    {
		return null;      
    }

    public E set(int i, E o) 
    {
		return o;      
    }

    public void add(int i, E o) 
    {
       
    }


    public E remove(int i) 
    {
		return null;
    }

    public void push(E item) 
    {
       
    }

    public E pop()
    {
		return null;
    }

	public Iterator<E> iterator() 
	{
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
}