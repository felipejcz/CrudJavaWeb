
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Produto;

public class ProdutoDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    
    public ProdutoDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public boolean inserir(Produto p){
        String sql = "INSERT INTO Produto(descricao,preco) VALUES(?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Mouse");
            stmt.setDouble(2, 13.0);
            int res = stmt.executeUpdate();
            stmt.close();
            if(res == 0)return false; else return true;
        } catch (Exception e) {
            throw new RuntimeException("Erro: "+e);  
            
        }
        
        
    }
    
}
