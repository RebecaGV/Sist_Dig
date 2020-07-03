/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author flore
 */
public class ControlBD {

    private String _usuario = "root";
    private String _pwd = "";
    private static String _bd = "veterinaria";
    static String _url = "jdbc:mysql://localhost/" + _bd;
    private Connection conn = null;
  

    public ControlBD() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = (Connection) DriverManager.getConnection(_url, _usuario, _pwd);

            if (conn != null) {
                System.out.println("Conexi�n a base de datos " + _url + " . . . Ok");
            }

        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conecarse a la base de datos" + _url);
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Entro otro error");
            System.out.println(ex);
        }
    }

    public ResultSet getQuery(String _query) {
        Statement state = null;
        ResultSet resultado = null;
        try {
            state = (Statement) conn.createStatement();
            resultado = state.executeQuery(_query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Existe problema al realizar la operaci?n con el  Registro");
            e.printStackTrace();

        }
        return resultado;
    }

    public void setQuery(String _query) {

        Statement state = null;

        try {
            state = (Statement) conn.createStatement();
            state.execute(_query);
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Existe problema al realizar la operaci?n con el  Registro");
            e.printStackTrace();
        }
    }

}
