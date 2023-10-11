package tp13_grupo7;

import java.sql.*;
import java.time.LocalDate;
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
            
//            String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) "
//                    + "VALUES (10,4,2)";
//            PreparedStatement ps=con.prepareStatement(sql);
//            ps.executeUpdate();
            

            //Obtener los datos de los alumnos activos
//            String sql="SELECT* FROM alumno WHERE estado=true";
//            PreparedStatement ps=con.prepareStatement(sql);
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){
//                int id=rs.getInt("idAlumno");
//                int dni=rs.getInt("dni");
//                String nombre=rs.getString("nombre");
//                String apellido=rs.getString("apellido");
//                LocalDate fechaN=rs.getDate("fechaDeNacimiento").toLocalDate();
//                boolean estado=rs.getBoolean("estado");
//                System.out.println("------------------------------------------");
//                System.out.println("Apellido "+apellido);
//                System.out.println("Nombre "+nombre);
//                System.out.println("DNI "+dni);
//                System.out.println("Fecha de nacimiento "+fechaN.toString());
//                System.out.println("Estado "+estado);
//                
//            }
//              
                //Listar alumnos con notas mayor a 8
                
//                String sql="SELECT distinct dni,apellido,nombre " +
//                           "FROM alumno JOIN inscripcion ON (alumno.idAlumno=inscripcion.idAlumno) " +
//                           "WHERE nota>=8;";
//              PreparedStatement ps=con.prepareStatement(sql);
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){
//                int dni=rs.getInt("dni");
//                //double nota=rs.getDouble("nota");
//                String nombre=rs.getString("nombre");
//                String apellido=rs.getString("apellido");
//                System.out.println("------------------------------------------");
//                System.out.println("Apellido "+apellido);
//                System.out.println("Nombre "+nombre);
//                System.out.println("DNI "+dni);
//                //System.out.println("Nota " + nota);
//                
//            }

                //Eliminar inscripcion
                
//              String sql="DELETE FROM inscripcion " +
//                        "WHERE idAlumno=4 AND idMateria=2";
//              PreparedStatement ps=con.prepareStatement(sql);
//              ps.executeUpdate();
              
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver "+ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de Conexion "+ex.getMessage());
            ex.printStackTrace();
        }
            
            
            
        
    }
    
}
