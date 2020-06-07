
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class Barrakita {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        // Creacion de cajas
        Caja1 caja1 = new Caja1(Productos.toallitas, Productos.papel_higienico, Productos.coca_cola, Productos.barra_pan, Productos.botella_lejia, Productos.pasta_dientes, Productos.botella_aceite);
        Caja2 caja2 = new Caja2(Productos.bolsa_patatasFritas, Productos.pack_cervezas, Productos.bolsa_patataDelta, Productos.paquete_lentejas, Productos.kikos);
        Caja3 caja3 = new Caja3(Productos.bolsa_patatasFritas, Productos.pack_cervezas, Productos.paquete_garbanzos, Productos.fideos_chinos, Productos.judias_lata, Productos.azucar);
        Caja4 caja4 = new Caja4(Productos.pack_cervezas, Productos.toallitas, Productos.papel_higienico, Productos.coca_cola,Productos.barra_pan, Productos.botella_lejia, Productos.pasta_dientes);
        Caja5 caja5 = new Caja5();

        System.out.println("-------------------");
        System.out.println("La barrakita");
        System.out.println("-------------------");
        System.out.println("Que quiere comprar");
        
        do {
            System.out.println("1. Caja 1");
            System.out.println("2. Caja 2");
            System.out.println("3. Caja 3");
            System.out.println("4. Caja 4");
            System.out.println("5. Caja 5");

            opcion = teclado.nextInt();
        } while (opcion < 0 || opcion > 5);
        
        switch (opcion) {
            case 1:  
                System.out.println(caja1.toString());
                System.out.println(caja1.calcularPrecio());
                     break;
            case 2:  
                System.out.println(caja2.toString());
                System.out.println(caja2.calcularPrecio());
                     break;
            case 3:  
                System.out.println(caja3.toString());
                System.out.println(caja3.calcularPrecio());
                     break;
            case 4:  
                System.out.println(caja4.toString());
                System.out.println(caja4.calcularPrecio());
                     break;
            case 5:  
                seleccionarProductos();
                System.out.println(caja5.toString());
                System.out.println(caja5.calcularPrecio());
                     break;
        }
    
    }
    
    public static void seleccionarProductos() {
        Caja5 caja5 = new Caja5();
        Scanner teclado = new Scanner(System.in);
        int capacidadCaja = 6;
        
        do {
            System.out.println("El límite de productos es " + capacidadCaja);
            int codigo = teclado.nextInt();
            caja5.rellenarCaja(codigo);
            capacidadCaja--;

        } while (capacidadCaja != 0);

        System.out.println(caja5.calcularPrecio());

    }

}
