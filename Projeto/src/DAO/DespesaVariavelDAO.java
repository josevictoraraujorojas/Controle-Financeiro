package DAO;

import Controle.controllerBD;
import Modelo.DespesaVariavel;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DespesaVariavelDAO {
    public boolean save(DespesaVariavel despesaVariavel, Usuario usuario) {

        String sql = "INSERT INTO despesa_variavel(id,valor,qtd_parcelas,parcelas_pagas,categoria, data_emissao,data_vencimento, descricao, recorrencia) " +
                "VALUES(?,?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            // Converter e formatar as datas
            LocalDate dataEmissao = LocalDate.parse(despesaVariavel.getDataEmissao(), formatoBrasileiro);
            LocalDate dataVencimento = LocalDate.parse(despesaVariavel.getDataDeVencimento(), formatoBrasileiro);

            String dataEmissaoAmericana = dataEmissao.format(formatoAmericano);
            String dataVencimentoAmericana = dataVencimento.format(formatoAmericano);

            pstm.setInt(1, usuario.getId());
            pstm.setDouble(2, despesaVariavel.getValor());
            pstm.setInt(3, despesaVariavel.getQtdParcelas());
            pstm.setInt(4, despesaVariavel.getQtdParcelasPagas());
            pstm.setString(5, despesaVariavel.getCategoria());
            pstm.setString(6, dataEmissaoAmericana);
            pstm.setString(7, dataVencimentoAmericana);
            pstm.setString(8, despesaVariavel.getDescricao());
            pstm.setString(9, despesaVariavel.getRecorrencia());

            pstm.executeUpdate();
            return true;

        } catch (Exception e) {
            return false;
        }
    }


    public int update(DespesaVariavel despesaVariavel) {
        String sql = "UPDATE despesa_variavel SET valor = ?, qtd_parcelas = ?, parcelas_pagas = ?, categoria = ?, data_emissao = ?, data_vencimento = ?, descricao = ?, recorrencia = ? WHERE id_despesa_variavel = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        // Definir os formatadores de data
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try  {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            // Converter e formatar as datas
            LocalDate dataEmissao = LocalDate.parse(despesaVariavel.getDataEmissao(), formatoBrasileiro);
            LocalDate dataVencimento = LocalDate.parse(despesaVariavel.getDataDeVencimento(), formatoBrasileiro);

            String dataEmissaoAmericana = dataEmissao.format(formatoAmericano);
            String dataVencimentoAmericana = dataVencimento.format(formatoAmericano);

            // Define os valores para os parâmetros da consulta SQL
            pstm.setDouble(1, despesaVariavel.getValor());
            pstm.setInt(2, despesaVariavel.getQtdParcelas());
            pstm.setInt(3, despesaVariavel.getQtdParcelasPagas());
            pstm.setString(4, despesaVariavel.getCategoria());
            pstm.setString(5,dataEmissaoAmericana);
            pstm.setString(6, dataVencimentoAmericana);
            pstm.setString(7, despesaVariavel.getDescricao());
            pstm.setString(8, despesaVariavel.getRecorrencia());
            pstm.setInt(9, despesaVariavel.getIdDespesaVariavel());

            // Executa a atualização no banco de dados
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                return 1;
            } else {
                return 2;
            }

        } catch (Exception e) {
            return 3;
        } finally {
            // Fecha os recursos
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteById(int idDespesaVariavel) {
        String sql = "DELETE FROM despesa_variavel WHERE id_despesa_variavel = ?";

        Connection conn;
        PreparedStatement pstm = null;

        try  {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idDespesaVariavel);
            int rowsAffected = pstm.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Despesa Deletada!!");
            } else {
                JOptionPane.showMessageDialog(null,"Despesa não encontrada");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<DespesaVariavel> listarDVPeloID(int id) {

        String sql = "SELECT * FROM despesa_variavel WHERE id = ?";
        ArrayList<DespesaVariavel> despesasVariaveis = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {

                LocalDate dataEmissao = LocalDate.parse(rs.getString("data_emissao"), formatoAmericano);
                LocalDate dataVencimento = LocalDate.parse(rs.getString("data_vencimento"), formatoAmericano);

                String dataEmissaoBrasileira = dataEmissao.format(formatoBrasileiro);
                String dataVencimentoBrasileira = dataVencimento.format(formatoBrasileiro);

                DespesaVariavel despesaVariavel = new DespesaVariavel();
                despesaVariavel.setIdDespesaVariavel(rs.getInt("id_despesa_variavel"));
                despesaVariavel.setId(rs.getInt("id"));
                despesaVariavel.setValor(rs.getDouble("valor"));
                despesaVariavel.setQtdParcelas(rs.getInt("qtd_parcelas"));
                despesaVariavel.setQtdParcelasPagas(rs.getInt("parcelas_pagas"));
                despesaVariavel.setCategoria(rs.getString("categoria"));
                despesaVariavel.setDataEmissao(dataEmissaoBrasileira);
                despesaVariavel.setDataDeVencimento(dataVencimentoBrasileira);
                despesaVariavel.setDescricao(rs.getString("descricao"));
                despesaVariavel.setRecorrencia(rs.getString("recorrencia"));
                despesasVariaveis.add(despesaVariavel);
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
        return despesasVariaveis;
    }

    public double somaDespesaVariavel(int userId) {
        String sql = "SELECT SUM(valor) AS total FROM despesa_variavel WHERE id = ?";
        double total = 0.0;

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, userId);
            rs = pstm.executeQuery();
            rs.next();
            total = rs.getDouble("total");

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
        return total;
    }
}

