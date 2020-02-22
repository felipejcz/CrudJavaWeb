package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/mercado","root","");
        } catch (Exception e) {
            throw new RuntimeException("Erro: "+e);
        }
    }
}
