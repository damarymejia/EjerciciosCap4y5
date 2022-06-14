import java.util.Scanner;
public class Ejercicio4_20 {
    public void calcularsueldo(){
        Scanner entrada = new Scanner(System.in);
        int horas = 0;
        double tarifa = 0.0;
        double sueldo1 = 0.0;
        double sueldo2 = 0.0;
        double sueldo3 = 0.0;

        //Empleado 1
        System.out.println("Ingrese las horas trabajadas por el empleado1: ");
        horas= entrada.nextInt();
        System.out.println("Ingrese la tarifa por hora del empleado1: ");
        tarifa= entrada.nextDouble();

        if ( horas <= 40 ) {
            sueldo1 = horas * tarifa;
        } else {
            sueldo1 = (40 * tarifa) + (horas-40) * (tarifa*1.5) ;
        }

        //Empleado 2
        System.out.println("Ingrese las horas trabajadas por el empleado2: ");
        horas= entrada.nextInt();
        System.out.println("Ingrese la tarifa por hora del empleado2: ");
        tarifa= entrada.nextDouble();
        
        if ( horas <= 40 ) {
            sueldo2 = horas * tarifa;
        } else {
        sueldo2 = (40 * tarifa) + (horas-40) * (tarifa*1.5) ;
        }
        
        //Empleado 3
        System.out.println("Ingrese las horas trabajadas por el empleado3: ");
        horas= entrada.nextInt();
        System.out.println("Ingrese la tarifa por hora del empleado3: ");
        tarifa= entrada.nextDouble();
                
        if ( horas <= 40 ) {
            sueldo3 = horas * tarifa;
        } else {
            sueldo3 = (40 * tarifa) + (horas-40) * (tarifa*1.5) ;
        }

        System.out.println("|   Empleado 1   |   Empleado 2   |   Empleado 3   |");
        System.out.print( "      " +sueldo1);
        System.out.print(                           "                 " +sueldo2);
        System.out.print(                                            "            " +sueldo3);
    }
    public static void main(String[] args) {
        Ejercicio4_20 sueldoBruto = new Ejercicio4_20();
        sueldoBruto.calcularsueldo();
    }

}
