package edu.ujcv.progra2;

public class pila {
    private MenuDeProductosd UltimoProductoIngresado;
    int tamano = 0;
    String lista = "";

    public pila(){
        UltimoProductoIngresado = null;
        tamano = 0;
    }
    public void IngreseProducto(int nodo){


        MenuDeProductosd Nuevo_Producto = new MenuDeProductosd(nodo);

        Nuevo_Producto.siguiente = UltimoProductoIngresado;
        UltimoProductoIngresado = Nuevo_Producto;
        tamano++;
    }
    public String Eliminar_Producto(){
        String Auxiliar = UltimoProductoIngresado.producto;
        UltimoProductoIngresado = UltimoProductoIngresado.siguiente;
        tamano--;
        return Auxiliar;
    }

    public  void MostrarProductos(){

        MenuDeProductosd recorrido = UltimoProductoIngresado;

        while (recorrido != null) {
            lista += recorrido.producto + "\n";
            recorrido = recorrido.siguiente;
        }
        System.out.println(lista);
        lista = "";

    }
    public boolean ProductoEliminado(){
        return UltimoProductoIngresado == null;
    }
    public void EliminarProductos(){
        while (!(ProductoEliminado())){
            Eliminar_Producto();

        }

    }

}
