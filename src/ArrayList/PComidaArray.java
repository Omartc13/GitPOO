/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.HSucursalesProvincia;
import Clases.PComida;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class PComidaArray {
      private ArrayList <PComida> comida;

    public PComidaArray() {
        comida=new ArrayList<PComida>();
    }

    //agregar empleado
    public void agregarProductoC(PComida com){
        comida.add(com);
    }
    
    public PComida obtener (int posicion){
        return comida.get(posicion);
    }
    
    public int tamañoArreglo(){
        return comida.size();
    }
}
