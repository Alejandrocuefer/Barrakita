
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
public class Caja1 implements Caja{
    
    int descuento = 2;

    private ArrayList<Productos> listaProductos = new ArrayList();

    public Caja1(Productos toallitas, Productos papel_higienico, Productos coca_cola, Productos barra_pan, Productos botella_lejia, Productos pasta_dientes, Productos botella_aceite) {
        listaProductos.add(toallitas);
        listaProductos.add(papel_higienico);
        listaProductos.add(coca_cola);
        listaProductos.add(barra_pan);
        listaProductos.add(botella_lejia);
        listaProductos.add(pasta_dientes);
        listaProductos.add(botella_aceite);
    }

    public double calcularPrecio() {
        double precio = 0;

        for (Productos pro : listaProductos) {
            precio += pro.getPrecio();
        }
        return precio - descuento;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Caja1_1{" + "descuento=" + descuento + ", listaProductos=" + listaProductos + '}';
    }

    @Override
    public String getProductos() {
        return null;
        
    }

    
    
    

}
