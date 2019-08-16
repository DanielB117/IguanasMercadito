package edu.ujcv.progra2;

import java.util.Scanner;

public class MenuDeProductosd {
    int precio = 0;
    String producto;
    MenuDeProductosd siguiente;
    Scanner sc = new Scanner(System.in);
    public MenuDeProductosd(int x){

        switch (x){
            case 1:
                precio = precio + 25;
                producto = "Pollo............25";
                siguiente = null;
                break;
            case 2:
                precio = precio + 48;
                producto = "Pescado..........48";
                siguiente = null;
                break;
            case 3:
                precio = precio + 52;
                producto = "Coca-cola........52";
                siguiente = null;
                break;
            case 4:
                precio = precio + 21;
                producto = "Doritos..........21";
                siguiente = null;
                break;
            case 5:
                precio = precio + 75;
                producto = "Helado...........75";
                siguiente = null;
                break;
            case 6:
                precio = precio + 24;
                producto = "Leche............24";
                siguiente = null;
                break;
            case 7:
                precio = precio + 18;
                producto = "Papas............18";
                siguiente = null;
                break;
            case 8:
                precio = precio + 5;
                producto = "Tomate...........5";
                siguiente = null;
                break;
            case 9:
                precio = precio + 12;
                producto = "Manzanas.........12";
                siguiente = null;
                break;
            case 10:
                precio = precio + 56;
                producto = "Uvas.............56";
                siguiente = null;
                break;

        }
        int total_precio = precio;

    }
}



