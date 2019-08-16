package edu.ujcv.progra2;

import java.util.Scanner;

public class IntroCliente {
    private Scanner Sc = new Scanner(System.in);
    private DymArray<Cliente> pda = new DymArray<Cliente>();

    public void IntroCliente() {

        System.out.println("NOMBRE DEL CLIENTE DEL SUPERMERCADITO: ");
        String setNombreDeCliente = Sc.next();
        System.out.println("Ingrese codigo cliente");
        int codigo = Sc.nextInt();
        pda.add(new Cliente(setNombreDeCliente, codigo));
    }

    public void ImpresionDeClientes() {
        System.out.println("NOMBRE DEL CLIENTE con codigo: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
    }


    public void RemoverCliente() {
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("numero a borrar en lista de clientes");
        Integer n = Sc.nextInt();
        pda.remove(n+1);

    }

    public void ModificarCliente(){
        System.out.println("COMPRA DEL CLIENTE: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("QUE CLIENTE DE LA LISTA DESEA MODIFICAR: (INGRESE UN NUMERO VALIDO EN LA LISTA DE CLIENTES!!) ");
        int n= Sc.nextInt();
        pda.remove(n-1);
        System.out.println("NOMBRE DEL CLIENTE DEL SUPERMERCADITO: ");
        String setNombreDeCliente = Sc.next();
        System.out.println("Ingrese codigo cliente");
        int codigo = Sc.nextInt();
        pda.add(new Cliente(setNombreDeCliente, codigo));
    }

}