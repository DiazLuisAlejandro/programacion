package Vehiculo;

import Persona.Alumno;

import java.util.Scanner;

public class AppDGT {

    static Coche coche;

    static Motocicleta motocicleta;

    static  Conductor conductor;

    public static void main(String[] args) {

    }




    public static Conductor[] generar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto alumnos quiere crear?");
        int conductoresACrear = sc.nextInt();
        sc.nextLine();
        Conductor conductor[] = new Conductor[conductoresACrear];
        for (int i = 0; i < conductor.length; i++) {
            System.out.println("DNI");
            String dni = sc.nextLine();
            conductor[i].setDni(dni);
            System.out.println("Nombre");
            String nombre = sc.nextLine();
            conductor[i].setNombre(nombre);
            System.out.println("Edad");
            int edad = sc.nextInt();sc.nextLine();
            conductor[i].setEdad(edad);
            System.out.println("Permiso");
            String permisoconducir=sc.nextLine();
            conductor[i].setPermisoconducir(permisoconducir);
        }
        return conductor;
    }



    public static void menu(Conductor conductor[]){
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
                    for (int i = 0; i < conductor.length; i++) {
                        System.out.println(conductor[i].toString());
                    }
                    break;
                case 2:
                    System.out.println("Que alumno quieres editar?");
                    System.out.println("Hay "+conductor.length+" alumnos");
                    int conductorEditar=sc.nextInt();
                    System.out.println("los nuevos datos son: ");
                    System.out.println(modificar(conductor[conductorEditar-1]).toString());
                    break;
                case 3:
                    activo = false;
                    break;
                default:
            }

        } while (activo);
    }


    public static Conductor modificar(Conductor conductor) {
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
                    conductor.setNombre(nuevoNombre);
                    break;
                case 2:
                    System.out.println("Cual es la nueva edad?");
                    int nuevaEdad= sc.nextInt();
                    conductor.setEdad(nuevaEdad);
                    break;
                case 3:
                    activo = false;
                    break;
                default:
            }
        } while (activo);

        return conductor;
    }
}
