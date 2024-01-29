package ies.puerto.colegio;

import ies.puerto.abstracta.Persona;

import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Nota> notas;


    public Alumno(String nombre, String dni, String fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);
        this.notas=new ArrayList<Nota>();
    }

    public void addNota(Nota nota){

        boolean estalanota=false;
        for (Nota nota1:notas) {
            if (nota1.getNombre().equals(nota.getNombre())){
                estalanota=true;
            }
        }
        if (estalanota){
            this.notas.add(nota);
        }
        if (!estalanota){
            System.out.println("Esa nota ya se añadio");
        }

    }

    public float maxima(){
        float maxima=0;
        if (notas.isEmpty()){
            return maxima;
        }
        for (Nota nota:notas) {
            if (nota.getValor()>maxima){
                maxima=nota.getValor();
            }
        }
        return maxima;
    }

    public float media(){
        float media=0;
        if (notas.isEmpty()){
            return media;
        }
        for (Nota nota:notas) {
            media+=nota.getValor();
        }
        return media=media/notas.size();
    }

    public float minima() {
        float minima=0;
        if (notas.isEmpty()){
            return minima;
        }
        for (Nota nota:notas) {
            if (nota.getValor()<minima){
                minima=nota.getValor();
            }
        }
        return minima;
    }
}
