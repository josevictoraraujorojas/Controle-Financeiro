package DAO;

import Controle.controllerBD;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class loginDAO {
    public void save(Usuario usuario) {
        String sql = "INSERT INTO usuario(login,senha,saldo)"+
                 "VALUES(?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            pstm.setDouble(3,usuario.getSaldo());
            pstm.execute();
            if (pstm.getUpdateCount()>0)
                JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            else
                JOptionPane.showMessageDialog(null,"N�o foi poss�vel inserir!!");
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

}
