package org.example;

public class Banco {
    private String nombreTitular;
    private String numeroCuenta;
    private double saldo;

    public Banco(){

    }
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double addSaldo(double addsaldo){
        return saldo+addsaldo;
    }

    public String substracSaldo(double substracSaldo){
        if (saldo-substracSaldo<0){
            return "No se puede retirar";
        }else{
            setSaldo(this.saldo-substracSaldo);
            return "Retiro ejecutado";
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
