package Persona;

import java.util.Queue;
import java.util.Scanner;

import static Persona.Main.modificar;

public class Main {

    static Alumno alumno;

    public static void main(String[] args) {
        Alumno[] alumno=generar();
        menu(alumno);


    }


    public static Alumno[] generar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto alumnos quiere crear?");
        int alumnosACrear = sc.nextInt();
        sc.nextLine();
        Alumno alumno[] = new Alumno[alumnosACrear];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("DNI");
            String dni = sc.nextLine();
            alumno[i].setDni(dni);
            System.out.println("Nombre");
            String nombre = sc.nextLine();
            alumno[i].setNombre(nombre);
            System.out.println("Edad");
            int edad = sc.nextInt();sc.nextLine();
            alumno[i].setEdad(edad);
        }
        return alumno;
    }



    public static void menu(Alumno alumno[]){
        Scanner sc = new Scanner(System.in);
        boolean activo = true;
        int seleccion;
        do {
            System.out.println("Que quiere hacer?");
            System.out.println("1) Mostrar alumnos");
            System.out.println("2) Modificar alumno");
            System.out.println("3) Salir");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    for (int i = 0; i < alumno.length; i++) {
                        System.out.println(alumno[i].toString());
                    }
                    break;
                case 2:
                    System.out.println("Que alumno quieres editar?");
                    System.out.println("Hay "+alumno.length+" alumnos");
                    int alumnoEditar=sc.nextInt();
                    System.out.println("los nuevos datos son: ");
                    System.out.println(modificar(alumno[alumnoEditar-1]).toString());
                    break;
                case 3:
                    activo = false;
                    break;
                default:
            }

        } while (activo);
    }


    public static Alumno modificar(Alumno alumno) {
        Scanner sc = new Scanner(System.in);

        boolean activo = true;
        int seleccion;
        do {
            System.out.println("Que quiere hacer?");
            System.out.println("2) Modificar nombre");
            System.out.println("2) Modificar edad");
            System.out.println("3) Salir");
            seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Cual es el nuevo nombre?");
                String nuevoNombre= sc.nextLine();
                alumno.setNombre(nuevoNombre);
                break;
            case 2:
                System.out.println("Cual es la nueva edad?");
                int nuevaEdad= sc.nextInt();
                alumno.setEdad(nuevaEdad);
                break;
            case 3:
                activo = false;
                break;
            default:
        }
    } while (activo);

    return alumno;
    }
}

