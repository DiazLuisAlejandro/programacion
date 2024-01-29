package ies.puerto.colegio;

import java.util.ArrayList;

public class Colegio {
    private String nombre;
    private String direccion;
    private String ubicacion;
    private ArrayList<Aula> aulas;

    public float maxima(){
        float maxima=0;
        if (aulas.isEmpty()){
            return maxima;
        }
        for (Aula aula:aulas) {
            if (aula.maxima()>maxima){
                maxima=aula.maxima();
            }
        }
        return maxima;
    }

    public float media(){
        float media=0;
        if (aulas.isEmpty()){
            return media;
        }
        for (Aula aula:aulas) {
            media+=aula.media();
        }
        return media=media/aulas.size();
    }
    public float minima(){
        float minima=10;
        if (aulas.isEmpty()){
            return minima;
        }
        for (Aula aula:aulas) {
            if (aula.minima()>minima){
                minima=aula.minima();
            }
        }
        return minima;
    }
}
