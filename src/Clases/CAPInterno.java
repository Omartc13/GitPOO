package Clases;

/**
 *
 * @author yosse
 */
public class CAPInterno extends CADatosEncargado{
    private String area;
    private double sueldo;
    private int dni;

    
    
    public CAPInterno(String area,int dni, String nombreProveedor) {
        super(nombreProveedor);
        this.area = area;
        this.dni = dni;
    }

    public CAPInterno(String nombreProveedor) {
        super(nombreProveedor);
    }
    
    
    
    public String getArea() {
        
        return area;
    }

    public void setArea(String Area) {
        this.area = Area;
    }

    public double getSueldo() {
        switch (area) {
            case "Dirección":
                sueldo= 6000;
                break;
            case "Recursos Humanos":
                sueldo= 5000;
                break;
            case "Finanzas":
                sueldo= 4000;
                break;
            case "Marketing":
                sueldo= 6500;
                break;
            case "Tecnología":
                sueldo= 7500;
                break;
            default:
                break;
        }
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String tiempoProveedor() {
    return "";}

    

}
