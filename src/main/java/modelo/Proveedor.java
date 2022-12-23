/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonna
 */
public class Proveedor {

    private int codigo;
    private String nombre;
    private String ruta;
    private Pedido codigoPedido;

    public Proveedor(int codigo, String nombre, String ruta,  Pedido codigoPedido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ruta = ruta;
        this.codigoPedido = codigoPedido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCedula(int cedula) {
        this.codigo = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   

    public Pedido getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Pedido codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "cedula=" + codigo + ", nombre=" + nombre + ", ruta=" + ruta + ", codigoPedido=" + codigoPedido + '}';
    }
    
    

}
