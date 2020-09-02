package com.mycompany.persistencia;

import java.sql.*;


public class Conexion {
    private Connection con= null;
    private final String puerto = "3306";
    private final String server = "localhost:" + puerto;
    private final String base = "empresa";
    private final String user = "root";
    private final String pass = "";
    
    //Metodo que conecta a la BD
    public Connection Conectar() throws Exception  {
        try{
            con = DriverManager.getConnection("jdbc:mysql;//" + server + "/" + base, user ,pass);
            
            //si llega aca es que se conectó bien
            System.out.println("Conectado con éxito");
            
            return con;
        } catch (SQLException e) {
            throw new Exception (e);
        }
    }
    //Metodo que cierra la conexion con la DB
    
    public void Cerrar() throws SQLException{
        if (con != null) {
            if (!con.isClosed()){
                con.close();
            }
        }
    }               
}
