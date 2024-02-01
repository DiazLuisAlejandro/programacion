package ies.puerto;

import ies.puerto.abstractas.Vehiculo;
import ies.puerto.vehiculos.Bicicleta;
import ies.puerto.vehiculos.Camion;
import ies.puerto.vehiculos.Coche;
import ies.puerto.vehiculos.Motocicleta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Concesionario {

    private HashSet<Coche> coches;
    private ArrayList<Motocicleta> motocicletas;
    private HashMap<String, Camion> camiones;
    private HashMap<String, Bicicleta> bicicletas;

    public Concesionario(){
        coches=new HashSet<>();
        motocicletas=new ArrayList<>();
    }


    public boolean addMotocicleta(Motocicleta motocicleta){
        boolean estalaMoto=true;
        for (Motocicleta moto:motocicletas) {
            if (moto.getMatricula().equals(motocicleta.getMatricula())){
                estalaMoto=false;
            }
        }
        if (estalaMoto){
            System.out.println("Esa moto ya se habia añadido");
            return false;
        }
        if (!estalaMoto){
            this.motocicletas.add(motocicleta);
            return true;
        }

        return false;
    }
    public boolean removeMotocicleta(Motocicleta motocicleta){
        boolean estalaMoto=true;
        for (Motocicleta moto:motocicletas) {
            if (moto.getMatricula().equals(motocicleta.getMatricula())){
                estalaMoto=false;
            }
        }
        if (estalaMoto){
            return this.motocicletas.remove(motocicleta);
        }
        if (!estalaMoto){
            return false;
        }

        return false;
    }


}
