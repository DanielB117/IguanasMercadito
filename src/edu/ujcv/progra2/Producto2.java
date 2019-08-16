package edu.ujcv.progra2;
import java.util.ArrayList;
import java.util.Scanner;
public class Producto2 {
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private int codigo;
    private String nombre;
    private double precio;
    private  ArrayList<Producto2> listC = new ArrayList<Producto2>();
    public static Producto2 getNewProduct(){
        Scanner sc = new Scanner(System.in);
        LectorDeTecladoValidado LDTV = LectorDeTecladoValidado.getInstance();
        int code = LDTV.getInteger("Ingrese el codigo del producto: " , "lo que presionado no es valido, intente de nuevo");
        System.out.println("Ingrese el nombre del producto: ");
        String name = sc.nextLine();
        double price = LDTV.getDouble("Ingrese el precio del prodducto ", "lo que presionado no es valido, intente de nuevo");
        return new Producto2(code,name, price);
    }
    public Producto2(int CodigoDelProducto, String NombreDelProducto, double PrecioDelProducto){
        this.codigo = CodigoDelProducto;
        this.nombre = NombreDelProducto;
        this.precio = PrecioDelProducto;
    }
    public void addListC(){

        listC.add(this);
    }
    public void removeListC(int index){

        listC.remove(index);
    }
    public static void showListC(ArrayList<Producto2> a){
        for (int i = 0; i <a.size() ; i++){
            System.out.println(" == " + "Numero del producto: " + a.get(i).getCodigo()  + " ==" + "Nombre del producto: " + a.get(i).getNombre() + " = " + "Precio del producto: " +  a.get(i).getPrecio() );
        }
    }
    public static void showListPrice(ArrayList<Producto2> a, ArrayList<Integer> b){
        for (int i = 0; i <a.size() ; i++){
            System.out.println(" == " + "Numero del producto: " + a.get(i).getCodigo()  + " == " + "Nombre del producto: " + a.get(i).getNombre() + " = " + "Precio del producto: " +  a.get(i).getPrecio() + " || " + "Cantidad " + b.get(i) );
        }
    }
    public static double total(ArrayList<Producto2> a, ArrayList<Integer> b) {
        double total = 0;
        for (int i = 0; i < a.size(); i++) {
            total = total + a.get(i).getPrecio() * b.get(i);
        }
        return total;
    }



}