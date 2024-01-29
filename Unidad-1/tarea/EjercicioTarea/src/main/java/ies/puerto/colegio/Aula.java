package ies.puerto.colegio;

import java.util.ArrayList;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public float maxima(){
        float maxima=0;
        if (alumnos.isEmpty()){
            return maxima;
        }
        for (Alumno alumno:alumnos) {
            if (alumno.maxima()>maxima){
                maxima=alumno.maxima();
            }
        }
        return maxima;
    }

    public float minima(){
        float minima=10;
        if (alumnos.isEmpty()){
            return minima;
        }
        for (Alumno alumno:alumnos) {
            if (alumno.minima()>minima){
                minima=alumno.minima();
            }
        }
        return minima;
    }

    public float media(){
        float media=0;
        if (alumnos.isEmpty()){
            return media;
        }
        for (Alumno alumno:alumnos) {
            media+=alumno.media();
        }
        return media=media/alumnos.size();
    }
}
