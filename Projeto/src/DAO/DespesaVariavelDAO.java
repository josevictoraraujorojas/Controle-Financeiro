package DAO;

import Controle.controllerBD;
import Modelo.DespesaVariavel;
import Modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DespesaVariavelDAO {
    public void save(DespesaVariavel despesaVariavel, Usuario usuario) {

        String sql = "INSERT INTO despesa_variavel(id,valor,, data_inicial, data_final, descricao, valor_total, valor_arrecadado, recorrencia) " +
                "VALUES(?,?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = controllerBD.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, usuario.getId());
            pstm.setDouble(2, despesaVariavel.getValor());
            pstm.setInt(3, despesaVariavel.getQtdParcelas());
            pstm.setInt(4, despesaVariavel.getQtdParcelasPagas());
            pstm.setString(5, despesaVariavel.getCategoria());
            pstm.setByte(6, despesaVariavel.getStatus());
            pstm.setString(7, despesaVariavel.getDataEmissao());
            pstm.setString(8, despesaVariavel.getDataDeVencimento());
            pstm.setString(9, despesaVariavel.getDescricao());
            pstm.setByte(10, despesaVariavel.getRecorrencia());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Despesa Salva!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<DespesaVariavel> listAll() {
        String sql = "SELECT * FROM despesa_variavel";
        List<DespesaVariavel> despesasVariaveis = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = controllerBD.createConnectionToMySQL();
            while (rs.next()) {
                DespesaVariavel despesaVariavel = new DespesaVariavel();
                despesaVariavel.setId(rs.getInt("id"));
                despesaVariavel.setValor(rs.getDouble("valor"));
                despesaVariavel.setQtdParcelas(rs.getInt("qtd_parcelas"));
                despesaVariavel.setQtdParcelasPagas(rs.getInt("parcelas_pagas"));
                despesaVariavel.setCategoria(rs.getString("categoria"));
                despesaVariavel.setStatus(rs.getByte("status"));
                despesaVariavel.setDataEmissao(rs.getString("data_emissao"));
                despesaVariavel.setDataDeVencimento(rs.getString("data_vencimento"));
                despesaVariavel.setDescricao(rs.getString("descricao"));
                despesaVariavel.setRecorrencia(rs.getByte("recorrencia"));
                despesasVariaveis.add(despesaVariavel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return despesasVariaveis;
    }


    public void deleteById(int idDespesaVariavel) {
        String sql = "DELETE FROM despesa_variavel WHERE id_despesa_variavel = ?";

        Connection conn;
        PreparedStatement pstm = null;

        try  {
            conn = controllerBD.createConnectionToMySQL();
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
    public void update(DespesaVariavel despesaVariavel) {
        String sql = "UPDATE despesa_variavel SET valor = ?, qtd_parcelas = ?, parcelas_pagas = ?, categoria = ?, status = ?, data_emissao = ?, data_vencimento = ?, descricao = ?, recorrencia = ? WHERE id_despesa_variavel = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        try  {
            conn = controllerBD.createConnectionToMySQL();
            pstm.setDouble(1, despesaVariavel.getValor());
            pstm.setInt(2, despesaVariavel.getQtdParcelas());
            pstm.setInt(3, despesaVariavel.getQtdParcelasPagas());
            pstm.setString(4, despesaVariavel.getCategoria());
            pstm.setByte(5, despesaVariavel.getStatus());
            pstm.setString(6, despesaVariavel.getDataEmissao());
            pstm.setString(7, despesaVariavel.getDataDeVencimento());
            pstm.setString(8, despesaVariavel.getDescricao());
            pstm.setByte(9, despesaVariavel.getRecorrencia());
            pstm.setInt(10, despesaVariavel.getId());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {

            } else {
                System.out.println("Nenhuma despesa variável encontrada com o ID fornecido.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public DespesaVariavel findById(int id) {
        String sql = "SELECT * FROM despesa_variavel WHERE id_despesa_variavel = ?";
        DespesaVariavel despesaVariavel = null;

        Connection conn = null;
        PreparedStatement pstm = null;
        try  {
            conn = controllerBD.createConnectionToMySQL();
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                despesaVariavel = new DespesaVariavel();
                despesaVariavel.setId(rs.getInt("id"));
                despesaVariavel.setValor(rs.getDouble("valor"));
                despesaVariavel.setQtdParcelas(rs.getInt("qtd_parcelas"));
                despesaVariavel.setQtdParcelasPagas(rs.getInt("parcelas_pagas"));
                despesaVariavel.setCategoria(rs.getString("categoria"));
                despesaVariavel.setStatus(rs.getByte("status"));
                despesaVariavel.setDataEmissao(rs.getString("data_emissao"));
                despesaVariavel.setDataDeVencimento(rs.getString("data_vencimento"));
                despesaVariavel.setDescricao(rs.getString("descricao"));
                despesaVariavel.setRecorrencia(rs.getByte("recorrencia"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return despesaVariavel;
    }

}
