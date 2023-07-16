/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */

// Clase del tipo polimorfismo
public class PProductos {
    
    //Atributos principales
    private String nombre_producto;
    private int codigo;
    private int codproveedor;
    private String tipo;
    private double precio;
    private int stock;

    // Constructor con todos los parámetros

    public PProductos(String nombre_producto, int codigo, int codproveedor, String tipo, double precio, int stock) {
        this.nombre_producto = nombre_producto;
        this.codigo = codigo;
        this.codproveedor = codproveedor;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo() {
        return ""+codigo+"";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodproveedor() {
        return codproveedor;
    }

    public void getCodproveedor(int codproveedor) {
        this.codproveedor = codproveedor;
    }
    
    public String detalleProducto(){
        return "...";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
}
