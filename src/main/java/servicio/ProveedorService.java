/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import modelo.Proveedor;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface ProveedorService {

    public void crearProveedor(Proveedor proveedor);

    public void eliminarProveedor(int indice);

    public List<Proveedor> mostrarInfo();
    
   

}
