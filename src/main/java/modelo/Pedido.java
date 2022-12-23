/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonna
 */
public class Pedido {

    private int codigoPedido;
    private String nombreComprador;
    private String tipoDeMercaderia;
    private Producto producto;

    public Pedido(int codigoPedido, String nombreComprador,  String tipoDeMercaderia,  Producto producto) {
        this.codigoPedido = codigoPedido;
        this.nombreComprador = nombreComprador;
        this.tipoDeMercaderia = tipoDeMercaderia;
        this.producto = producto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

  
    public String getTipoDeMercaderia() {
        return tipoDeMercaderia;
    }

    public void setTipoDeMercaderia(String tipoDeMercaderia) {
        this.tipoDeMercaderia = tipoDeMercaderia;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombreComprador=" + nombreComprador + ", tipoDeMercaderia=" + tipoDeMercaderia + ", producto=" + producto + '}';
    }

    
    
}
