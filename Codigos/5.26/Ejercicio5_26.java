
public class Ejercicio5_26
{ 
    public static void main(String args[])
    { 
        int cuenta;
        int centinela = 0;
        for ( cuenta = 1; cuenta <= 10 && 0 == centinela; cuenta++ )
        { 
            if ( 5 == cuenta )  
            centinela = 1;
        }  
        System.out.printf("\nSalio de ciclo en cuenta = %d\n", cuenta );
    }
}  