package Modelo;

public class Metas {
    private String numero;
    private String categoria;
    private byte status;
    private String dataInicial;
    private String dataFinal;
    private String descricao;
    private double valorTotal;
    private double valorDeContribuicao;
    private double valorArrecadado;
    private byte recorrencia;


    public Metas(){

    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDeContribuicao() {
        return valorDeContribuicao;
    }

    public void setValorDeContribuicao(double valorDeContribuicao) {
        this.valorDeContribuicao = valorDeContribuicao;
    }

    public double getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public byte getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(byte recorrencia) {
        this.recorrencia = recorrencia;
    }
}
