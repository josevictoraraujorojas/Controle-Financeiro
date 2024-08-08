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


    public void save(Carteira carteira, Usuario usuario){
        String sql = "INSERT INTO `usuario` (login, senha, saldo, limite_despesa_fixa, limite_despesa_variavel, limite_metas, status)"+
                "VALUES(?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            pstm.setDouble(3, usuario.getSaldo());
            pstm.setDouble(4, carteira.getLimiteDespesaFixa());
            pstm.setDouble(5, carteira.getLimiteDespesaVariavel());
            pstm.setDouble(6, carteira.getLimiteMetas());
            pstm.setBoolean(7, carteira.isStatus());
            pstm.execute();

            if (pstm.getUpdateCount()>0)
                JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            else
                JOptionPane.showMessageDialog(null,"Nao foi possivel inserir!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(pstm != null){

                    pstm.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void update(Carteira carteira, Usuario usuario){
        String sql = "UPDATE `usuario` SET senha = ?, saldo = ?, limite_despesa_fixa = ?, limite_despesa_variavel = ?, limite_metas = ?, status = ? WHERE login = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getSenha());
            pstm.setDouble(2, usuario.getSaldo());
            pstm.setDouble(3, carteira.getLimiteDespesaFixa());
            pstm.setDouble(4, carteira.getLimiteDespesaVariavel());
            pstm.setDouble(5, carteira.getLimiteMetas());
            pstm.setBoolean(6, carteira.isStatus());
            pstm.setString(7, usuario.getLogin());

            int rowsUpdated = pstm.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Carteira getCarteira(int id) {
        String sql = "SELECT saldo, limite_despesa_fixa, limite_despesa_variavel, limite_metas, status " +
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
                carteira.setStatus(rs.getBoolean("status"));
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

