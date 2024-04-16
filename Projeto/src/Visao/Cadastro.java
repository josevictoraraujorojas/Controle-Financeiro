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
	private JPanelComImagemDeFundo menuCadastro;
	GridBagConstraints menuCadastroC;
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


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joaov\\Downloads\\imagem_de_fundo.jpeg"));
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2020, 2020);
		Font fonte = new Font("Serif",Font.PLAIN,20);

		fundoC = new GridBagConstraints();
		fundoC.weighty = 1;
		fundoC.weightx = 1;
		fundoC.fill = GridBagConstraints.BOTH;

		imagemC = new GridBagConstraints();
		imagemC.ipady = 682;
		imagemC.ipadx = 400;


		menuCadastroC = new GridBagConstraints();
		menuCadastroC.ipady = 250;
		menuCadastroC.ipadx = 250;

		textoNomeC = new GridBagConstraints();

		nomeC = new GridBagConstraints();
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

		fundo = new JPanelComImagemDeFundo("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\contas-a-pagar-e-receber.jpeg");
		fundo.setLayout(new GridBagLayout());
		add(fundo, fundoC);

		imagem = new JPanelComImagemDeFundo("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\Inserir um subtítulo (2) (3).png");
		fundo.add(imagem,imagemC);

		Border borda =BorderFactory.createLineBorder(Color.black);
		menuCadastro = new JPanelComImagemDeFundo("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg");
		menuCadastro.setLayout(new GridBagLayout());
		menuCadastro.setBorder(borda);
		fundo.add(menuCadastro, menuCadastroC);

		textoNome = new JLabel("nome:");
		textoNome.setFont(fonte);
		menuCadastro.add(textoNome,textoNomeC);

		nome = new JTextFieldArredondado();
		nome.setColumns(10);
		nome.setText("nome");
		nome.setFont(fonte);
		menuCadastro.add(nome,nomeC);

		textoSenha = new JLabel("senha:");
		textoSenha.setFont(fonte);
		menuCadastro.add(textoSenha,textoSenhaC);

		senha = new JPasswordArredondado();
		senha.setColumns(10);
		senha.setText("senha");
		senha.setFont(fonte);
		menuCadastro.add(senha,senhaC);

		textoRendaDisponivel = new JLabel("renda:");
		textoRendaDisponivel.setFont(fonte);
		menuCadastro.add(textoRendaDisponivel,textoRendaDisponivelC);

		rendaDisponivel = new JTextFieldArredondado();
		rendaDisponivel.setColumns(10);
		rendaDisponivel.setText("renda disponivel");
		rendaDisponivel.setFont(fonte);
		menuCadastro.add(rendaDisponivel,rendaDisponivelC);

		textoSaldo = new JLabel("saldo:");
		textoSaldo.setFont(fonte);
		menuCadastro.add(textoSaldo,textoSaldoC);

		saldo = new JTextFieldArredondado();
		saldo.setColumns(10);
		saldo.setText("saldo");
		saldo.setFont(fonte);
		menuCadastro.add(saldo,saldoC);

		cadastrar = new BotaoArredondado();
		cadastrar.setText("cadastrar");
		cadastrar.setBackground(Color.green);
		menuCadastro.add(cadastrar,cadastrarC);

		cancelar = new BotaoArredondado();
		cancelar.setText("cancelar");
		cancelar.setBackground(Color.red);
		menuCadastro.add(cancelar,cancelarC);



	}
}
