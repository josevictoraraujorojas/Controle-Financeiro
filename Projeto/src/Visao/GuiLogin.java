package Visao;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiLogin extends JFrame {
    private JTextFieldArredondado login;
    private GridBagConstraints loginC = new GridBagConstraints();
    private JPasswordArredondado senha;
    private GridBagConstraints senhaC = new GridBagConstraints();
    private BotaoArredondado botaoLogin;
    private GridBagConstraints botaoLoginC = new GridBagConstraints();
    private BotaoArredondado registrar;
    private GridBagConstraints registreC = new GridBagConstraints();
    private JLabel  textoLogin;
    private GridBagConstraints textoLoginC = new GridBagConstraints();
    private JLabel  textoSenha;
    private GridBagConstraints senhaTextoC = new GridBagConstraints();
    private JPanelComImagemDeFundo  menuLogin;
    private GridBagConstraints menuLoginC;
    private JPanelComImagemDeFundo  fundo;
    private GridBagConstraints fundoC;

    public GuiLogin() throws HeadlessException {
        super("tela login");
        setLayout(new GridBagLayout());
        getContentPane().setBackground(Color.white);


        Menu();

    }
    public void Menu(){
        Font fonte = new Font("Serif",Font.PLAIN,20);

        fundoC = new GridBagConstraints();
        fundoC.weighty=1;
        fundoC.weightx=1;
        fundoC.fill=GridBagConstraints.BOTH;

        menuLoginC = new GridBagConstraints();
        menuLoginC.ipady=250;
        menuLoginC.ipadx=250;

        loginC = new GridBagConstraints();
        loginC.ipadx=100;
        loginC.ipady=20;

        textoLoginC = new GridBagConstraints();

        senhaTextoC = new GridBagConstraints();
        senhaTextoC.gridy=2;

        senhaC = new GridBagConstraints();
        senhaC.ipadx=100;
        senhaC.ipady=20;
        senhaC.gridy=2;

        botaoLoginC = new GridBagConstraints();
        botaoLoginC.ipady=42;
        botaoLoginC.ipadx=20;
        botaoLoginC.insets=new Insets(0,20,0,0);
        botaoLoginC.gridheight=3;

        registreC = new GridBagConstraints();
        registreC.gridy=3;
        registreC.gridx=0;
        registreC.insets=new Insets(0,0,0,205);
        registreC.gridwidth=GridBagConstraints.REMAINDER;


        login = new JTextFieldArredondado();
        login.setText("Login");
        login.setColumns(10);
        login.setFont(fonte);
        textoLogin = new JLabel("Login:");
        textoLogin.setFont(fonte);



        senha = new JPasswordArredondado();
        senha.setText("senha");
        senha.setColumns(10);
        senha.setFont(fonte);
        textoSenha= new JLabel("Senha: ");
        textoSenha.setFont(fonte);



        botaoLogin = new BotaoArredondado();
        Icon icone = new ImageIcon(getClass().getResource("Imagem\\Icons8-Windows-8-User-Interface-Login.512 (1) (1).png"));
        botaoLogin.setIcon(icone);
        botaoLogin.setBackground(Color.white);



        registrar = new BotaoArredondado();
        Icon icone2 = new ImageIcon(getClass().getResource("Imagem\\144688423-editar-ícone-cone-do-lápis-inscrever-se-icon-vector (1).jpg"));
        registrar.setIcon(icone2);
        registrar.setBackground(Color.white);

        menuLogin = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        menuLogin.setLayout(new GridBagLayout());
        Border borda = BorderFactory.createLineBorder(Color.black);
        menuLogin.setBorder(borda);

        menuLogin.add(textoLogin,textoLoginC);
        menuLogin.add(login,loginC);
        menuLogin.add(textoSenha,senhaTextoC);
        menuLogin.add(senha,senhaC);
        menuLogin.add(botaoLogin,botaoLoginC);
        menuLogin.add(registrar,registreC);


        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo.jpg"));
        fundo.setLayout(new GridBagLayout());


        fundo.add(menuLogin, menuLoginC);

        add(fundo,fundoC);
    }
}
