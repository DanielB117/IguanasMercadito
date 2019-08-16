
package edu.ujcv.progra2;
import java.util.Scanner;
public class LectorDeTecladoValidado {
    private static LectorDeTecladoValidado instance;
    private Scanner sc;
    public static LectorDeTecladoValidado getInstance(){
        if(instance == null){
            instance = new LectorDeTecladoValidado();
        }
        return instance;
    }
    private LectorDeTecladoValidado(){
        sc = new Scanner(System.in);
    }
    public double getDouble(String mensaje, String reintento){
        double retval = 0;
        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        retval = sc.nextDouble();
        sc.nextLine();
        return retval;
    }
    public int getInteger(String mensaje, String reintento){
        int retval = 0;
        System.out.println(mensaje);
        while(!(sc.hasNextDouble())){
            System.out.println(reintento);
            sc.nextLine();
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
}