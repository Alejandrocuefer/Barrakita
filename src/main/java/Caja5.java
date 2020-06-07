
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Caja5 {
    
    private int descuento = 0;
    private ArrayList<Productos> stock = new ArrayList();
    private ArrayList<Productos> seleccionados = new ArrayList();

    public Caja5() {
        stock.add(Productos.toallitas);
        stock.add(Productos.papel_higienico);
        stock.add(Productos.coca_cola);
        stock.add(Productos.barra_pan);
        stock.add(Productos.botella_lejia);
        stock.add(Productos.pasta_dientes);
        stock.add(Productos.botella_aceite);
        stock.add(Productos.bolsa_patatasFritas);
        stock.add(Productos.pack_cervezas);
        stock.add(Productos.bolsa_patataDelta);
        stock.add(Productos.kikos);
        stock.add(Productos.paquete_lentejas);
        stock.add(Productos.paquete_garbanzos);
        stock.add(Productos.fideos_chinos);
        stock.add(Productos.judias_lata);
        stock.add(Productos.azucar); 
    }
    
    public ArrayList rellenarCaja(int codigo){
        for (Productos productos : stock) {
            if (productos.getCodigo() == codigo){
                seleccionados.add(productos);
            } else {
                System.out.println("Codigo erroneo");
            }
        }
        return seleccionados;
    }
    
    public double calcularPrecio() {
        double precio = 0;

        for (Productos pro : seleccionados) {
            precio += pro.getPrecio();
        }
        return precio - descuento;
    }

    @Override
    public String toString() {
        return "Caja5{" + "descuento=" + descuento + ", seleccionados=" + seleccionados + '}';
    }    
    
}
