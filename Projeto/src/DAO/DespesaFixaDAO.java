package DAO;

import Controle.controllerBD;
import Modelo.DespesaFixa;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DespesaFixaDAO {
    public void save(DespesaFixa despesaFixa, Usuario usuario) {
        String sql = "INSERT INTO despesa_fixa (id, valor_mensal, categoria, status, data_emissao, data_vencimento, descricao, recorrencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, usuario.getId());
            pstm.setDouble(2, despesaFixa.getValorMensal());
            pstm.setString(3, despesaFixa.getCategoria());
            pstm.setByte(4, despesaFixa.getStatus());
            pstm.setString(5, despesaFixa.getDataEmissao());
            pstm.setString(6, despesaFixa.getDataDeVencimento());
            pstm.setString(7, despesaFixa.getDescricao());
            pstm.setByte(8, despesaFixa.getRecorrencia());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog( null,"Despesa fixa salva com sucesso!");

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

    public void update(DespesaFixa despesaFixa) {
        String sql = "UPDATE despesa_fixa SET valor_mensal = ?, categoria = ?, status = ?, data_emissao = ?, data_vencimento = ?, descricao = ?, recorrencia = ? WHERE id_despesa_fixa = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setDouble(1, despesaFixa.getValorMensal());
            pstm.setString(2, despesaFixa.getCategoria());
            pstm.setByte(3, despesaFixa.getStatus());
            pstm.setString(4, despesaFixa.getDataEmissao());
            pstm.setString(5, despesaFixa.getDataDeVencimento());
            pstm.setString(6, despesaFixa.getDescricao());
            pstm.setByte(7, despesaFixa.getRecorrencia());
            pstm.setInt(8, despesaFixa.getId());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog( null,"Despesa atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog( null,"Nunhuma espesa fixa encontrada");
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

    public List<DespesaFixa> listAll() {
        String sql = "SELECT * FROM despesa_fixa";
        List<DespesaFixa> despesasFixas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                DespesaFixa despesaFixa = new DespesaFixa();
                despesaFixa.setId(rs.getInt("id"));
                despesaFixa.setValorMensal(rs.getDouble("valor_mensal"));
                despesaFixa.setCategoria(rs.getString("categoria"));
                despesaFixa.setStatus(rs.getByte("status"));
                despesaFixa.setDataEmissao(rs.getString("data_emissao"));
                despesaFixa.setDataDeVencimento(rs.getString("data_vencimento"));
                despesaFixa.setDescricao(rs.getString("descricao"));
                despesaFixa.setRecorrencia(rs.getByte("recorrencia"));
                despesasFixas.add(despesaFixa);
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
        return despesasFixas;
    }

    public void deleteById(int idDespesaFixa) {
        String sql = "DELETE FROM despesa_fixa WHERE id_despesa_fixa = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, idDespesaFixa);
            int rowsAffected = pstm.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Despesa fixa deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,"Nenhuma despesa fixa encontrada com o ID fornecido.");
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

    public DespesaFixa findById(int idDespesaFixa) {
        String sql = "SELECT * FROM despesa_fixa WHERE id_despesa_fixa = ?";
        DespesaFixa despesaFixa = null;

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idDespesaFixa);
            rs = pstm.executeQuery();

            if (rs.next()) {
                despesaFixa = new DespesaFixa();
                despesaFixa.setId(rs.getInt("id"));
                despesaFixa.setValorMensal(rs.getDouble("valor_mensal"));
                despesaFixa.setCategoria(rs.getString("categoria"));
                despesaFixa.setStatus(rs.getByte("status"));
                despesaFixa.setDataEmissao(rs.getString("data_emissao"));
                despesaFixa.setDataDeVencimento(rs.getString("data_vencimento"));
                despesaFixa.setDescricao(rs.getString("descricao"));
                despesaFixa.setRecorrencia(rs.getByte("recorrencia"));
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
        return despesaFixa;
    }
}
