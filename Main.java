/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Marlon Hernandez 15177
 * Dieter de Wit 15146
 * -------------------------------------
 * Clase Principal
 --------------------------------------*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{       
    private static Scanner ingreso;
	private static BufferedReader buffer;

	public static void main(String[] args) throws IOException 
    {
        ingreso = new Scanner(System.in);
        FileReader archivo = new FileReader("/Users/MacBookPro/Desktop/HDT4/datos.txt");
        buffer = new BufferedReader(archivo);
        String cadena = buffer.readLine(); 
        int resu;  
        String seleccion; 
        int entero;   
        
        Factory fabrica;   
        AbstractList<String> lista = new AbstractList<String>();   
        
        IStack<String> stack = new ArrayList<String>();  
        
        System.out.println("Hola. Porfavor presione la opcion de calculadora que desee implementar:\n");
        System.out.println("1) ArrayList\n2) LinkedList\n3) VectorList"); 
        seleccion = ingreso.nextLine();   
        
        while (!seleccion.equals("1") && !seleccion.equals("2") && !seleccion.equals("3"))
        {
            System.out.println("Porfavor siga instrucciones\n");
            System.out.println("1) ArrayList\n2) LinkedList\n3) VectorList"); 
            seleccion = ingreso.nextLine();
        }
        
        if (seleccion.equals("1")) 
        {    
            Calculadora calculo = new Calculadora(stack);   
            System.out.println("Calculo Completo:");
            
            while (cadena != null) 
            	//PostFix por lineas de archivo
            {
                stack.isEmpty();  
                resu = calculo.lectura(cadena);      
                System.out.println(cadena+" = "+resu);    
                cadena = buffer.readLine();  
            }
        }
        
        if (seleccion.equals("2"))
        //Uso de Listas Enlazadas
        {       
            System.out.println("Que linked list desea utilizar?");
            System.out.println("1)SimpleLinkedList\n2)DoubleLinkedList\n3)CircularLinkedList");
            seleccion=ingreso.nextLine();
            
            while (!seleccion.equals("1") && !seleccion.equals("2") && !seleccion.equals("3"))
            {
                System.out.println("Porfavor siga Instrucciones\n");
                System.out.println("1)SimpleLinkedList\n2)DoubleLinkedList\n3)CircularLinkedList");
                seleccion = ingreso.nextLine();
            }
            
            entero = Integer.parseInt(seleccion); 
            fabrica = new Factory();
            
            lista = fabrica.getList(entero);
            Calculadora calc = new Calculadora(lista, entero);  
            
            System.out.println("Calculo Completo:");
            
            while (cadena != null)
            	//Operar todas las lineas
            {
                /* 
                 * Metodo para vaciar la lista
                 * lista.empty();  
                 */
            	
                resu = calc.postfixConListas(cadena);    
                System.out.println(cadena+" = "+resu);   
                cadena = buffer.readLine(); 
            }
        }

        if (seleccion.equals("3"))
        {
            /**stack = vector**/
            Calculadora calculo = new Calculadora(stack);   
            System.out.println("Calculo Completo:");
            
            while (cadena != null) 
                //PostFix por lineas de archivo
            {
                stack.isEmpty();  
                resu = calculo.lectura(cadena);      
                System.out.println(cadena+" = "+resu);    
                cadena = buffer.readLine();  
            }
        }
    }   
}
