package Controle;

import DAO.DespesaVariavelDAO;
import Modelo.DespesaVariavel;
import Modelo.Metas;
import Modelo.Usuario;
import Visao.GuiAdicionarDespesasVariaveis;


import javax.swing.*;



public class ControleAdicionarDespesasVariaveis {
    private ControlePrincipal controlePrincipal;
    private GuiAdicionarDespesasVariaveis tela;
    private DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
    private Usuario usuario;


    public ControleAdicionarDespesasVariaveis(GuiAdicionarDespesasVariaveis tela,Usuario usuario, ControlePrincipal controlePrincipal) {
        this.usuario = usuario;
        this.tela = tela;
        this.controlePrincipal = controlePrincipal;
        iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(850,850);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iniciaControler();

    }

    public void iniciaControler(){
        tela.getAdicionar().addActionListener(e -> adicionarMetas());
    }
    public void adicionarMetas(){
        DespesaVariavel despesaVariavel = new DespesaVariavel();

        despesaVariavel.setCategoria(tela.getCategoria().getText());
        despesaVariavel.setDataEmissao(tela.getDataEmicao().getText());
        despesaVariavel.setDataDeVencimento(tela.getDataVencimento().getText());
        despesaVariavel.setDescricao(tela.getDescricao().getText());
        despesaVariavel.setValor(Double.parseDouble(tela.getValor().getText()));
        despesaVariavel.setQtdParcelas((int) Double.parseDouble(tela.getQuantidadeParcelas().getText()));
        despesaVariavel.setQtdParcelasPagas(Integer.parseInt(tela.getQuantidadeParcelasPagas().getText()));
        despesaVariavel.setRecorrencia(tela.getRecorrencia().getText());

        despesaVariavelDAO.save(despesaVariavel,usuario);
        controlePrincipal.iniciaGraficoBarra();
        tela.dispose();
    }

}

