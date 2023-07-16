package ArrayList;

import Clases.IntDEmpleado;
import java.util.ArrayList;

/**
 *
 * @author yosse
 */
public class IntEmpleadoArray {
    private ArrayList <IntDEmpleado> empleados;

    public IntEmpleadoArray() {
        empleados=new ArrayList<IntDEmpleado>();
    }

    //agregar empleado
    public void agregarEmpleado(IntDEmpleado empleado){
        empleados.add(empleado);
    }
    
    public IntDEmpleado obtener (int posicion){
        return empleados.get(posicion);
    }
    
    public int tamañoArreglo(){
        return empleados.size();
    }
    
}
