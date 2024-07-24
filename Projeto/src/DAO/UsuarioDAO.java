package DAO;

import Controle.controllerBD;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
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

    public void remove(String login){

        String sql = "DELETE FROM usuario WHERE login = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, login);

            pstm.execute();
            if (pstm.getUpdateCount()>0)
                JOptionPane.showMessageDialog(null,"Removido com sucesso!");
            else
                JOptionPane.showMessageDialog(null,"Não foi possível remover!!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

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

    public void update(Usuario usuario){

        String sql = "UPDATE usuario SET login = ?, senha = ?, saldo = ?" +
                " WHERE login = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = controllerBD.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, usuario.getLogin());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, usuario.getSenha());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setDouble(3, usuario.getSaldo());

            pstm.setString(4, usuario.getLogin());

            //Executa a sql para inserção dos dados
            pstm.execute();

            if (pstm.getUpdateCount()>0)
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
            else
                JOptionPane.showMessageDialog(null,"Não foi possível atualizar!!");
        } catch (Exception e) {

            e.printStackTrace();
        }finally{

            //Fecha as conexões

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
