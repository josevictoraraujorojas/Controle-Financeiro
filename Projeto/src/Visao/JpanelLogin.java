package Visao;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class JpanelLogin extends JPanel {
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



    public JpanelLogin(){
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,20);


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
        login.setColumns(10);
        login.setFont(fonte);
        textoLogin = new JLabel("Login:");
        textoLogin.setFont(fonte);



        senha = new JPasswordArredondado();
        senha.setColumns(10);
        senha.setFont(fonte);
        textoSenha= new JLabel("Senha: ");
        textoSenha.setFont(fonte);



        botaoLogin = new BotaoArredondado();
        Icon icone = new ImageIcon(Objects.requireNonNull(getClass().getResource("Imagem\\Icons8-Windows-8-User-Interface-Login.512 (1) (1).png")));
        botaoLogin.setIcon(icone);
        botaoLogin.setBackground(Color.white);



        registrar = new BotaoArredondado();
        Icon icone2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Imagem\\144688423-editar-ícone-cone-do-lápis-inscrever-se-icon-vector (1).jpg")));
        registrar.setIcon(icone2);
        registrar.setBackground(Color.white);

        menuLogin = new JPanelComImagemDeFundo(Objects.requireNonNull(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg")));
        menuLogin.setLayout(new GridBagLayout());
        Border borda = BorderFactory.createLineBorder(Color.black);
        menuLogin.setBorder(borda);
        add(menuLogin,menuLoginC);

        menuLogin.add(textoLogin,textoLoginC);
        menuLogin.add(login,loginC);
        menuLogin.add(textoSenha,senhaTextoC);
        menuLogin.add(senha,senhaC);
        menuLogin.add(botaoLogin,botaoLoginC);
        menuLogin.add(registrar,registreC);
    }

    public JTextFieldArredondado getLogin() {
        return login;
    }

    public GridBagConstraints getLoginC() {
        return loginC;
    }

    public JPasswordArredondado getSenha() {
        return senha;
    }

    public GridBagConstraints getSenhaC() {
        return senhaC;
    }

    public BotaoArredondado getBotaoLogin() {
        return botaoLogin;
    }

    public GridBagConstraints getBotaoLoginC() {
        return botaoLoginC;
    }

    public BotaoArredondado getRegistrar() {
        return registrar;
    }

    public GridBagConstraints getRegistreC() {
        return registreC;
    }

    public JLabel getTextoLogin() {
        return textoLogin;
    }

    public GridBagConstraints getTextoLoginC() {
        return textoLoginC;
    }

    public JLabel getTextoSenha() {
        return textoSenha;
    }

    public GridBagConstraints getSenhaTextoC() {
        return senhaTextoC;
    }

    public JPanelComImagemDeFundo getMenuLogin() {
        return menuLogin;
    }

    public GridBagConstraints getMenuLoginC() {
        return menuLoginC;
    }

    public void setLogin(JTextFieldArredondado login) {
        this.login = login;
    }

    public void setLoginC(GridBagConstraints loginC) {
        this.loginC = loginC;
    }

    public void setSenha(JPasswordArredondado senha) {
        this.senha = senha;
    }

    public void setSenhaC(GridBagConstraints senhaC) {
        this.senhaC = senhaC;
    }

    public void setBotaoLogin(BotaoArredondado botaoLogin) {
        this.botaoLogin = botaoLogin;
    }

    public void setBotaoLoginC(GridBagConstraints botaoLoginC) {
        this.botaoLoginC = botaoLoginC;
    }

    public void setRegistrar(BotaoArredondado registrar) {
        this.registrar = registrar;
    }

    public void setRegistreC(GridBagConstraints registreC) {
        this.registreC = registreC;
    }

    public void setTextoLogin(JLabel textoLogin) {
        this.textoLogin = textoLogin;
    }

    public void setTextoLoginC(GridBagConstraints textoLoginC) {
        this.textoLoginC = textoLoginC;
    }

    public void setTextoSenha(JLabel textoSenha) {
        this.textoSenha = textoSenha;
    }

    public void setSenhaTextoC(GridBagConstraints senhaTextoC) {
        this.senhaTextoC = senhaTextoC;
    }

    public void setMenuLogin(JPanelComImagemDeFundo menuLogin) {
        this.menuLogin = menuLogin;
    }

    public void setMenuLoginC(GridBagConstraints menuLoginC) {
        this.menuLoginC = menuLoginC;
    }
}
