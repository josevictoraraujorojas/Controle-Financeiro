package DAO;

import Controle.controllerBD;
import Modelo.Metas;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetasDAO {
    Metas metas = new Metas();
    Usuario usuario = new Usuario();

    public void passando(Usuario usuario){
        this.usuario = usuario;
        System.out.println(usuario.getId());
    }
    public void save(Metas metas) {
        System.out.println(usuario.getId());

        String sql = "INSERT INTO metas(id,categoria, status, data_inicial, data_final, descricao, valor_total, valor_arrecadado, recorrencia) " +
                "VALUES(?,?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, this.usuario.getId());
            pstm.setString(2, metas.getCategoria());
            pstm.setBoolean(3, true);
            pstm.setString(4, metas.getDataInicial());
            pstm.setString(5, metas.getDataFinal());
            pstm.setString(6, metas.getDescricao());
            pstm.setFloat(7, metas.getValorTotal());
            pstm.setFloat(8, metas.getValorArrecadado());
            pstm.setString(9, metas.getRecorrencia());

            pstm.execute();

            JOptionPane.showMessageDialog(null,"Meta Cadastrada, Vamos Lá !!!!");
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
    public List<Metas> listarMPeloID(int id) {
        String sql = "SELECT * FROM meta WHERE id = ?";
        List<Metas> metas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Metas meta = new Metas();
                meta.setId(rs.getInt("id"));
                meta.setCategoria(rs.getString("categoria"));
                meta.setStatus(rs.getBoolean("status"));
                meta.setDataInicial(rs.getString("data_inicial"));
                meta.setDataFinal(rs.getString("data_final"));
                meta.setDescricao(rs.getString("descricao"));
                meta.setValorTotal(rs.getFloat("valor_total"));
                meta.setValorArrecadado(rs.getFloat("valor_arrecadado"));
                meta.setRecorrencia(rs.getString("recorrencia"));
                metas.add(meta);
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
        return metas;
    }

    public void update(Metas metas) {
        String sql = "UPDATE metas SET categoria = ?, status = ?, data_inicial = ?, data_final = ?, descricao = ?, valor_total = ?, valor_arrecadado = ?, recorrencia = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, metas.getCategoria());
            pstm.setBoolean(2, metas.isStatus());
            pstm.setString(3, metas.getDataInicial());
            pstm.setString(4, metas.getDataFinal());
            pstm.setString(5, metas.getDescricao());
            pstm.setFloat(6, metas.getValorTotal());
            pstm.setFloat(7, metas.getValorArrecadado());
            pstm.setString(8, metas.getRecorrencia());
            pstm.setInt(9, metas.getId());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Meta atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma meta encontrada com o ID fornecido.");
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

    public void deleteById(int id) {
        String sql = "DELETE FROM metas WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Meta deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma meta encontrada com o ID fornecido.");
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

    public Metas findById(int id) {
        String sql = "SELECT * FROM metas WHERE id = ?";
        Metas meta = null;

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (rs.next()) {
                meta = new Metas();
                meta.setId(rs.getInt("id"));
                meta.setCategoria(rs.getString("categoria"));
                meta.setStatus(rs.getBoolean("status"));
                meta.setDataInicial(rs.getString("data_inicial"));
                meta.setDataFinal(rs.getString("data_final"));
                meta.setDescricao(rs.getString("descricao"));
                meta.setValorTotal(rs.getFloat("valor_total"));
                meta.setValorArrecadado(rs.getFloat("valor_arrecadado"));
                meta.setRecorrencia(rs.getString("recorrencia"));
                JOptionPane.showMessageDialog(null, "Meta encontrada: " + meta.getDescricao());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma meta encontrada com o ID fornecido.");
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
        return meta;
    }

    public double somaMetas(int userId) {
        String sql = "SELECT SUM(valor_total) AS total FROM metas WHERE id = ?";
        double total = 0.0;

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, userId);
            rs = pstm.executeQuery();

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
