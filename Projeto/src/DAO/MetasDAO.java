package DAO;

import Controle.controllerBD;
import Modelo.Metas;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MetasDAO {
    private Metas metas = new Metas();
    private Usuario usuario = new Usuario();

    public void passando(Usuario usuario){
        this.usuario = usuario;
        System.out.println(usuario.getId());
    }
    public boolean save(Metas metas) {
        System.out.println(usuario.getId());

        String sql = "INSERT INTO metas(id,categoria, data_inicial, data_final, descricao, valor_total, valor_arrecadado, recorrencia) " +
                "VALUES(?,?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        // Definir os formatadores de data
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);


            LocalDate dataInicial = LocalDate.parse(metas.getDataInicial(), formatoBrasileiro);
            LocalDate dataFinal = LocalDate.parse(metas.getDataFinal(), formatoBrasileiro);

            String dataInicialAmericana = dataInicial.format(formatoAmericano);
            String dataFinalAmericana = dataFinal.format(formatoAmericano);

            pstm.setInt(1, this.usuario.getId());
            pstm.setString(2, metas.getCategoria());
            pstm.setString(3,dataInicialAmericana);
            pstm.setString(4, dataFinalAmericana);
            pstm.setString(5, metas.getDescricao());
            pstm.setFloat(6, metas.getValorTotal());
            pstm.setFloat(7, metas.getValorArrecadado());
            pstm.setString(8, metas.getRecorrencia());

            pstm.execute();

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
    public int update(Metas metas) {
        String sql = "UPDATE metas SET categoria = ?, data_inicial = ?, data_final = ?, descricao = ?, valor_total = ?, valor_arrecadado = ?, recorrencia = ? WHERE id_metas = ?";

        System.out.println(metas.getIdMetas());

        Connection conn = null;
        PreparedStatement pstm = null;

        // Definir os formatadores de data
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            LocalDate dataInicial = LocalDate.parse(metas.getDataInicial(), formatoBrasileiro);
            LocalDate dataFinal = LocalDate.parse(metas.getDataFinal(), formatoBrasileiro);

            String dataInicialAmericana = dataInicial.format(formatoAmericano);
            String dataFinalAmericana = dataFinal.format(formatoAmericano);

            pstm.setString(1, metas.getCategoria());
            pstm.setString(2, dataInicialAmericana);
            pstm.setString(3, dataFinalAmericana);
            pstm.setString(4, metas.getDescricao());
            pstm.setFloat(5, metas.getValorTotal());
            pstm.setFloat(6, metas.getValorArrecadado());
            pstm.setString(7, metas.getRecorrencia());
            pstm.setInt(8, metas.getIdMetas());

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

    public void deleteById(int id) {
        String sql = "DELETE FROM metas WHERE id_metas = ?";

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

    public ArrayList<Metas> listarMPeloID(int id) {
        String sql = "SELECT * FROM metas WHERE id = ?";
        ArrayList<Metas> metas = new ArrayList<>();

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
                LocalDate dataInicial = LocalDate.parse(rs.getString("data_inicial"), formatoAmericano);
                LocalDate dataFinal = LocalDate.parse(rs.getString("data_final"), formatoAmericano);

                String dataInicialBrasileira = dataInicial.format(formatoBrasileiro);
                String dataFinalBrasileira = dataFinal.format(formatoBrasileiro);

                Metas meta = new Metas();
                meta.setIdUsuario(rs.getInt("id"));
                meta.setIdMetas(rs.getInt("id_metas"));
                meta.setCategoria(rs.getString("categoria"));
                meta.setDataInicial(dataInicialBrasileira);
                meta.setDataFinal(dataFinalBrasileira);
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
