package Visao;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class GuiCadastro extends JFrame {

	private JPanelComImagemDeFundo fundo;
	private GridBagConstraints fundoC;
	private JPanelComImagemDeFundo imagem;
	private GridBagConstraints imagemC;
	private JPanelComImagemDeFundo menuCadastro;
	private GridBagConstraints menuCadastroC;
	private JLabel textoCadastro;
	private GridBagConstraints textoCadastroC;
	private JLabel textoLogin;
	private GridBagConstraints textoLoginC;
	private JTextFieldArredondado login;
	private GridBagConstraints loginC;
	private JLabel textoSenha;
	private GridBagConstraints textoSenhaC;
	private JPasswordArredondado senha;
	private GridBagConstraints senhaC;
	private JLabel textoSaldo;
	private GridBagConstraints textoSaldoC;
	private JTextFieldArredondado saldo;
	private GridBagConstraints saldoC;
	private BotaoArredondado cadastrar;
	private GridBagConstraints cadastrarC;
	private BotaoArredondado cancelar;
	private GridBagConstraints cancelarC;


	public GuiCadastro() {
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
		menuCadastroC.ipady = 350;
		menuCadastroC.ipadx = 250;

		textoCadastroC = new GridBagConstraints();
		textoCadastroC.gridwidth=GridBagConstraints.REMAINDER;

		textoLoginC = new GridBagConstraints();
		textoLoginC.insets = new Insets(50, 0, 0, 0);

		loginC = new GridBagConstraints();
		loginC.insets = new Insets(50, 0, 0, 0);
		loginC.ipadx=100;
		loginC.ipady=20;
		loginC.gridwidth=GridBagConstraints.REMAINDER;

		textoSenhaC = new GridBagConstraints();
		textoSenhaC.insets = new Insets(50,0,0,0);

		senhaC = new GridBagConstraints();
		senhaC.insets = new Insets(50,0,0,0);
		senhaC.ipadx=100;
		senhaC.ipady=20;
		senhaC.gridwidth=GridBagConstraints.REMAINDER;

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

		textoLogin = new JLabel("login:");
		textoLogin.setFont(fonte);
		menuCadastro.add(textoLogin,textoLoginC);

		login = new JTextFieldArredondado();
		login.setColumns(10);
		login.setText("");
		login.setFont(fonte);
		menuCadastro.add(login,loginC);

		textoSenha = new JLabel("senha:");
		textoSenha.setFont(fonte);
		menuCadastro.add(textoSenha,textoSenhaC);

		senha = new JPasswordArredondado();
		senha.setColumns(10);
		senha.setText("");
		senha.setFont(fonte);
		menuCadastro.add(senha,senhaC);

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
