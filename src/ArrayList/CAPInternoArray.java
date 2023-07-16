/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.CAPInterno;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class CAPInternoArray {
     private ArrayList <CAPInterno> interno;


    public CAPInternoArray() {
       interno=new ArrayList<CAPInterno>();
    }

    

    //agregar empleado
    public void agregarEmpleado(CAPInterno in){
        interno.add(in);
    }
    
    public CAPInterno obtener (int posicion){
        return interno.get(posicion);
    }
    
    public int tamañoArreglo(){
        return interno.size();
    }
}
