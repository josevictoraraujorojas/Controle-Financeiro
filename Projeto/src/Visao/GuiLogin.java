package Visao;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiLogin extends JFrame {
    JTextFieldArredondado user;
    GridBagConstraints userC = new GridBagConstraints();
    JPasswordArredondado senha;
    GridBagConstraints senhaC = new GridBagConstraints();
    BotaoArredondado login;
    GridBagConstraints loginC = new GridBagConstraints();
    BotaoArredondado registrar;
    GridBagConstraints registreC = new GridBagConstraints();
    JLabel  textoUser;
    GridBagConstraints userTextoC = new GridBagConstraints();
    JLabel  textoSenha;
    GridBagConstraints senhaTextoC = new GridBagConstraints();
    JPanelComImagemDeFundo  menuLogin;
    GridBagConstraints menuLoginC;
    JPanelComImagemDeFundo  fundo;
    GridBagConstraints fundoC;

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

        userC = new GridBagConstraints();
        userC.ipadx=100;
        userC.ipady=20;

        userTextoC = new GridBagConstraints();

        senhaTextoC = new GridBagConstraints();
        senhaTextoC.gridy=2;

        senhaC = new GridBagConstraints();
        senhaC.ipadx=100;
        senhaC.ipady=20;
        senhaC.gridy=2;

        loginC = new GridBagConstraints();
        loginC.ipady=42;
        loginC.ipadx=20;
        loginC.gridheight=3;

        registreC = new GridBagConstraints();
        registreC.gridy=3;
        registreC.gridx=0;
        registreC.insets=new Insets(0,0,0,205);
        registreC.gridwidth=GridBagConstraints.REMAINDER;


        user = new JTextFieldArredondado();
        user.setText("user");
        user.setColumns(10);
        user.setFont(fonte);
        textoUser = new JLabel("User:");
        textoUser.setFont(fonte);



        senha = new JPasswordArredondado();
        senha.setText("senha");
        senha.setColumns(10);
        senha.setFont(fonte);
        textoSenha= new JLabel("Senha: ");
        textoSenha.setFont(fonte);



        login = new BotaoArredondado();
        Icon icone = new ImageIcon(("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\Icons8-Windows-8-User-Interface-Login.512 (1) (1).png"));
        login.setIcon(icone);
        login.setBackground(Color.white);



        registrar = new BotaoArredondado();
        Icon icone2 = new ImageIcon(("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\144688423-editar-ícone-cone-do-lápis-inscrever-se-icon-vector (1).jpg"));
        registrar.setIcon(icone2);
        registrar.setBackground(Color.white);

        menuLogin = new JPanelComImagemDeFundo("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg");
        menuLogin.setLayout(new GridBagLayout());
        Border borda = BorderFactory.createLineBorder(Color.black);
        menuLogin.setBorder(borda);

        menuLogin.add(textoUser,userTextoC);
        menuLogin.add(user,userC);
        menuLogin.add(textoSenha,senhaTextoC);
        menuLogin.add(senha,senhaC);
        menuLogin.add(login,loginC);
        menuLogin.add(registrar,registreC);


        fundo = new JPanelComImagemDeFundo("C:\\Users\\Jose\\IdeaProjects\\Controle-Financeiro\\Projeto\\src\\Imagem\\contas-a-pagar-e-receber.jpeg");
        fundo.setLayout(new GridBagLayout());



        fundo.add(menuLogin, menuLoginC);

        add(fundo,fundoC);
    }
}
