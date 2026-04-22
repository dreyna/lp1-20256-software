/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.*;

/**
 *
 * @author docente.fia
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3307/dbventas";
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String USER="root";
    private static final String PASS="mysql123";
    private static Connection cx=null;
    
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
        return cx;
    }
}
