/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Clases.IntDAdministrador;
import Clases.IntDEmpleado;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class IntDAdministradorArray {
    private ArrayList <IntDAdministrador> administrador;

    public IntDAdministradorArray() {
        administrador=new ArrayList<IntDAdministrador>();
    }

    //agregar empleado
    public void agregarEmpleado(IntDAdministrador admin){
        administrador.add(admin);
    }
    
    public IntDAdministrador obtener (int posicion){
        return administrador.get(posicion);
    }
    
    public int tamañoArreglo(){
        return administrador.size();
    }
}
