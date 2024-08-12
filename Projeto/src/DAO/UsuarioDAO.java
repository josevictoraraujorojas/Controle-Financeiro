package DAO;

import Controle.controllerBD;
import Modelo.Carteira;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public void saveUsuarioCarteira(Usuario usuario){

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
            pstm.setDouble(4, usuario.getCarteira().getLimiteDespesaFixa());
            pstm.setDouble(5, usuario.getCarteira().getLimiteDespesaVariavel());
            pstm.setDouble(6, usuario.getCarteira().getLimiteMetas());
            pstm.setBoolean(7, usuario.getCarteira().isStatus());
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

    public void updateUsuarioCarteira(Usuario usuario){
        String sql = "UPDATE `usuario` SET senha = ?, saldo = ?, limite_despesa_fixa = ?, limite_despesa_variavel = ?, limite_metas = ?, status = ? WHERE login = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getSenha());
            pstm.setDouble(2, usuario.getSaldo());
            pstm.setDouble(3, usuario.getCarteira().getLimiteDespesaFixa());
            pstm.setDouble(4, usuario.getCarteira().getLimiteDespesaVariavel());
            pstm.setDouble(5, usuario.getCarteira().getLimiteMetas());
            pstm.setBoolean(6, usuario.getCarteira().isStatus());
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

    public Usuario autenticar(String login, String senha) {

        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setSaldo(rs.getDouble("saldo"));


                return usuario;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
        return null;
    }
}
