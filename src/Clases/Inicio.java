package Clases;

import Framesregis.Tienda;
import Framesregis.FramePrincipal;
import conexionbd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Tc
 */
public class Inicio extends Registro_Gerente{
    
    
    
    public Inicio(String Usuario, String contraseña) {
        super(Usuario, contraseña);
    }

    public Inicio() {
    }
    Conexion db= new Conexion();
    
    
    
    
           
         

    
    
    
}
