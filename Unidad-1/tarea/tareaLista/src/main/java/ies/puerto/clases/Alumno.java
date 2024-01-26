package ies.puerto.clases;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Float> calificacion;

    public Alumno(){
    }

    public Float media(ArrayList<Float> calificacion){
        float media=0;
        if(calificacion.size()==0){
            return media;
        }else{
            for (Float resultado:calificacion) {
                media+=resultado;
            }
            media=media/calificacion.size();
        }
        return media;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Float> getCalificacion() {
        return calificacion;
    }
}
