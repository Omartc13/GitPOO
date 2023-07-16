/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.PComida;
import Clases.PMakeup;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class PMakeupArray {
      private ArrayList <PMakeup> makeup;

    public PMakeupArray() {
        makeup=new ArrayList<PMakeup>();
    }

    //agregar empleado
    public void agregarProductoM(PMakeup mak){
        makeup.add(mak);
    }
    
    public PMakeup obtener (int posicion){
        return makeup.get(posicion);
    }
    
    public int tamañoArreglo(){
        return makeup.size();
    }
}
