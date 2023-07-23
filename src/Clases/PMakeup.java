/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */
public class PMakeup extends PProductos{
    
    private String tonos;
    private String dirigidoPara;
    private String fabricado;

    public PMakeup(String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, String tonos, String dirigidoPara, String fabricado) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock);
        this.tonos = tonos;
        this.dirigidoPara = dirigidoPara;
        this.fabricado = fabricado;
    }
    
    public String getTonos() {
        return tonos;
    }

    public void setTonos(String tonos) {
        this.tonos = tonos;
    }

    public String getDirigidoPara() {
        return dirigidoPara;
    }

    public void setDirigidoPara(String dirigidoPara) {
        this.dirigidoPara = dirigidoPara;
    }

    public String getFabricado() {
          if (fabricado.equals("Cruelty free")) {
            fabricado = "Cruelty free";
        } else
            if (fabricado.equals("NO CF")) {
            fabricado = "NO CF";
        }

        return fabricado;
    }

    public void setFabricado(String fabricado) {
        this.fabricado = fabricado;
    }
    
    
    
}
