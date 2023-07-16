/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/*
 *
 * @author yosse
 */
public abstract class CADatosEncargado {
    private String nombreProveedor;

    public CADatosEncargado(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

   
    //Metodo abstracto
    public abstract String tiempoProveedor();
    
}
