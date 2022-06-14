import java.util.Scanner;

public class EjercicioPrueba5_17 
{
 
        private float costo;
        private float monto_total = 0;
        private int numero_producto;
        private int cantidad_vendida;
    

        public void Recibe()
            {          
        
            Scanner entrada = new Scanner(System.in); 
        
            System.out.print("\nPorductos disponibles");
            System.out.println("\nprecios:");
            System.out.println("\nProducto 1: $2.98");
            System.out.println("\nProducto 2: $4.50");
            System.out.println("\nProducto 3: $9.98");
            System.out.println("\nProducto 4: $4.49");
            System.out.println("\nProducto 5: $6.87\n");
        
            System.out.println("\nPor favor introduzca el numero del producto que desee:");
            System.out.println("( Pulse '0' para salir).");
            numero_producto = entrada.nextInt(); 
        
            while ( 0 != numero_producto )
            {
                switch ( numero_producto )
                {  
                    case 1:
                    {    
                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        cantidad_vendida = entrada.nextInt();
                        System.out.printf("*********************************************\n");
                        break;
                    } 
                
                    case 2:
                    {    
                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        cantidad_vendida = entrada.nextInt();
                        System.out.printf("*********************************************\n");
                        break;
                    }  
                
                    case 3:
                    {  
                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        cantidad_vendida = entrada.nextInt();
                        System.out.printf("*********************************************\n");
                        break;
                    }  
                    case 4:
                    {    
                
                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        cantidad_vendida = entrada.nextInt();
                        System.out.printf("*********************************************\n");
                        break;
                    }  
                
                    case 5:
                    { 
                
                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        cantidad_vendida = entrada.nextInt();
                        System.out.printf("*********************************************\n");
                        break;
                    }  
                    default :
                    {
                        System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!\n");
                        System.out.printf("*********************************************\n");
                        break;  
                    }   
                }   
                System.out.println("\nPor favor introduzca el numero del siguiente producto:");
                System.out.println("( Pulse '0' para terminar).");
                numero_producto = entrada.nextInt(); 
            }
            System.out.printf("***********************************Compra total**********************************\n");
            System.out.printf("|   Producto 1   |   Producto 2   |   Producto 3   |   Producto 4   |   Producto 5   |\n");
            System.out.printf("     %f", cantidad_vendida*2.98);
                        monto_total += cantidad_vendida*2.98;
            System.out.printf("       %f", cantidad_vendida*4.50);
                        monto_total += cantidad_vendida*4.50;
            System.out.printf("          %f", cantidad_vendida*9.98);
                        monto_total += cantidad_vendida*9.98;
            System.out.printf("        %f", cantidad_vendida*4.49);
                        monto_total += cantidad_vendida*4.49;
            System.out.printf("         %f", cantidad_vendida*6.87);
                        monto_total += cantidad_vendida*6.87;

            
            System.out.printf("\n                        Subtotal: %f\n\n", monto_total);
        }          
    } 
