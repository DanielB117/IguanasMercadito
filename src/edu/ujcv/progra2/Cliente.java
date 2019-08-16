package edu.ujcv.progra2;

public class Cliente{
    private String NombreDeCliente;
    private int NumeroDeCodigo;



    public Cliente(String NombreDeCliente, int NumeroDeCodigo) {
        this.NombreDeCliente = NombreDeCliente;
        this.NumeroDeCodigo = NumeroDeCodigo;
    }


    public String getNombreDeCliente() {
        return NombreDeCliente;
    }

    public void setNombreDeCliente() {
        this.NumeroDeCodigo = NumeroDeCodigo;
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCodigo;
    }

    public void setNumeroDeCodigo(int NumeroDeCuenta) {
        this.NumeroDeCodigo = NumeroDeCodigo;
    }

    @Override
    public String toString() {
        return String.format("%s %f",NombreDeCliente,NumeroDeCodigo);
    }
}

