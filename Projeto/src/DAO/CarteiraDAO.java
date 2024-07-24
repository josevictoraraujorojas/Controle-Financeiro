package DAO;

import Controle.controllerBD;
import Modelo.Carteira;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CarteiraDAO {



    public void save(Carteira carteira){
        String sql = "INSERT INTO carteira(usuario_id,limite_despesa_fixa,limite_despesa_variavel,limite_metas,status)" +
                " VALUES(?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int carteiraId = -1;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setInt(1, carteira.getUsuarioID());
            pstm.setDouble(2, carteira.getLimiteDespesaFixa());
            pstm.setDouble(3, carteira.getLimiteDespesaFixa());
            pstm.setDouble(4, carteira.getLimiteDespesaVariavel());
            pstm.setDouble(5, carteira.getLimiteMetas());
            pstm.setInt(6, carteira.getStatus());

            pstm.execute();

            rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                carteiraId = rs.getInt(1);
            }

            if (carteiraId > 0) {
                JOptionPane.showMessageDialog(null, "Carteira salva com sucesso! ID: " + carteiraId);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível inserir!");
            }
        } catch (Exception e) {

            e.printStackTrace();
        }finally{
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

