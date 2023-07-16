/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author yosse
 */
public class CAPExterno extends CADatosEncargado{
    private int RUC;
    private String direccion;
    private int telefono;
    private String correo;
    private String encargado;
    private int añoIngreso;


    public CAPExterno(int RUC, String direccion, int telefono, String correo, String encargado, String nombreProveedor, int añoIngreso) {
        super(nombreProveedor);
        this.RUC = RUC;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.encargado = encargado;
        this.añoIngreso=añoIngreso;
    }
    
    

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    

    
    
    @Override
    public String tiempoProveedor()  {
        String demora = null;
        if (getAñoIngreso()>=1 && getAñoIngreso()<=4) {
            demora= "40 dias" 
                    ;}
        if (getAñoIngreso()>=4 && getAñoIngreso()<=9) {
            demora= "25 dias" ;}
        if (getAñoIngreso()>=10) {
            demora= "20 dias" ;}
        return demora;
    
    }
}
    


