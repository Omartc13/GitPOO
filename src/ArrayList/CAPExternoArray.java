/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.CAPExterno;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class CAPExternoArray {
     private ArrayList <CAPExterno> externo;

    public CAPExternoArray() {
        externo=new ArrayList<CAPExterno>();
    }


    //agregar empleado
    public void agregarEmpleado(CAPExterno ex){
        externo.add(ex);
    }
    
    public CAPExterno obtener (int posicion){
        return externo.get(posicion);
    }
    
    public int tamañoArreglo(){
        return externo.size();
    }
}
