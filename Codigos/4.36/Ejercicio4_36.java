import java.util.Scanner;

public class Ejercicio4_36 {
    public void esTrianguloRectangulo() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer lado: ");
        double primerLado = entrada.nextDouble();

        System.out.println("Ingrese el segundo lado: ");
        double segundoLado = entrada.nextDouble();

        System.out.println("Ingrese el tercer lado: ");
        double tercerLado = entrada.nextDouble();

        if ( primerLado < 0 || segundoLado < 0 || tercerLado < 0) {
            System.out.println("Los tres lados deben ser mayores a cero");
        } 
        else {
            boolean primerIntento = cumplePitagoras(primerLado, segundoLado, tercerLado);
            boolean segundoIntento = cumplePitagoras(segundoLado, tercerLado, primerLado);
            boolean tercerIntento = cumplePitagoras(tercerLado, primerLado, segundoLado);

            if(primerIntento || segundoIntento || tercerIntento) {
                System.out.println("Es un triangulo rectangulo.");
            } else {
                System.out.println("No es un triangulo rectangulo.");
            }
        }
    }

    public boolean cumplePitagoras(double catetoOpuesto,
            double catetoAdyacente, double hipotenusa) {
        double c1 = catetoOpuesto * catetoOpuesto;
        double c2 = catetoAdyacente * catetoAdyacente;
        double h = hipotenusa * hipotenusa;
        if (h == (c1+c2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Ejercicio4_36 trianguloRectangulo = new Ejercicio4_36();
        trianguloRectangulo.esTrianguloRectangulo();
    }
}
