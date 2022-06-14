import java.util.Scanner;
 
 public class EjercicioPrueba4_29
 
 {           
    private String mensaje;
    Scanner entrada = new Scanner(System.in);
    
    public EjercicioPrueba4_29(String cadena)
    {                  
        mensaje = cadena;
    }                      
    public void Recibe()
    {               
        int lado;       
        System.out.println("\nPor favor introduzca un numero entre 1 y 20 y se imprimira un cuadrado con ese numero de lado:");
        lado = entrada.nextInt();
        
        Imprime( lado);
    }            
    
    public void Imprime( int x)
 {                 
 int contadorHorizontal = 1;
 int contadorVertical = 2;
 
 while( contadorHorizontal++ <= x)
 {    
 System.out.print("*");
 }       
 System.out.print("\n");
 
 
 contadorHorizontal = 1;
 
 while ( contadorVertical++ < x) 
 
 {          
 
 while ( x >= contadorHorizontal)  
 {              
 if ((1 == contadorHorizontal) || (x == contadorHorizontal))
 System.out.print("*");
 else
 System.out.print(" ");
 
 contadorHorizontal++;
 }               
 
 System.out.print("\n");  
 contadorHorizontal = 1;
 }             
 
 contadorHorizontal = 1;
 while ( contadorHorizontal++ <= x)
 { 
 System.out.print("*");
 }         
 
 System.out.println("\n");
 }                
 }            