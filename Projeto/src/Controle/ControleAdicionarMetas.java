package Controle;

import DAO.MetasDAO;
import Modelo.Metas;
import Modelo.Usuario;
import Visao.GuiAdicionarMetas;

import javax.swing.*;

public class ControleAdicionarMetas {
    private ControlePrincipal controlePrincipal;
    private GuiAdicionarMetas tela;
    private MetasDAO metasDAO = new MetasDAO();
    private Usuario usuario;


    public ControleAdicionarMetas(GuiAdicionarMetas tela,Usuario usuario, ControlePrincipal controlePrincipal) {
        this.usuario = usuario;
        this.tela = tela;
        this.controlePrincipal = controlePrincipal;
        iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(750,750);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iniciaControler();

    }

    public void iniciaControler(){
        tela.getAdicionar().addActionListener(e -> adicionarMetas());
    }
    public void adicionarMetas(){
        Metas metas = new Metas();

        metas.setCategoria(tela.getCategoria().getText());
        metas.setDescricao(tela.getDescricao().getText());
        metas.setDataFinal(tela.getDataFinal().getText());
        metas.setDataInicial(tela.getDataInicial().getText());
        metas.setValorTotal(Float.parseFloat(tela.getValorTotal().getText()));
        metas.setValorArrecadado(Float.parseFloat(tela.getValorArrecadado().getText()));
        metas.setRecorrencia(tela.getRecorrencia().getText());

        metasDAO.passando(usuario);

        if (metasDAO.save(metas)){
            controlePrincipal.iniciaGraficoBarra();
            controlePrincipal.listarMetas();
            tela.dispose();
            JOptionPane.showMessageDialog(null, "Meta adicionada com sucesso!");
        }else {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar a meta!");
        }
    }

}
