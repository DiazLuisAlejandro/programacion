package ies.puerto;

import ies.puerto.CorreoElectronico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CorreoElectronicoExecption {
        Scanner sc= new Scanner(System.in);
        boolean bucle=true;
        System.out.println("Introduzca su correo electronico");
        do {

            String correoS = sc.nextLine();
            correoS = correoS.toLowerCase();
            CorreoElectronico correo = new CorreoElectronico();
            if (correo.validar(correoS)) {
                correo.setCorreo(correoS);
                bucle=false;
            } else {
                System.out.println("Introduzca de nuevo el coreo");
            }
        }while (bucle);
    }


}