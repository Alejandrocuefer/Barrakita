
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
public class Caja3 {
    
    private int descuento = 2;

    private ArrayList<Productos> listaProductos = new ArrayList();
    
    public Caja3(Productos bolsa_patatasF, Productos pack_cervezas, Productos paquete_garbanzos, Productos fideos_chinos, Productos judias_lata, Productos azucar) {
        listaProductos.add(bolsa_patatasF);
        listaProductos.add(pack_cervezas);
        listaProductos.add(paquete_garbanzos);
        listaProductos.add(fideos_chinos);
        listaProductos.add(judias_lata);
        listaProductos.add(azucar);
    }

    public Caja3() {
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

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Caja3{" + "descuento=" + descuento + ", listaProductos=" + listaProductos + '}';
    }
    
    
}
