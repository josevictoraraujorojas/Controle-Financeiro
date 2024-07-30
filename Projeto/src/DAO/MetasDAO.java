package DAO;

import Controle.controllerBD;
import Modelo.Metas;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetasDAO {
    Metas metas = new Metas();

    public void save(Metas metas) {
        String sql = "INSERT INTO metas(categoria, status, data_inicial, data_final, descricao, valor_total, valor_arrecadado, recorrencia) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, metas.getId());
            pstm.setString(2, metas.getCategoria());
            pstm.setBoolean(3, true);
            pstm.setString(4, metas.getDataInicial());
            pstm.setString(5, metas.getDataFinal());
            pstm.setString(6, metas.getDescricao());
            pstm.setFloat(7, metas.getValorTotal());
            pstm.setFloat(8, metas.getValorArrecadado());
            pstm.setString(9, metas.getRecorrencia());

            System.out.println("Meta salva com sucesso!");
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
    public List<Metas> listAll() {
        String sql = "SELECT * FROM metas";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Metas> metasList = new ArrayList<>();

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                metas.setId(rs.getInt("id"));
                metas.setCategoria(rs.getString("categoria"));
                metas.setStatus(rs.getBoolean("status"));
                metas.setDataInicial(rs.getString("data_inicial"));
                metas.setDataFinal(rs.getString("data_final"));
                metas.setDescricao(rs.getString("descricao"));
                metas.setValorTotal(rs.getFloat("valor_total"));
                metas.setValorArrecadado(rs.getFloat("valor_arrecadado"));
                metas.setRecorrencia(rs.getString("recorrencia"));
                metasList.add(metas);
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
        return metasList;
    }


}
