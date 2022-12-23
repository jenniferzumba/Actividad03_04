/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonna
 */
public class ProductoServiceImpl implements ProductoService{
    private static List<Producto>productoLista = new ArrayList<>();
    

    @Override
    public void crearProduct(Producto producto) {
        productoLista.add(producto);
    }

    @Override
    public List<Producto> mostrarInfo() {
        return productoLista;
    }


    @Override
    public void eliminarProducto(int indice) {
        productoLista.remove(indice);
    }

    @Override
    public Producto buscarPorCodigo(int codigo) {
        Producto retorno = null;
        for (var producto : this.productoLista) {
            if (codigo == producto.getCodigo()) {
                retorno = producto;
                break;
            }
        }
        return retorno;
    }
    
    
    
    
}
