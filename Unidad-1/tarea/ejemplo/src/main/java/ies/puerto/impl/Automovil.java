package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {


    @Override
    public String arrancar() {
        return "Haz arrancado el automovil";
    }

    @Override
    public String detener() {
        return "Haz detenido el automovil";
    }
}
