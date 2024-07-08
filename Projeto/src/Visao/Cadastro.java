package Visao;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelComImagemDeFundo fundo;
	GridBagConstraints fundoC;
	private JPanelComImagemDeFundo imagem;
	GridBagConstraints imagemC;
	JPanelComImagemDeFundo menuCadastro;
	GridBagConstraints menuCadastroC;

	JLabel textoCadastro;
	GridBagConstraints textoCadastroC;
	JLabel textoNome;
	GridBagConstraints textoNomeC;
	private JTextFieldArredondado nome;
	GridBagConstraints nomeC;
	JLabel textoSenha;
	GridBagConstraints textoSenhaC;
	private JPasswordArredondado senha;
	GridBagConstraints senhaC;
	JLabel textoRendaDisponivel;
	GridBagConstraints textoRendaDisponivelC;
	private JTextFieldArredondado rendaDisponivel;
	GridBagConstraints rendaDisponivelC;
	JLabel textoSaldo;
	GridBagConstraints textoSaldoC;
	private JTextFieldArredondado saldo;
	GridBagConstraints saldoC;
	BotaoArredondado cadastrar;
	GridBagConstraints cadastrarC;
	BotaoArredondado cancelar;
	GridBagConstraints cancelarC;


	public Cadastro() {
		setLayout(new GridBagLayout());
		Font fonte = new Font("Serif",Font.PLAIN,20);

		fundoC = new GridBagConstraints();
		fundoC.weighty = 1;
		fundoC.weightx = 1;
		fundoC.fill = GridBagConstraints.BOTH;

		imagemC = new GridBagConstraints();
		imagemC.ipady = 758;
		imagemC.ipadx = 400;


		menuCadastroC = new GridBagConstraints();
		menuCadastroC.ipady = 250;
		menuCadastroC.ipadx = 250;

		textoCadastroC = new GridBagConstraints();
		textoCadastroC.gridwidth=GridBagConstraints.REMAINDER;

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

		cadastrarC = new GridBagConstraints();
		cadastrarC.insets = new Insets(50,50,0,0);

		cancelarC = new GridBagConstraints();
		cancelarC.insets = new Insets(50,50,0,0);

		fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo.jpg"));
		fundo.setLayout(new GridBagLayout());
		add(fundo, fundoC);

		imagem = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\imagem_tela_cadastro.png"));
		fundo.add(imagem,imagemC);

		Border borda =BorderFactory.createLineBorder(Color.black);
		menuCadastro = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
		menuCadastro.setLayout(new GridBagLayout());
		menuCadastro.setBorder(borda);
		fundo.add(menuCadastro, menuCadastroC);

		textoCadastro = new JLabel("Cadastro pessoal");
		textoCadastro.setFont(fonte);
		menuCadastro.add(textoCadastro,textoCadastroC);

		textoNome = new JLabel("nome:");
		textoNome.setFont(fonte);
		menuCadastro.add(textoNome,textoNomeC);

		nome = new JTextFieldArredondado();
		nome.setColumns(10);
		nome.setText("");
		nome.setFont(fonte);
		menuCadastro.add(nome,nomeC);

		textoSenha = new JLabel("senha:");
		textoSenha.setFont(fonte);
		menuCadastro.add(textoSenha,textoSenhaC);

		senha = new JPasswordArredondado();
		senha.setColumns(10);
		senha.setText("");
		senha.setFont(fonte);
		menuCadastro.add(senha,senhaC);

		textoRendaDisponivel = new JLabel("renda:");
		textoRendaDisponivel.setFont(fonte);
		menuCadastro.add(textoRendaDisponivel,textoRendaDisponivelC);

		rendaDisponivel = new JTextFieldArredondado();
		rendaDisponivel.setColumns(10);
		rendaDisponivel.setText("");
		rendaDisponivel.setFont(fonte);
		menuCadastro.add(rendaDisponivel,rendaDisponivelC);

		textoSaldo = new JLabel("saldo:");
		textoSaldo.setFont(fonte);
		menuCadastro.add(textoSaldo,textoSaldoC);

		saldo = new JTextFieldArredondado();
		saldo.setColumns(10);
		saldo.setText("");
		saldo.setFont(fonte);
		menuCadastro.add(saldo,saldoC);

		cadastrar = new BotaoArredondado();
		cadastrar.setText("avancar");
		cadastrar.setBackground(Color.green);
		menuCadastro.add(cadastrar,cadastrarC);

		cancelar = new BotaoArredondado();
		cancelar.setText("cancelar");
		cancelar.setBackground(Color.red);
		menuCadastro.add(cancelar,cancelarC);



	}
}
