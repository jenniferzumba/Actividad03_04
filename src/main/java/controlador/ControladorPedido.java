/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Pedido;
import modelo.Producto;
import servicio.PedidoServiceImpl;
import servicio.ProductoServiceImpl;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonna
 */
public class ControladorPedido {

    private PedidoServiceImpl pedidoServiceImpl = new PedidoServiceImpl();
    private ProductoServiceImpl productoServiceImpl = new ProductoServiceImpl();

    public boolean validarCodigo(int numero) {
        String numCadena = String.valueOf(numero);
        String cadena = numCadena;

        char[] cadenaDiv = cadena.toCharArray();
        String n = "";

        for (int i = 0; i < cadenaDiv.length; i++) {
            if (Character.isDigit(cadenaDiv[i])) {
                n += cadenaDiv[i];
            } else {

                return false;
            }
        }

        if (numero > 0) {

            return true;
        } else {
            return false;
        }
    }

    public boolean validarTexto(String texto) {
        var retorno = true;
        String cadena = texto;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = false;

            }
        }

        return retorno;
    }

    public void validarDatos(String[] datos) {
        boolean valido = true;
        int codigo = Integer.valueOf(datos[0]);
        String comprador = datos[1];
        String tipoMercaderia = datos[2]; 
        var productos = this.productoServiceImpl.buscarPorCodigo(Integer.valueOf(datos[3]));

        if (this.validarCodigo(codigo) == false) {
            valido = false;
        }
        if (this.validarTexto(comprador) == false) {
            valido = false;
        }
        if (valido == true) {
            var pedido = new Pedido(codigo, comprador, tipoMercaderia, productos);
            this.pedidoServiceImpl.crearPedido(pedido);
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo producto");

        } else {
            JOptionPane.showMessageDialog(null, "No se creo el pedido!");

        }

    }

    public void eliminarPedido(int indice) {
        pedidoServiceImpl.eliminarPedido(indice);
    }

    public List<Pedido> mostrarInfo() {
        return pedidoServiceImpl.mostrarInfo();
    }
}
