package Visao;

import Controle.ControleCadastro;

import java.awt.*;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.Border;

public class JpanelCadastro extends JPanel {


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


	public JpanelCadastro() {
		setLayout(new GridBagLayout());
		Font fonte = new Font("Serif",Font.PLAIN,20);

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



		imagem = new JPanelComImagemDeFundo(Objects.requireNonNull(getClass().getResource("Imagem\\imagem_tela_cadastro.png")));
		add(imagem,imagemC);

		Border borda =BorderFactory.createLineBorder(Color.black);
		menuCadastro = new JPanelComImagemDeFundo(Objects.requireNonNull(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg")));
		menuCadastro.setLayout(new GridBagLayout());
		menuCadastro.setBorder(borda);
		add(menuCadastro, menuCadastroC);

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
		cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ControleCadastro cadastro = new ControleCadastro();
				cadastro.actionCadastrar();
			}
		});

		cancelar = new BotaoArredondado();
		cancelar.setText("cancelar");
		cancelar.setBackground(Color.red);
		menuCadastro.add(cancelar,cancelarC);



	}

	public JPanelComImagemDeFundo getImagem() {
		return imagem;
	}

	public void setImagem(JPanelComImagemDeFundo imagem) {
		this.imagem = imagem;
	}

	public GridBagConstraints getImagemC() {
		return imagemC;
	}

	public void setImagemC(GridBagConstraints imagemC) {
		this.imagemC = imagemC;
	}

	public JPanelComImagemDeFundo getMenuCadastro() {
		return menuCadastro;
	}

	public void setMenuCadastro(JPanelComImagemDeFundo menuCadastro) {
		this.menuCadastro = menuCadastro;
	}

	public GridBagConstraints getMenuCadastroC() {
		return menuCadastroC;
	}

	public void setMenuCadastroC(GridBagConstraints menuCadastroC) {
		this.menuCadastroC = menuCadastroC;
	}

	public JLabel getTextoCadastro() {
		return textoCadastro;
	}

	public void setTextoCadastro(JLabel textoCadastro) {
		this.textoCadastro = textoCadastro;
	}

	public GridBagConstraints getTextoCadastroC() {
		return textoCadastroC;
	}

	public void setTextoCadastroC(GridBagConstraints textoCadastroC) {
		this.textoCadastroC = textoCadastroC;
	}

	public JLabel getTextoLogin() {
		return textoLogin;
	}

	public void setTextoLogin(JLabel textoLogin) {
		this.textoLogin = textoLogin;
	}

	public GridBagConstraints getTextoLoginC() {
		return textoLoginC;
	}

	public void setTextoLoginC(GridBagConstraints textoLoginC) {
		this.textoLoginC = textoLoginC;
	}

	public JTextFieldArredondado getLogin() {
		return login;
	}

	public void setLogin(JTextFieldArredondado login) {
		this.login = login;
	}

	public GridBagConstraints getLoginC() {
		return loginC;
	}

	public void setLoginC(GridBagConstraints loginC) {
		this.loginC = loginC;
	}

	public JLabel getTextoSenha() {
		return textoSenha;
	}

	public void setTextoSenha(JLabel textoSenha) {
		this.textoSenha = textoSenha;
	}

	public GridBagConstraints getTextoSenhaC() {
		return textoSenhaC;
	}

	public void setTextoSenhaC(GridBagConstraints textoSenhaC) {
		this.textoSenhaC = textoSenhaC;
	}

	public JPasswordArredondado getSenha() {
		return senha;
	}

	public void setSenha(JPasswordArredondado senha) {
		this.senha = senha;
	}

	public GridBagConstraints getSenhaC() {
		return senhaC;
	}

	public void setSenhaC(GridBagConstraints senhaC) {
		this.senhaC = senhaC;
	}

	public JLabel getTextoSaldo() {
		return textoSaldo;
	}

	public void setTextoSaldo(JLabel textoSaldo) {
		this.textoSaldo = textoSaldo;
	}

	public GridBagConstraints getTextoSaldoC() {
		return textoSaldoC;
	}

	public void setTextoSaldoC(GridBagConstraints textoSaldoC) {
		this.textoSaldoC = textoSaldoC;
	}

	public JTextFieldArredondado getSaldo() {
		return saldo;
	}

	public void setSaldo(JTextFieldArredondado saldo) {
		this.saldo = saldo;
	}

	public GridBagConstraints getSaldoC() {
		return saldoC;
	}

	public void setSaldoC(GridBagConstraints saldoC) {
		this.saldoC = saldoC;
	}

	public BotaoArredondado getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(BotaoArredondado cadastrar) {
		this.cadastrar = cadastrar;
	}

	public GridBagConstraints getCadastrarC() {
		return cadastrarC;
	}

	public void setCadastrarC(GridBagConstraints cadastrarC) {
		this.cadastrarC = cadastrarC;
	}

	public BotaoArredondado getCancelar() {
		return cancelar;
	}

	public void setCancelar(BotaoArredondado cancelar) {
		this.cancelar = cancelar;
	}

	public GridBagConstraints getCancelarC() {
		return cancelarC;
	}

	public void setCancelarC(GridBagConstraints cancelarC) {
		this.cancelarC = cancelarC;
	}

}
