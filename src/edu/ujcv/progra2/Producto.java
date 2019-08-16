package edu.ujcv.progra2;

public class Producto {
    private String NombreDeProducto;
    private float PrecioDeProducto;
    private int CantidadDeProducto;

    public Producto(String NombreDeProducto, float PrecioDeProducto, int CantidadDeProducto) {
        this.NombreDeProducto = NombreDeProducto;
        this.PrecioDeProducto = PrecioDeProducto;
        this.CantidadDeProducto = CantidadDeProducto;
    }

    public Producto(int i) {
    }

    public String getNombreDeProducto() {
        return NombreDeProducto;
    }

    public void setNombreDeProducto() {
        this.NombreDeProducto = NombreDeProducto;
    }
    public int getCantidadDeProducto(){
        return CantidadDeProducto;
    }

    public void setCantiCantidadDeProducto(int CantidadDeProducto){
        this.CantidadDeProducto = CantidadDeProducto;
    }
    public float getPrecioDeProducto() {
        return PrecioDeProducto;
    }

    public void setPrecioDeProducto(float PrecioDeProducto) {
        this.PrecioDeProducto = PrecioDeProducto;
    }

    @Override
    public String toString() {
        return String.format("%s %f",NombreDeProducto,PrecioDeProducto,CantidadDeProducto);
    }
}