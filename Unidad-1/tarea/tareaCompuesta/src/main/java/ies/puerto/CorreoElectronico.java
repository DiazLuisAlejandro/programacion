package ies.puerto;

import java.util.Scanner;

public class CorreoElectronico {

    private String correo;

    public CorreoElectronico(String correo) {
        this.correo = correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public CorreoElectronico() {
    }

    public boolean validar(String correoS) throws CorreoElectronicoExecption {
        boolean validar=false;
        //this.correo=correo.toLowerCase();
        if (correoS.matches("^[a-zA-Z0-9\\-_]+@[a-zA-Z0-9\\-_]+\\.[a-z]{2}[a-z]*$")){
            validar=true;
        }else{
            throw new  CorreoElectronicoExecption("correo no valido");
        }

        return validar;
    }
}
