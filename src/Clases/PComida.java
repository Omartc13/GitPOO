/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */
public class PComida extends PProductos {
    
    private int caducidad;


    public PComida(String nombre_producto, int codigo, int proveedor, String tipo, double precio, int stock,int caducidad) {
        super(nombre_producto, codigo, proveedor, tipo, precio, stock);
        this.caducidad = caducidad;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }


    public double condicionarTipo(){
        double precioB = 0;
        if (getTipo().equals("Fruta/Verdura")) {
            precioB= getPrecio() + getPrecio()*0.05;
        } else
            if (super.getTipo().equals("Embutidos")) {
            precioB= getPrecio() + getPrecio()*0.1;
        } else
                if (super.getTipo().equals("Otros")) {
            precioB= getPrecio() + getPrecio()*0.2;
        } else
                    if (super.getTipo().equals("Bebida")) {
            precioB= getPrecio() + getPrecio()*0.3;
        } else
                        if (super.getTipo().equals("Proteina")) {
            precioB= getPrecio() + getPrecio()*0.35;
        } 
        return precioB;
    }
}
