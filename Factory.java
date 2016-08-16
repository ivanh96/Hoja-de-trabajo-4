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

public class Factory 
{
	//Menu para elegir el tipo de lista que se va a crear segun el numero que ingresen (1,2,3)
    public AbstractList getList(int i)
    { 
        if (i==1)
        {  
            return new SimpleLinkedList();
        }
        
        if(i==2)
        {   
            return new DoubleLinkedList();
        }
        
        else
        {      
            return new CircularLinkedList();
        }
    }
}
