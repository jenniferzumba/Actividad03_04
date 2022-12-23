/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;


import modelo.Pedido;
import modelo.Producto;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface PedidoService {
    public void crearPedido(Pedido pedido);
     public void eliminarPedido(int indice);
    public List<Pedido> mostrarInfo();
     public Pedido buscarPorCodigo(int codigo);
    
    
}
