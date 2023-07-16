/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.PComida;
import Clases.PHigiene;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class PHigieneArray {
      private ArrayList <PHigiene> higiene;

    public PHigieneArray() {
        higiene=new ArrayList<PHigiene>();
    }

    //agregar empleado
    public void agregarProductoH(PHigiene hig){
        higiene.add(hig);
    }
    
    public PHigiene obtener (int posicion){
        return higiene.get(posicion);
    }
    
    public int tamañoArreglo(){
        return higiene.size();
    }
}
