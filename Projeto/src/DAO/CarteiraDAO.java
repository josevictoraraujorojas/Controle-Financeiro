package DAO;

import Controle.controllerBD;
import Modelo.Carteira;
import Modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CarteiraDAO {

    public Carteira getCarteira(int id) {
        String sql = "SELECT saldo, limite_despesa_fixa, limite_despesa_variavel, limite_metas " +
                "FROM usuario " +
                "WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Carteira carteira = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (rs.next()) {
                carteira = new Carteira();
                Usuario usuario = new Usuario();
                usuario.setSaldo(rs.getDouble("saldo"));
                carteira.setLimiteDespesaFixa(rs.getDouble("limite_despesa_fixa"));
                carteira.setLimiteDespesaVariavel(rs.getDouble("limite_despesa_variavel"));
                carteira.setLimiteMetas(rs.getDouble("limite_metas"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return carteira;
    }
}

