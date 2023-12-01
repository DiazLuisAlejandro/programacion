package ies.puerto;

import java.util.Calendar;

public class Ejercicio10 {
    
    //Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar
    //y muestre un mensaje apropiado.

    public static void main(String[] args) {
        
        Calendar fecha=Calendar.getInstance();

        int diaSemana=fecha.get(Calendar.DAY_OF_WEEK);

        String dia;
        
        switch (diaSemana) {
            case 1:
                dia="domingo";
                System.out.println("Es finde semana y es "+dia);
                break;
            case 2:
                dia="lunes";
                System.out.println("No es finde semana y es "+dia);
                break;
            case 3:
                dia="martes";
                System.out.println("No es finde semana y es "+dia);
                break;
                
            case 4:
                dia="miercoles";
                System.out.println("No es finde semana y es "+dia);
                break;
        
            case 5:
                dia="jueves";
                System.out.println("No es finde semana y es "+dia);
                break;
            case 6:
                dia="viernes";
                System.out.println("No es finde semana y es "+dia);
                break;
            case 7:
                dia="sabado";
                System.out.println("Es finde semana y es "+dia);
                break;
            default:
                break;
            }
            
        if (diaSemana==7) {

            System.out.println("Es sabado");

        }else if (diaSemana==1) {

            System.out.println("Es domingo");
        }
    }
        
}
