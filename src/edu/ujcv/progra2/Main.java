package edu.ujcv.progra2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
//        pila Pila = new pila();
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar el ultimo Articulo agregado");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Eliminar lista");
            System.out.println("5. Facturar");
            System.out.print("6. Salir");
            opcion = leerEntero(sc, "", "Ha ingresado un caracter no valido");
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una opcion");
                    System.out.println("");
                    System.out.println(" Alimento ...... Codigo ...... Precio");
                    System.out.println("1. Pollo ....... 000001 ...... 25 LPS");
                    System.out.println("2. Pescado ..... 000002 ...... 48 LPS");
                    System.out.println("3. Coca-Cola ... 000003 ...... 52 LPS");
                    System.out.println("4. Doritos ..... 000004 ...... 21 LPS");
                    System.out.println("5. Helado  ..... 000005 ...... 75 LPS");
                    System.out.println("6. Leche   ..... 000006 ...... 24 LPS");
                    System.out.println("7. Papas   ..... 000007 ...... 18 LPS");
                    System.out.println("8. Tomate  ..... 000008 ...... 5 LPS");
                    System.out.println("9. Manzanas .... 000009 ...... 12 LPS");
                    System.out.print("10. Uvas ....... 000010 ...... 56 LPS");
//                    Pila.IngreseProducto(leerEntero(sc, "", "Ha ingresado un caracter no valido"));
                    break;
                case 2:
//                    Pila.Eliminar_Producto();
                    System.out.println("se elimino el ultimo producto");
                    break;
                case 3:
//                    Pila.MostrarProductos();
                    break;
                case 4:
//                    Pila.EliminarProductos();
                    break;
                case 5:
                    System.out.println("Desea poner nombre y RTN?");
                    System.out.println("1. SI");
                    System.out.print("2. NO");
                    int y = leerEntero(sc, "", "Ha ingresado un caracter no valido");
                    if (y == 1) {
                        System.out.println("ingrese su nombre");
                        String nombre = sc.nextLine();
                        int RTN = leerEntero(sc, "ingrese su RTN", "Ha ingresado un caracter no valido");

                        System.out.println("            FACTURA            ");
                        System.out.println("-------------------------------");
                        System.out.println("      Super Mercado Iguanas    ");
                        System.out.println("      Mall las aguas negras    ");
                        System.out.println("Juan Pablo Segundo, Tegucigalpa");
                        System.out.println("      Tel: +504 3159-7473      ");
                        System.out.println("Correo: IguanaSupermercado@gmail.com");
                        System.out.println("             FACTURA             ");
                        System.out.println("---------------------------------");
                        System.out.println("       Super Mercado Iguanas     ");
                        System.out.println("       Mall las aguas negras     ");
                        System.out.println(" Juan Pablo Segundo, Tegucigalpa ");
                        System.out.println("       Tel: +504 3159-7473       ");
                        System.out.println("Correo: \nIguanaSupermercado@gmail.com");
                        DateFormat hourdateFormat = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
                        Date date = new Date();
                        System.out.println(hourdateFormat.format(date));
                        System.out.println("Nombre: " + nombre);
                        System.out.println("RTN: " + RTN);
                        System.out.println("Cajero: Andrew Escobar");
                        System.out.println("       Cajero: Andrew Escobar    ");
//                        Pila.MostrarProductos();
                        System.out.println("Subtotal");
                        System.out.println("Impuestos total 15%");
                        System.out.println("Total");
                        System.out.println("Total en Dolares");
                        System.out.println("Subtotal: ");
                        System.out.println("Impuestos total 15%: ");
                        System.out.println("Total: ");
                        System.out.println("Total en Dolares: ");
                        System.out.println("");
                        System.out.println("Copia: Obligado tributario emisor");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" - Cuenta Cerrada -");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("        - Cuenta Cerrada -       ");
                        System.out.println("");


                    } else {
                        System.out.println("            FACTURA            ");
                        System.out.println("-------------------------------");
                        System.out.println("      Super Mercado Iguanas    ");
                        System.out.println("      Mall las aguas negras    ");
                        System.out.println("Juan Pablo Segundo, Tegucigalpa");
                        System.out.println("      Tel: +504 3159-7473      ");
                        System.out.println("Correo: IguanaSupermercado@gmail.com");
                        System.out.println("             FACTURA             ");
                        System.out.println("---------------------------------");
                        System.out.println("       Super Mercado Iguanas     ");
                        System.out.println("       Mall las aguas negras     ");
                        System.out.println(" Juan Pablo Segundo, Tegucigalpa ");
                        System.out.println("       Tel: +504 3159-7473       ");
                        System.out.println("Correo: \nIguanaSupermercado@gmail.com");
                        DateFormat hourdateFormat = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
                        Date date = new Date();
                        System.out.println(hourdateFormat.format(date));
                        System.out.println("Nombre: ND" );
                        System.out.println("RTN: ND");
                        System.out.println("Cajero: Andrew Escobar");
                        System.out.println("       Cajero: Andrew Escobar    ");
//                        Pila.MostrarProductos();
                        System.out.println("Subtotal");
                        System.out.println("Impuestos total 15%");
                        System.out.println("Total");
                        System.out.println("Total en Dolares");
                        System.out.println("Subtotal: ");
                        System.out.println("Impuestos total 15%: ");
                        System.out.println("Total: ");
                        System.out.println("Total en Dolares: ");
                        System.out.println("");
                        System.out.println("Copia: Obligado tributario emisor");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" - Cuenta Cerrada -");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("        - Cuenta Cerrada -       ");
                        System.out.println("");
                    }
                    break;
            }
        } while (opcion != 6);
    }
    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
}
