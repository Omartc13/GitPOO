/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */
public class PHigiene extends PProductos{
    private double contenido;
    private String tipoFabricado;

    public PHigiene(String nombre_producto, int codigo, int proveedor, String tipo, double precio, int stock,double contenido, String tipoFabricado) {
        super(nombre_producto, codigo, proveedor, tipo, precio, stock);
        this.contenido = contenido;
        this.tipoFabricado = tipoFabricado;
    }

    

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getTipoFabricado() {
        
        if (tipoFabricado.equals("90% Natural")) {
            tipoFabricado = "90% Natural";
        } else
            if (tipoFabricado.equals("50% Natural")) {
            tipoFabricado = "50% Natural";
        }
        
        return tipoFabricado;
    }

    public void setTipoFabricado(String tipoFabricado) {
        this.tipoFabricado = tipoFabricado;
    }
    
    
    
}
