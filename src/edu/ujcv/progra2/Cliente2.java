package edu.ujcv.progra2;
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente2 {
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int codigo) {
        this.DNI = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private int DNI;
    private String nombre;
    private  ArrayList<Cliente2> listC = new ArrayList<Cliente2>();
    public static Cliente2 getNewClient(){
        Scanner sc = new Scanner(System.in);
        LectorDeTecladoValidado LDTV = LectorDeTecladoValidado.getInstance();
        int code = LDTV.getInteger("==Escriba el DNI del Cliente==: " , "==Pruebe de nuevo porfavor==");
        System.out.println("==Escriba el nombre del comprador==: ");
        String name = sc.nextLine();
        return  new Cliente2(code,name);
    }
    public Cliente2(int CodigoDelCliente, String NombreDelCliente){
        this.DNI = CodigoDelCliente;
        this.nombre = NombreDelCliente;
    }
    public static void showListC(ArrayList<Cliente2> a){
        for (int i = 0; i <a.size() ; i++){
            System.out.println("==" + "DNI del cliente: " +a.get(i).getDNI()+ " == " +"Nombre del cliente: " + a.get(i).getNombre() );
        }
    }
}