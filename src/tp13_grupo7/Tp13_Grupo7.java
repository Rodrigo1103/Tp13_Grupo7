package tp13_grupo7;

import java.sql.*;
import javax.swing.JOptionPane;


public class Tp13_Grupo7 {

    
    public static void main(String[] args) {
        try {
            //Carga de Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Conexion a la BD
            String URL="jdbc:mariadb://localhost:3307/universidadg7";
            String clave="";
            String usuario="root";
            Connection con=DriverManager.getConnection(URL,usuario,clave);
            
            String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                    + "VALUES (10,4,2)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
            
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver "+ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de Conexion "+ex.getMessage());
        }
            
            
            
        
    }
    
}
