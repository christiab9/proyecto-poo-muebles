/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.*;

public class dbConcetion {
static String url="jdbc:mysql://localhost:3306/db_tienda";
static String user="root";
static String pass="admin";

 public static Connection conectar()
 {
 Connection con = null;

    try {
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexion exitosa");
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return con;
}
}
