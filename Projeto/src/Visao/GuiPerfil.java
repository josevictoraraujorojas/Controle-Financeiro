package Visao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiPerfil extends JFrame {

    JPanelComImagemDeFundo fundo;
    GridBagConstraints fundoC;
    JPanel menu;
    GridBagConstraints menuC;
    BotaoArredondado principal;
    GridBagConstraints principalC;
    BotaoArredondado botaoPerfil;
    GridBagConstraints botaoPerfilC;
    BotaoArredondado sair;
    GridBagConstraints sairC;
    JPanel perfil;
    GridBagConstraints perfilC;
    JLabel textoPerfil;
    GridBagConstraints textoPerfilC;
    JPanel detalheOrcamento;
    GridBagConstraints detalheOrcamentoC;
    JLabel textoLimiteDespesasFixas;
    GridBagConstraints textoLimiteDespesasFixasC;
    JTextFieldArredondado limiteDespesasFixas;
    GridBagConstraints limiteDespesasFixasC;
    JLabel textoLimiteDespesasVariaveis;
    GridBagConstraints textoLimiteDespesasVariaveisC;
    JTextFieldArredondado LimiteDespesasVariaveis;
    GridBagConstraints LimiteDespesasVariaveisC;
    JLabel textoLimiteMetas;
    GridBagConstraints textoLimiteMetasC;
    JTextFieldArredondado limiteMetas;
    GridBagConstraints limiteMetasC;
    JPanel detalhePessoal;
    GridBagConstraints detalhePessoalC;
    JLabel textoNome;
    GridBagConstraints textoNomeC;
    JTextFieldArredondado nome;
    GridBagConstraints nomeC;
    JLabel textoSenha;
    GridBagConstraints textoSenhaC;
    JPasswordArredondado senha;
    GridBagConstraints senhaC;
    JLabel textoRendaDisponivel;
    GridBagConstraints textoRendaDisponivelC;
    JTextFieldArredondado rendaDisponivel;
    GridBagConstraints rendaDisponivelC;
    JLabel textoSaldo;
    GridBagConstraints textoSaldoC;
    JTextFieldArredondado saldo;
    GridBagConstraints saldoC;
    BotaoArredondado salvar;
    GridBagConstraints salvarC;


        public GuiPerfil() {
            super("grafico");
            setLayout(new GridBagLayout());
            Font fonte = new Font("Serif", Font.PLAIN, 20);
            Border borda = BorderFactory.createLineBorder(Color.black, 2);


            fundoC = new GridBagConstraints();
            fundoC.weighty = 1;
            fundoC.weightx = 1;
            fundoC.fill = GridBagConstraints.BOTH;

            menuC = new GridBagConstraints();
            menuC.ipadx = 50;
            menuC.ipady = 637;
            menuC.gridheight = GridBagConstraints.REMAINDER;


            principalC = new GridBagConstraints();
            principalC.gridwidth = GridBagConstraints.REMAINDER;

            botaoPerfilC = new GridBagConstraints();
            botaoPerfilC.gridwidth = GridBagConstraints.REMAINDER;
            botaoPerfilC.weighty = 1;
            botaoPerfilC.anchor = GridBagConstraints.NORTH;

            sairC = new GridBagConstraints();
            sairC.gridwidth = GridBagConstraints.REMAINDER;

            perfilC = new GridBagConstraints();
            perfilC.ipady = 265;
            perfilC.ipadx = 753;
            perfilC.gridheight = GridBagConstraints.REMAINDER;

            textoPerfilC = new GridBagConstraints();
            textoPerfilC.gridwidth = GridBagConstraints.REMAINDER;

            detalhePessoalC = new GridBagConstraints();

            textoNomeC = new GridBagConstraints();
            textoNomeC.insets = new Insets(50, 0, 0, 0);

            nomeC = new GridBagConstraints();
            nomeC.insets = new Insets(50, 0, 0, 0);
            nomeC.ipadx=100;
            nomeC.ipady=20;
            nomeC.gridwidth=GridBagConstraints.REMAINDER;

            textoSenhaC = new GridBagConstraints();
            textoSenhaC.insets = new Insets(50,0,0,0);

            senhaC = new GridBagConstraints();
            senhaC.insets = new Insets(50,0,0,0);
            senhaC.ipadx=100;
            senhaC.ipady=20;
            senhaC.gridwidth=GridBagConstraints.REMAINDER;

            textoRendaDisponivelC = new GridBagConstraints();
            textoRendaDisponivelC.insets = new Insets(50,0,0,0);

            rendaDisponivelC = new GridBagConstraints();
            rendaDisponivelC.insets = new Insets(50,0,0,0);
            rendaDisponivelC.ipadx=100;
            rendaDisponivelC.ipady=20;
            rendaDisponivelC.gridwidth=GridBagConstraints.REMAINDER;

            textoSaldoC = new GridBagConstraints();
            textoSaldoC.insets = new Insets(50,0,0,0);

            saldoC = new GridBagConstraints();
            saldoC.insets = new Insets(50,0,0,0);
            saldoC.ipadx=100;
            saldoC.ipady=20;
            saldoC.gridwidth=GridBagConstraints.REMAINDER;

            detalheOrcamentoC = new GridBagConstraints();
            detalheOrcamentoC.ipady=100;
            detalheOrcamentoC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasFixasC = new GridBagConstraints();
            textoLimiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);

            limiteDespesasFixasC = new GridBagConstraints();
            limiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);
            limiteDespesasFixasC.ipadx = 100;
            limiteDespesasFixasC.ipady = 20;
            limiteDespesasFixasC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasVariaveisC = new GridBagConstraints();
            textoLimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);

            LimiteDespesasVariaveisC = new GridBagConstraints();
            LimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);
            LimiteDespesasVariaveisC.ipadx = 100;
            LimiteDespesasVariaveisC.ipady = 20;
            LimiteDespesasVariaveisC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteMetasC = new GridBagConstraints();
            textoLimiteMetasC.insets = new Insets(50, 0, 0, 0);

            limiteMetasC = new GridBagConstraints();
            limiteMetasC.insets = new Insets(50, 0, 0, 0);
            limiteMetasC.ipadx = 100;
            limiteMetasC.ipady = 20;
            limiteMetasC.gridwidth = GridBagConstraints.REMAINDER;


            salvarC = new GridBagConstraints();
            salvarC.gridx=1;
            salvarC.anchor = GridBagConstraints.LAST_LINE_END;



            fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\contas-a-pagar-e-receber.jpeg"));
            fundo.setLayout(new GridBagLayout());
            add(fundo, fundoC);

            menu = new JPanel();
            menu.setBackground(Color.white);
            menu.setLayout(new GridBagLayout());
            menu.setBorder(borda);
            fundo.add(menu, menuC);

            principal = new BotaoArredondado();
            principal.setText("principal");
            principal.setBackground(Color.cyan);
            menu.add(principal, principalC);

            botaoPerfil = new BotaoArredondado();
            botaoPerfil.setText("perfil");
            botaoPerfil.setBackground(Color.cyan);
            menu.add(botaoPerfil, botaoPerfilC);

            sair = new BotaoArredondado();
            sair.setText("sair");
            sair.setBackground(Color.red);
            menu.add(sair, sairC);

            perfil = new JPanel();
            perfil.setBackground(Color.white);
            perfil.setLayout(new GridBagLayout());
            perfil.setBorder(borda);
            fundo.add(perfil, perfilC);

            textoPerfil = new JLabel();
            textoPerfil.setText("Informacoes do Usuario");
            textoPerfil.setFont(new Font("Serif", Font.PLAIN, 40));
            perfil.add(textoPerfil, textoPerfilC);


            detalhePessoal = new JPanel();
            detalhePessoal.setBackground(Color.white);
            detalhePessoal.setLayout(new GridBagLayout());
            perfil.add(detalhePessoal, detalhePessoalC);

            textoNome = new JLabel("nome:");
            textoNome.setFont(fonte);
            detalhePessoal.add(textoNome,textoNomeC);

            nome = new JTextFieldArredondado();
            nome.setBackground(Color.cyan);
            nome.setColumns(10);
            nome.setText("");
            nome.setFont(fonte);
            detalhePessoal.add(nome,nomeC);

            textoSenha = new JLabel("senha:");
            textoSenha.setFont(fonte);
            detalhePessoal.add(textoSenha,textoSenhaC);


            senha = new JPasswordArredondado();
            senha.setBackground(Color.cyan);
            senha.setColumns(10);
            senha.setText("");
            senha.setFont(fonte);
            detalhePessoal.add(senha,senhaC);

            textoRendaDisponivel = new JLabel("renda:");
            textoRendaDisponivel.setFont(fonte);
            detalhePessoal.add(textoRendaDisponivel,textoRendaDisponivelC);

            rendaDisponivel = new JTextFieldArredondado();
            rendaDisponivel.setBackground(Color.cyan);
            rendaDisponivel.setColumns(10);
            rendaDisponivel.setText("");
            rendaDisponivel.setFont(fonte);
            detalhePessoal.add(rendaDisponivel,rendaDisponivelC);

            textoSaldo = new JLabel("saldo:");
            textoSaldo.setFont(fonte);
            detalhePessoal.add(textoSaldo,textoSaldoC);

            saldo = new JTextFieldArredondado();
            saldo.setBackground(Color.cyan);
            saldo.setColumns(10);
            saldo.setText("");
            saldo.setFont(fonte);
            detalhePessoal.add(saldo,saldoC);

            detalheOrcamento = new JPanel();
            detalheOrcamento.setBackground(Color.white);
            detalheOrcamento.setLayout(new GridBagLayout());
            perfil.add(detalheOrcamento, detalheOrcamentoC);

            textoLimiteDespesasFixas = new JLabel("despesas fixas:");
            textoLimiteDespesasFixas.setFont(fonte);
            detalheOrcamento.add(textoLimiteDespesasFixas, textoLimiteDespesasFixasC);

            limiteDespesasFixas = new JTextFieldArredondado();
            limiteDespesasFixas.setBackground(Color.cyan);
            limiteDespesasFixas.setColumns(10);
            limiteDespesasFixas.setText("50%");
            limiteDespesasFixas.setFont(fonte);
            detalheOrcamento.add(limiteDespesasFixas, limiteDespesasFixasC);

            textoLimiteDespesasVariaveis = new JLabel("despesas variaveis:");
            textoLimiteDespesasVariaveis.setFont(fonte);
            detalheOrcamento.add(textoLimiteDespesasVariaveis, textoLimiteDespesasVariaveisC);

            LimiteDespesasVariaveis = new JTextFieldArredondado();
            LimiteDespesasVariaveis.setBackground(Color.cyan);
            LimiteDespesasVariaveis.setColumns(10);
            LimiteDespesasVariaveis.setText("30%");
            LimiteDespesasVariaveis.setFont(fonte);
            detalheOrcamento.add(LimiteDespesasVariaveis, LimiteDespesasVariaveisC);

            textoLimiteMetas = new JLabel("metas:");
            textoLimiteMetas.setFont(fonte);
            detalheOrcamento.add(textoLimiteMetas, textoLimiteMetasC);

            limiteMetas = new JTextFieldArredondado();
            limiteMetas.setBackground(Color.cyan);
            limiteMetas.setColumns(10);
            limiteMetas.setText("20%");
            limiteMetas.setFont(fonte);
            detalheOrcamento.add(limiteMetas, limiteMetasC);

            salvar = new BotaoArredondado();
            salvar.setText("salvar");
            salvar.setFont(fonte);
            salvar.setBackground(Color.GREEN);
            perfil.add(salvar,salvarC);

        }
}




