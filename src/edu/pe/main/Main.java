package edu.pe.main;

import edu.pe.util.DBConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class Main {

    
    public static void main(String[] args) throws SQLException {
        String nom ="jose";
        int id = 6;
        Connection c = null;
        PreparedStatement stm = null;
        ResultSet resutaldo = null;
        c= new DBConexion().getConexion();
        String sql = "insert into cliente(id_cliente,nombre) values (?,?)";
        stm = c.prepareStatement(sql);
        
       stm.setInt(1, id);
       stm.setString(2, nom);
      // stm.executeUpdate();
        
        String sqlL = "(SELECT * FROM cliente)";
        stm = c.prepareStatement(sqlL);
      resutaldo = stm.executeQuery();
       while(resutaldo.next()){
          resutaldo.getString("nombre");
           System.out.println(resutaldo.getString("nombre"));
       }
       
    }
}
