package ies.puerto.clases;

import java.util.ArrayList;

public class Aula {

    public String identificador;
    public ArrayList<Alumno> alumnos;

    public Float mediaAula;

    public Aula(String identificador, ArrayList<Alumno> alumnos){
        this.identificador=identificador;
        this.alumnos=alumnos;
    }


    public Float MediaAula() {
        mediaAula=0f;
        for (Alumno alumno:alumnos) {
            mediaAula= alumno.media();
        }
    }
}
