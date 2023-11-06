package ies.puerto;

public class Banco {
    private String nombreTitular;
    private float numeroCuenta;

    private double saldo;

    public Banco() {
    }

    public Banco(String nombreTitular, float numeroCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public double introducirSaldo(double saldo){
        return this.saldo+=saldo;
    }
    public double retirarSaldo(double saldo){

        return this.saldo-=saldo;
    }

    public String mostrarSaldo(){
        String saldo="Tu saldo es :"+this.saldo+". ";
                if(this.saldo<0.0){
                    saldo+=" Debes dinero";
                }
        return saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public float getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(float numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
