package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio X");
    }
    public static String calcularDiaSemana(int numero){
        String resultado="";
        
        switch (numero) {
                case 1:
                    resultado="Lunes";
                    break;
                case 2:
                    resultado="Martes";
                    break;
                case 3:
                    resultado="Miercoles";
                    break;
                case 4:
                    resultado="Jueves";
                    break;
                case 5:
                    resultado="Viernes";
                    break;
                case 6:
                    resultado="Sabado";                 
                    break;
                 case 7:
                    resultado="Domingo";
                    break;
                default:
                    resultado="No existe ese dia";
                    break;
            }

        return resultado;
    }
}