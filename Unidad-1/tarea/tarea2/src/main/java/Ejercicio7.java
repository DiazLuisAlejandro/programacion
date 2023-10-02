import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio7 {
    /**
     *Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil,
     *expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double factor=3.6;
        System.out.println("Dame la velocidad en Km/h y la paso a m/s");
        double speed=leer.nextInt(); leer.nextLine();
        speed/=factor;
        System.out.println(" La velocidad es: "+speed+"m/s");
    }
}
