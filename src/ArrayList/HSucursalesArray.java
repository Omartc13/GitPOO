/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.HSucursales;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class HSucursalesArray {
      private ArrayList <HSucursales> sucursales;

    public HSucursalesArray() {
        sucursales=new ArrayList<HSucursales>();
    }

    

    //agregar empleado
    public void agregarsSucursal(HSucursales suc){
        sucursales.add(suc);
    }
    
    public HSucursales obtener (int posicion){
        return sucursales.get(posicion);
    }
    
    public int tamañoArreglo(){
        return sucursales.size();
    }
}
