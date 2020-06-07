
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Caja2 {
     private int descuento = 2;

    private ArrayList<Productos> listaProductos = new ArrayList();

    public Caja2(Productos bolsa_patatasFritas, Productos pack_cervezas, 
            Productos bolsa_patatasDelta, Productos paquete_lentejas, Productos kikos) {

        listaProductos.add(bolsa_patatasFritas);
        listaProductos.add(pack_cervezas);
        listaProductos.add(bolsa_patatasDelta);
        listaProductos.add(kikos);
        listaProductos.add(paquete_lentejas);
    }

    public Caja2() {
    }
    
    public double calcularPrecio() {
        double precio = 0;

        for (Productos pro : listaProductos) {
            precio += pro.getPrecio();
        }
        return precio - descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    @Override
    public String toString() {
        return "Caja2{" + "descuento=" + descuento + ", listaProductos=" + listaProductos + '}';
    }

    
    
}
