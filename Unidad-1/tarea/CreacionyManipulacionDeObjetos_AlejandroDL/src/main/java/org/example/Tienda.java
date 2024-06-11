package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private final List<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public double precioTotal(){
        double precio=0;
        for (int i = 0; i < productos.size(); i++) {
            Producto producto=productos.get(i);
            precio += producto.getPrecio() * producto.getStock();
        }
        return precio;
    }

    public boolean subscratProducto(Producto producto, int sacar){
        return producto.substraer(sacar);
    }

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i < productos.size(); i++) {
            result+=productos.get(i).toString()+"; ";
        }
        return result;
    }
}
