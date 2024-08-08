package Visao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JpanelPerfil extends JPanel {

    private JPanel perfil;
    private GridBagConstraints perfilC;
    private JLabel textoPerfil;
    private GridBagConstraints textoPerfilC;
    private JPanel detalheCarteira;
    private GridBagConstraints detalheCarteiraC;
    private JLabel textoLimiteDespesasFixas;
    private GridBagConstraints textoLimiteDespesasFixasC;
    private JTextFieldArredondado limiteDespesasFixas;
    private GridBagConstraints limiteDespesasFixasC;
    private JLabel textoLimiteDespesasVariaveis;
    private GridBagConstraints textoLimiteDespesasVariaveisC;
    private JTextFieldArredondado limiteDespesasVariaveis;
    private GridBagConstraints limiteDespesasVariaveisC;
    private JLabel textoLimiteMetas;
    private GridBagConstraints textoLimiteMetasC;
    private JTextFieldArredondado limiteMetas;
    private GridBagConstraints limiteMetasC;
    private JPanel detalhePessoal;
    private GridBagConstraints detalhePessoalC;
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
    private BotaoArredondado editar;
    private GridBagConstraints editarC;
    private BotaoArredondado salvar;
    private GridBagConstraints salvarC;


        public JpanelPerfil() {
            setLayout(new GridBagLayout());
            Font fonte = new Font("Serif", Font.PLAIN, 20);
            Border borda = BorderFactory.createLineBorder(Color.black, 2);


            perfilC = new GridBagConstraints();
            perfilC.ipady = 215;
            perfilC.ipadx = 754;
            perfilC.gridheight = GridBagConstraints.REMAINDER;

            textoPerfilC = new GridBagConstraints();
            textoPerfilC.gridwidth = GridBagConstraints.REMAINDER;

            detalhePessoalC = new GridBagConstraints();

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

            detalheCarteiraC = new GridBagConstraints();
            detalheCarteiraC.ipady=100;
            detalheCarteiraC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasFixasC = new GridBagConstraints();
            textoLimiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);

            limiteDespesasFixasC = new GridBagConstraints();
            limiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);
            limiteDespesasFixasC.ipadx = 100;
            limiteDespesasFixasC.ipady = 20;
            limiteDespesasFixasC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasVariaveisC = new GridBagConstraints();
            textoLimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);

            limiteDespesasVariaveisC = new GridBagConstraints();
            limiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);
            limiteDespesasVariaveisC.ipadx = 100;
            limiteDespesasVariaveisC.ipady = 20;
            limiteDespesasVariaveisC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteMetasC = new GridBagConstraints();
            textoLimiteMetasC.insets = new Insets(50, 0, 0, 0);

            limiteMetasC = new GridBagConstraints();
            limiteMetasC.insets = new Insets(50, 0, 0, 0);
            limiteMetasC.ipadx = 100;
            limiteMetasC.ipady = 20;
            limiteMetasC.gridwidth = GridBagConstraints.REMAINDER;


            editarC = new GridBagConstraints();
            editarC.gridx=1;
            editarC.insets=new Insets(0,0,10,0);
            editarC.anchor = GridBagConstraints.LAST_LINE_END;

            salvarC = new GridBagConstraints();
            salvarC.gridx=1;
            salvarC.anchor = GridBagConstraints.LAST_LINE_END;

            perfil = new JPanel();
            perfil.setBackground(Color.white);
            perfil.setLayout(new GridBagLayout());
            perfil.setBorder(borda);
            add(perfil, perfilC);

            textoPerfil = new JLabel();
            textoPerfil.setText("Informacoes do Usuario");
            textoPerfil.setFont(new Font("Serif", Font.PLAIN, 40));
            perfil.add(textoPerfil, textoPerfilC);


            detalhePessoal = new JPanel();
            detalhePessoal.setBackground(Color.white);
            detalhePessoal.setLayout(new GridBagLayout());
            perfil.add(detalhePessoal, detalhePessoalC);

            textoLogin = new JLabel("login:");
            textoLogin.setFont(fonte);
            detalhePessoal.add(textoLogin, textoLoginC);

            login = new JTextFieldArredondado();
            login.setBackground(Color.cyan);
            login.setColumns(10);
            login.setText("Jose");
            login.setFont(fonte);
            login.setEditable(false);
            detalhePessoal.add(login, loginC);

            textoSenha = new JLabel("senha:");
            textoSenha.setFont(fonte);
            detalhePessoal.add(textoSenha,textoSenhaC);


            senha = new JPasswordArredondado();
            senha.setBackground(Color.cyan);
            senha.setColumns(10);
            senha.setText("Rojas");
            senha.setFont(fonte);
            senha.setEditable(false);
            detalhePessoal.add(senha,senhaC);

            textoSaldo = new JLabel("saldo:");
            textoSaldo.setFont(fonte);
            detalhePessoal.add(textoSaldo,textoSaldoC);

            saldo = new JTextFieldArredondado();
            saldo.setBackground(Color.cyan);
            saldo.setColumns(10);
            saldo.setText("1400");
            saldo.setFont(fonte);
            saldo.setEditable(false);
            detalhePessoal.add(saldo,saldoC);

            detalheCarteira = new JPanel();
            detalheCarteira.setBackground(Color.white);
            detalheCarteira.setLayout(new GridBagLayout());
            perfil.add(detalheCarteira, detalheCarteiraC);

            textoLimiteDespesasFixas = new JLabel("despesas fixas:");
            textoLimiteDespesasFixas.setFont(fonte);
            detalheCarteira.add(textoLimiteDespesasFixas, textoLimiteDespesasFixasC);

            limiteDespesasFixas = new JTextFieldArredondado();
            limiteDespesasFixas.setBackground(Color.cyan);
            limiteDespesasFixas.setColumns(10);
            limiteDespesasFixas.setText("50%");
            limiteDespesasFixas.setFont(fonte);
            limiteDespesasFixas.setEditable(false);
            detalheCarteira.add(limiteDespesasFixas, limiteDespesasFixasC);

            textoLimiteDespesasVariaveis = new JLabel("despesas variaveis:");
            textoLimiteDespesasVariaveis.setFont(fonte);
            detalheCarteira.add(textoLimiteDespesasVariaveis, textoLimiteDespesasVariaveisC);

            limiteDespesasVariaveis = new JTextFieldArredondado();
            limiteDespesasVariaveis.setBackground(Color.cyan);
            limiteDespesasVariaveis.setColumns(10);
            limiteDespesasVariaveis.setText("30%");
            limiteDespesasVariaveis.setFont(fonte);
            limiteDespesasVariaveis.setEditable(false);
            detalheCarteira.add(limiteDespesasVariaveis, limiteDespesasVariaveisC);

            textoLimiteMetas = new JLabel("metas:");
            textoLimiteMetas.setFont(fonte);
            detalheCarteira.add(textoLimiteMetas, textoLimiteMetasC);

            limiteMetas = new JTextFieldArredondado();
            limiteMetas.setBackground(Color.cyan);
            limiteMetas.setColumns(10);
            limiteMetas.setText("20%");
            limiteMetas.setFont(fonte);
            limiteMetas.setEditable(false);
            detalheCarteira.add(limiteMetas, limiteMetasC);

            editar = new BotaoArredondado();
            editar.setText("editar");
            editar.setFont(fonte);
            editar.setBackground(Color.YELLOW);
            perfil.add(editar,editarC);

            salvar = new BotaoArredondado();
            salvar.setText("salvar");
            salvar.setFont(fonte);
            salvar.setBackground(Color.GREEN);
            perfil.add(salvar,salvarC);

        }

    public JPanel getPerfil() {
        return perfil;
    }

    public void setPerfil(JPanel perfil) {
        this.perfil = perfil;
    }

    public GridBagConstraints getPerfilC() {
        return perfilC;
    }

    public void setPerfilC(GridBagConstraints perfilC) {
        this.perfilC = perfilC;
    }

    public JLabel getTextoPerfil() {
        return textoPerfil;
    }

    public void setTextoPerfil(JLabel textoPerfil) {
        this.textoPerfil = textoPerfil;
    }

    public GridBagConstraints getTextoPerfilC() {
        return textoPerfilC;
    }

    public void setTextoPerfilC(GridBagConstraints textoPerfilC) {
        this.textoPerfilC = textoPerfilC;
    }

    public JPanel getDetalheCarteira() {
        return detalheCarteira;
    }

    public void setDetalheCarteira(JPanel detalheCarteira) {
        this.detalheCarteira = detalheCarteira;
    }

    public GridBagConstraints getDetalheCarteiraC() {
        return detalheCarteiraC;
    }

    public void setDetalheCarteiraC(GridBagConstraints detalheCarteiraC) {
        this.detalheCarteiraC = detalheCarteiraC;
    }

    public JLabel getTextoLimiteDespesasFixas() {
        return textoLimiteDespesasFixas;
    }

    public void setTextoLimiteDespesasFixas(JLabel textoLimiteDespesasFixas) {
        this.textoLimiteDespesasFixas = textoLimiteDespesasFixas;
    }

    public GridBagConstraints getTextoLimiteDespesasFixasC() {
        return textoLimiteDespesasFixasC;
    }

    public void setTextoLimiteDespesasFixasC(GridBagConstraints textoLimiteDespesasFixasC) {
        this.textoLimiteDespesasFixasC = textoLimiteDespesasFixasC;
    }

    public JTextFieldArredondado getLimiteDespesasFixas() {
        return limiteDespesasFixas;
    }

    public void setLimiteDespesasFixas(JTextFieldArredondado limiteDespesasFixas) {
        this.limiteDespesasFixas = limiteDespesasFixas;
    }

    public GridBagConstraints getLimiteDespesasFixasC() {
        return limiteDespesasFixasC;
    }

    public void setLimiteDespesasFixasC(GridBagConstraints limiteDespesasFixasC) {
        this.limiteDespesasFixasC = limiteDespesasFixasC;
    }

    public JLabel getTextoLimiteDespesasVariaveis() {
        return textoLimiteDespesasVariaveis;
    }

    public void setTextoLimiteDespesasVariaveis(JLabel textoLimiteDespesasVariaveis) {
        this.textoLimiteDespesasVariaveis = textoLimiteDespesasVariaveis;
    }

    public GridBagConstraints getTextoLimiteDespesasVariaveisC() {
        return textoLimiteDespesasVariaveisC;
    }

    public void setTextoLimiteDespesasVariaveisC(GridBagConstraints textoLimiteDespesasVariaveisC) {
        this.textoLimiteDespesasVariaveisC = textoLimiteDespesasVariaveisC;
    }

    public JTextFieldArredondado getLimiteDespesasVariaveis() {
        return limiteDespesasVariaveis;
    }

    public void setLimiteDespesasVariaveis(JTextFieldArredondado limiteDespesasVariaveis) {
        this.limiteDespesasVariaveis = limiteDespesasVariaveis;
    }

    public GridBagConstraints getLimiteDespesasVariaveisC() {
        return limiteDespesasVariaveisC;
    }

    public void setLimiteDespesasVariaveisC(GridBagConstraints limiteDespesasVariaveisC) {
        this.limiteDespesasVariaveisC = limiteDespesasVariaveisC;
    }

    public JLabel getTextoLimiteMetas() {
        return textoLimiteMetas;
    }

    public void setTextoLimiteMetas(JLabel textoLimiteMetas) {
        this.textoLimiteMetas = textoLimiteMetas;
    }

    public GridBagConstraints getTextoLimiteMetasC() {
        return textoLimiteMetasC;
    }

    public void setTextoLimiteMetasC(GridBagConstraints textoLimiteMetasC) {
        this.textoLimiteMetasC = textoLimiteMetasC;
    }

    public JTextFieldArredondado getLimiteMetas() {
        return limiteMetas;
    }

    public void setLimiteMetas(JTextFieldArredondado limiteMetas) {
        this.limiteMetas = limiteMetas;
    }

    public GridBagConstraints getLimiteMetasC() {
        return limiteMetasC;
    }

    public void setLimiteMetasC(GridBagConstraints limiteMetasC) {
        this.limiteMetasC = limiteMetasC;
    }

    public JPanel getDetalhePessoal() {
        return detalhePessoal;
    }

    public void setDetalhePessoal(JPanel detalhePessoal) {
        this.detalhePessoal = detalhePessoal;
    }

    public GridBagConstraints getDetalhePessoalC() {
        return detalhePessoalC;
    }

    public void setDetalhePessoalC(GridBagConstraints detalhePessoalC) {
        this.detalhePessoalC = detalhePessoalC;
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

    public BotaoArredondado getEditar() {
        return editar;
    }

    public void setEditar(BotaoArredondado editar) {
        this.editar = editar;
    }

    public GridBagConstraints getEditarC() {
        return editarC;
    }

    public void setEditarC(GridBagConstraints editarC) {
        this.editarC = editarC;
    }

    public BotaoArredondado getSalvar() {
        return salvar;
    }

    public void setSalvar(BotaoArredondado salvar) {
        this.salvar = salvar;
    }

    public GridBagConstraints getSalvarC() {
        return salvarC;
    }

    public void setSalvarC(GridBagConstraints salvarC) {
        this.salvarC = salvarC;
    }
}




