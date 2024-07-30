package DAO;

import Controle.controllerBD;
import Modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public boolean autenticar(String login, String senha) {
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
                    return true;
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
            return false; // Falha na autenticação
        }

}

