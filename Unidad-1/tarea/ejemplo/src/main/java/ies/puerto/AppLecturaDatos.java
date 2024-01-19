package ies.puerto;

import ies.puerto.impl.LecturaDatosFicheros;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {

    static ILecturaDatos lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos=new LecturaDatosFicheros();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.cerrar());
        tipo(lecturaDatos);
    }

    private static void tipo(ILecturaDatos lecturaDatos) {
    }
}
