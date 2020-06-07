/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public enum Productos {
    toallitas (1, 2, "toallitas"),
    papel_higienico (2, 2, "papel higienico"),
    coca_cola (3, 1.7, "coca-cola"),
    barra_pan (4, 1, "barra de pan"),
    botella_lejia (5, 2, "botella de lejia"),
    pasta_dientes (6, 2, "pasta de dientes"),
    botella_aceite (7, 4, "botella de aceite"),
    bolsa_patatasFritas (8, 2, "bola de patatas fritas"),
    pack_cervezas (9, 3, "pack de cervezas"),
    bolsa_patataDelta (10, 1, "bolsa de patatas delta"),
    kikos (11, 1.5, "bolsa de kikos"),
    paquete_lentejas (12, 1.5, "paquete de lentejas"),
    paquete_garbanzos (13, 1.5, "paquete de garbanzos"),
    fideos_chinos (14, 1.5, "fideos chinos rapidos"),
    judias_lata (15, 1.5, "judias en lata"),
    azucar (16, 1.5, "paquete de azucar");
    
    private int codigo;
    private double precio;
    private String nombre;

    private Productos(int codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}