package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFicheros implements ILecturaDatos {

    @Override
    public String lectura(){
        return "Realizada la lectura de datos desde fichero";
    }

    @Override
    public String apertura(){
        return "Se abre el fichero";
    }

    @Override
    public String cerrar(){
        return "Se cierra el fichero";
    }
}
