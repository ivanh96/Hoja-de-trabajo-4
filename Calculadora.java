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

public class Calculadora 
{
    IStack<String> stack;
    List lista;
    int posicion;

    //Constructor donde se crea el Stack
    public Calculadora(IStack<String> pila) 
    {
        this.stack = pila;
    }
    
    public Calculadora (List<?> lista, int numLista) 
    {
        this.lista = lista;
        this.posicion = numLista;
    }
    
    //Lee el vector en formato postfix
    public int lectura(String readItem)
    {
        String caracter, caracteres; 
        //Almacena el caracter y el resultado temporalmente para luego incertarlo en la pila
        int tamano = 0; 
        int variable = 0; 
        int temp = 0; 

        for(int i = 0; i < readItem.length(); i++)
        {
            caracter = Character.toString(readItem.charAt(i)); 
            if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9"))
            {
                stack.push(caracter);
            }
            else if(caracter.equals("+"))
            //Suma
            {
                tamano = stack.size();
                variable = Integer.parseInt(stack.pop());

                for(int j = 0; j <tamano-1; j++)
                {
                    temp = Integer.parseInt(stack.pop());
                    variable = temp + variable;
                }
                
                caracteres = Integer.toString(variable);
                stack.push(caracteres);
            }
            
            else if(caracter.equals("-"))
            //Resta
            {
                tamano = stack.size();
                variable = Integer.parseInt(stack.pop());
                for(int j = 0; j <tamano-1; j++)
                {
                    temp = Integer.parseInt(stack.pop());
                    variable = temp - variable;
                }
                
                caracteres = Integer.toString(variable);
                stack.push(caracteres);
            }
            
            else if(caracter.equals("*"))
            //Multiplicacion
            {
                tamano = stack.size();
                variable = Integer.parseInt(stack.pop());
                for(int j = 0; j <tamano-1; j++){
                    temp = Integer.parseInt(stack.pop());
                    variable = temp * variable;
                }
                
                caracteres = Integer.toString(variable);
                stack.push(caracteres);  
            }
            
            else if(caracter.equals("/"))
            //Division
            {
                tamano = stack.size();
                variable = Integer.parseInt(stack.pop());
                for(int j = 0; j <tamano-1; j++)
                {
                    temp = Integer.parseInt(stack.pop()) / variable;
                }
                
                caracteres = Integer.toString(temp);
                stack.push(caracteres);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
    
    public int postfixConListas(String readItem)
    {

    for(int i = 0; i < readItem.length(); i++){
        
    char c = readItem.charAt(i);
    int a = 0;
    int b = 0;
    int r = 0;

    if(Character.isDigit(c)){
       int t = Character.getNumericValue(c);
        lista.addLast(t);
    }
    else if(c == '+'){
        a = (Integer)lista.removeLast();
        b = (Integer)lista.removeLast();
        r = a+b;
        lista.addLast(r);
    }
     else if(c == '-'){
        a = (Integer)lista.removeLast();
        b = (Integer)lista.removeLast();
        r = a-b;
        lista.addLast(r);
    }
     else if(c == '*'){
        a = (Integer)lista.removeLast();
        b = (Integer)lista.removeLast();
        r = a*b;
        lista.addLast(r);
    }
     else if(c == '/'){
        a = (Integer)lista.removeLast();
        b = (Integer)lista.removeLast();
        r = a/b;
        lista.addLast(r);
    }
}
        return (Integer)lista.removeLast();
    }
}
