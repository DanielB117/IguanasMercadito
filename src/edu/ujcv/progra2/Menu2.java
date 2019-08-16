package edu.ujcv.progra2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Menu2 {
    ArrayList<Cliente2> listA = new ArrayList<>(5);
    ArrayList<Producto2> listB = new ArrayList<>(5);
    ArrayList<Producto2> listD = new ArrayList<>(5);
    ArrayList<Integer> listE = new ArrayList<>(5);
    public void menu2() {
        listA.add(new Cliente2(0006, "=Juan Orlando Hernandez"));
        listA.add(new Cliente2(0001, "=Oscar Betancourth"));
        listA.add(new Cliente2(0002, "=Rocio Betancourth"));
        listA.add(new Cliente2(0003, "=Ricardo Milos"));
        listA.add(new Cliente2(0004, "=Rick Astley"));
        listA.add(new Cliente2(0005, "=Joseph Joestar"));
        listB.add(new Producto2(001, "=Harina", 10));
        listB.add(new Producto2(002, "=Queso", 20));
        listB.add(new Producto2(003, "=Mantequilla", 15));
        listB.add(new Producto2(004, "=Jugo de naranja", 25));
        System.out.println("-----------------Bienvenido al menu del Supermercadito las colinas----------------");
        System.out.println("Elija una de las opciones ");
        System.out.println("====================================================================================");
        System.out.println("Estas para agregar o eliminar clientes o productos");
    System.out.println("1.Agregar cliente");
    System.out.println("2.Remover cliente");
        System.out.println("3.Quitar producto");
    System.out.println("4. Incluir producto");
        System.out.println("====================================================================================");
        System.out.println("Ver las listas o iniciar");
        System.out.println("5. Ver clientes ");
        System.out.println("6. Ver productos ");
        System.out.println("====================================================================================");
        System.out.println("Ingresar compras y facturar");
        System.out.println("7. Compras y facturar");
        System.out.println("8. Salir");
        int x;
        do {
            LectorDeTecladoValidado LDTV = LectorDeTecladoValidado.getInstance();
            x = LDTV.getInteger("", "Ha ingresado un valor incorrecto");
            switch (x) {
                case 1:
                    listA.add(Cliente2.getNewClient());
                    break;
                case 2:
                    int v = LDTV.getInteger("Ingrese el numero en donde se encuentra el cliente no deseado: \"", "Trate de nuevo");
                    listA.remove(v);
                    break;
                case 3:
                    int a = LDTV.getInteger("Ingrese el numero en donde se encuentra el producto no deseado ", "Intente nuevamente");
                    listB.remove(a);
                    break;
                case 4:
                    listB.add(Producto2.getNewProduct());
                    break;
                case 5:
                Cliente2.showListC(listA);
                break;
                case 6:
                    Producto2.showListC(listB);
                    break;
                case 7:
                    factura();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ha surgido un error, pruebe de nuevo");
            }
        } while (x != 8);
    }
    public void factura(){
        LectorDeTecladoValidado LDTV = LectorDeTecladoValidado.getInstance();
        System.out.println("Mercadito las colinas\n" +
                "Ingrese el codigo de los productos y la cantidad de este mismo\n" +
                "Al completar las compras ingrese las teclas -1 para finalizar");
        int x = 0;
        double totalFac = 0;
        do {
            x = LDTV.getInteger("Codigo de producto", "lo que presionado no es valido, intente de nuevo");
            for (int i = 0; i < listB.size(); i++) {
                if (listB.get(i).getCodigo() == x) {
                    int y = LDTV.getInteger("Cantidad", "lo que presionado no es valido, intente de nuevo");
                    listD.add(listB.get(i));
                    listE.add(y);
                }
            }
        } while (x != -1);
        System.out.println("Desea la factura con RTN?\n" +
                "1. Si" +
                "2. No");
        int respuesta = LDTV.getInteger("" , "Intente nuevamente");
        if (respuesta == 1) {
            int RTN = LDTV.getInteger("Ingrese el RTN: ", "Ha surgido un error pruebe nuevamente");
            for (int i = 0; i < listA.size(); i++) {
                if (listA.get(i).getDNI() == RTN) {
                    System.out.println("Ha inscrito un nuevo cliente " + listA.get(i).getNombre() + " " + listA.get(i).getDNI());
                    int  vari = i;
                }
            }
            System.out.println("FACTURA");
            DateFormat hourdateFormat = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
            Date date = new Date();
            System.out.println(hourdateFormat.format(date));
            System.out.println("==============================================");
            System.out.println("       Cajero: Daniel Betancourth   ");
            System.out.println("---------------------------------");
            System.out.println("       Mercadito las colinas , Colonia 15 de septiembre, Cantarranas    ");
            System.out.println("Correo: \nColinasSupermercado@gmail.com");
            System.out.println("       Tel: +504 88736643      ");
            System.out.println("RTN: " + RTN);
            Producto2.showListPrice(listD,listE);
            System.out.println("Total: " + Producto2.total(listD,listE));
            System.out.println("        - Se ha terminado la accion -       ");
        }else {
            System.out.println("FACTURA");
            DateFormat hourdateFormat = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
            Date date = new Date();
            System.out.println(hourdateFormat.format(date));
            System.out.println("=========================================");
            System.out.println("       Cajero: Daniel Betancourth  ");
            System.out.println("---------------------------------");
            System.out.println("Mercadito las colinas,Colonia 15 de septiembre, Cantarranas");
            System.out.println("Correo: \nColinasSupermercado@gmail.com");
            System.out.println("       Tel: +504 88736643        ");
            System.out.println("RTN: ND");
            Producto2.showListPrice(listD, listE);
            System.out.println("Total: " + Producto2.total(listD, listE));
            System.out.println("Copia: Obligado emisor");
            System.out.println("        - Se ha terminado la accion -       ");
        }
    }
}