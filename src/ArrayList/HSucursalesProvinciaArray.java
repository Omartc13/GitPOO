/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.HSucursalesProvincia;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class HSucursalesProvinciaArray {
      private ArrayList <HSucursalesProvincia> sucursalesP;

    public HSucursalesProvinciaArray() {
        sucursalesP=new ArrayList<HSucursalesProvincia>();
    }


    //agregar empleado
    public void agregarSucursalH(HSucursalesProvincia suc){
        sucursalesP.add(suc);
    }
    
    public HSucursalesProvincia obtener (int posicion){
        return sucursalesP.get(posicion);
    }
    
    public int tamañoArreglo(){
        return sucursalesP.size();
    }
}
