/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */
public class HSucursalesProvincia extends HSucursales{
    private String provincia;
    private int codigoProvincia;

    public HSucursalesProvincia(String provincia, int codigoProvincia, int numSucursal, String encargado, int DNI, int telefono, String ciudad, String dirección) {
        super(numSucursal, encargado, DNI, telefono, ciudad, dirección);
        this.provincia = provincia;
        this.codigoProvincia = codigoProvincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    
    public String mostrarinfoo() {
    return  "\nNúmero de Sucursal: " + getNumSucursal() + "\n" +
        "Nombre del Encargado: " + getEncargado() + "\n" +
        "DNI: " + getDNI() + "\n" +
        "Teléfono: " + getTelefono() + "\n" +
        "Ciudad: " + getCiudad() + "\n" +
        "Dirección: " + getDirección() + "\n" +
        "Provincia: " + getProvincia() + "\n" +
        "Código Provincia: " + getCodigoProvincia() + "\n";
   }
    
}
