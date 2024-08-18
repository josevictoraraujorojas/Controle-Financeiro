package DAO;

import Controle.controllerBD;
import Modelo.DespesaFixa;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DespesaFixaDAO {

    public boolean save(DespesaFixa despesaFixa, Usuario usuario) {
        String sql = "INSERT INTO despesa_fixa (id, valor_mensal, categoria, data_emissao, data_vencimento, descricao, recorrencia) VALUES ( ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        // Definir os formatadores de data
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            // Converter e formatar as datas
            LocalDate dataEmissao = LocalDate.parse(despesaFixa.getDataEmissao(), formatoBrasileiro);
            LocalDate dataVencimento = LocalDate.parse(despesaFixa.getDataDeVencimento(), formatoBrasileiro);

            String dataEmissaoAmericana = dataEmissao.format(formatoAmericano);
            String dataVencimentoAmericana = dataVencimento.format(formatoAmericano);

            // Definir os valores no PreparedStatement
            pstm.setInt(1, usuario.getId());
            pstm.setDouble(2, despesaFixa.getValorMensal());
            pstm.setString(3, despesaFixa.getCategoria());
            pstm.setString(4, dataEmissaoAmericana);
            pstm.setString(5, dataVencimentoAmericana);
            pstm.setString(6, despesaFixa.getDescricao());
            pstm.setString(7, despesaFixa.getRecorrencia());

            pstm.executeUpdate();
            return true;

        } catch (Exception e) {
            return false;
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

    public int update(DespesaFixa despesaFixa) {
        String sql = "UPDATE despesa_fixa SET valor_mensal = ?, categoria = ?, data_emissao = ?, data_vencimento = ?, descricao = ?, recorrencia = ? WHERE id_despesa_fixa = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        // Definir os formatadores de data
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            // Converter e formatar as datas
            LocalDate dataEmissao = LocalDate.parse(despesaFixa.getDataEmissao(), formatoBrasileiro);
            LocalDate dataVencimento = LocalDate.parse(despesaFixa.getDataDeVencimento(), formatoBrasileiro);

            String dataEmissaoAmericana = dataEmissao.format(formatoAmericano);
            String dataVencimentoAmericana = dataVencimento.format(formatoAmericano);

            // Definir os valores no PreparedStatement
            pstm.setDouble(1, despesaFixa.getValorMensal());
            pstm.setString(2, despesaFixa.getCategoria());
            pstm.setString(3, dataEmissaoAmericana);
            pstm.setString(4, dataVencimentoAmericana);
            pstm.setString(5, despesaFixa.getDescricao());
            pstm.setString(6, despesaFixa.getRecorrencia());
            pstm.setInt(7, despesaFixa.getIdDespesaFixa());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                return 1;
            } else {
                return 2;
            }

        } catch (Exception e) {
            return 3;
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

    public void delete(int idDespesaFixa) {
        String sql = "DELETE FROM despesa_fixa WHERE id_despesa_fixa = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, idDespesaFixa);

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Despesa fixa excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma despesa fixa encontrada para o ID fornecido.");
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

    public ArrayList<DespesaFixa> listarDFPeloID(int id) {
        String sql = "SELECT * FROM despesa_fixa WHERE id = ?";
        ArrayList<DespesaFixa> despesasFixas = new ArrayList<>();

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

                DespesaFixa despesaFixa = new DespesaFixa();
                despesaFixa.setId(rs.getInt("id"));
                despesaFixa.setIdDespesaFixa(rs.getInt("id_despesa_fixa"));
                despesaFixa.setValorMensal(rs.getFloat("valor_mensal"));
                despesaFixa.setCategoria(rs.getString("categoria"));
                despesaFixa.setDataEmissao(dataEmissaoBrasileira);
                despesaFixa.setDataDeVencimento(dataVencimentoBrasileira);
                despesaFixa.setDescricao(rs.getString("descricao"));
                despesaFixa.setRecorrencia(rs.getString("recorrencia"));
                despesasFixas.add(despesaFixa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the resources properly
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return despesasFixas;
    }

    public double somaDespesaFixa(int userId) {
        String sql = "SELECT SUM(valor_mensal) AS total FROM despesa_fixa WHERE id = ?";
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
