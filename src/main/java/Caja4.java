
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
public class Caja4 {

    private int descuento = 2;
    private ArrayList<Productos> listaProductos = new ArrayList();

    public Caja4(Productos pack_cervezas, Productos toallitas, Productos papel_higienico, Productos coca_cola, Productos barra_pan, Productos botella_lejia, Productos pasta_dientes) {
        listaProductos.add(pack_cervezas);
        listaProductos.add(toallitas);
        listaProductos.add(papel_higienico);
        listaProductos.add(coca_cola);
        listaProductos.add(barra_pan);
        listaProductos.add(botella_lejia);
        listaProductos.add(pasta_dientes);
    }

    public Caja4() {
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
        return "Caja4{" + "descuento=" + descuento + ", listaProductos=" + listaProductos + '}';
    }
    
    

}
