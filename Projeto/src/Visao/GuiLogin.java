package Visao;

import javax.swing.*;
import java.awt.*;

public class GuiLogin extends JFrame {
    JTextField user;
    GridBagConstraints userC = new GridBagConstraints();
    JPasswordField senha;
    GridBagConstraints senhaC = new GridBagConstraints();
    JButton login;
    GridBagConstraints loginC = new GridBagConstraints();
    JButton registrar;
    GridBagConstraints registreC = new GridBagConstraints();
    JLabel  textoUser;
    GridBagConstraints userTextoC = new GridBagConstraints();
    JLabel  textoSenha;
    GridBagConstraints senhaTextoC = new GridBagConstraints();
    JPanel  menuLogin;
    GridBagConstraints menuLoginC;

    public GuiLogin() throws HeadlessException {
        super("tela login");
        setLayout(new GridBagLayout());
        getContentPane().setBackground(Color.white);

        JLabel texto = new JLabel();
        Icon icone = new ImageIcon(getClass().getResource("7407996-user-icon-person-icon-client-symbol-login-head-sign-icon-design-vetor (1) (1).jpg"));
        texto.setIcon(icone);
        GridBagConstraints textoC = new GridBagConstraints();
        textoC.gridwidth=GridBagConstraints.REMAINDER;
        add(texto,textoC);

        Menu();

    }
    public void Menu(){
        Font fonte = new Font("Serif",Font.PLAIN,20);

        menuLoginC = new GridBagConstraints();
        menuLoginC.ipadx=200;
        menuLoginC.ipady=200;

        userC = new GridBagConstraints();
        userC.ipadx=100;
        userC.ipady=20;

        userTextoC = new GridBagConstraints();

        senhaTextoC = new GridBagConstraints();
        senhaTextoC.gridy=1;

        senhaC = new GridBagConstraints();
        senhaC.ipadx=100;
        senhaC.ipady=20;
        senhaC.gridy=1;

        loginC = new GridBagConstraints();
        loginC.ipady=42;
        loginC.ipadx=20;
        loginC.gridheight=2;

        registreC = new GridBagConstraints();
        registreC.gridy=3;
        registreC.gridx=0;
        registreC.insets=new Insets(0,0,0,205);
        registreC.gridwidth=GridBagConstraints.REMAINDER;



        user = new JTextField("user",10);
        user.setFont(fonte);
        textoUser = new JLabel("User:");
        textoUser.setFont(fonte);



        senha = new JPasswordField("senha",10);
        senha.setFont(fonte);
        textoSenha= new JLabel("Senha: ");
        textoSenha.setFont(fonte);



        login = new JButton();
        Icon icone = new ImageIcon(getClass().getResource("Icons8-Windows-8-User-Interface-Login.512 (1) (1).png"));
        login.setIcon(icone);
        login.setBackground(Color.white);



        registrar = new JButton();
        Icon icone2 = new ImageIcon(getClass().getResource("144688423-editar-ícone-cone-do-lápis-inscrever-se-icon-vector (1).jpg"));
        registrar.setIcon(icone2);
        registrar.setBackground(Color.white);



        menuLogin = new JPanel(new GridBagLayout());
        menuLogin.setBackground(Color.cyan);

        menuLogin.add(textoUser,userTextoC);
        menuLogin.add(user,userC);
        menuLogin.add(textoSenha,senhaTextoC);
        menuLogin.add(senha,senhaC);
        menuLogin.add(login,loginC);
        menuLogin.add(registrar,registreC);

        add(menuLogin,menuLoginC);
    }
}
