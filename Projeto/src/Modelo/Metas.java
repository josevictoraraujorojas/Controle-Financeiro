package Modelo;

public class Metas {
    private int idMetas;
    private int idUsuario;
    private String categoria;
    private boolean status;
    private String dataInicial;
    private String dataFinal;
    private String descricao;
    private float valorTotal;
    private float valorArrecadado;
    private String recorrencia;

    public Metas(){

    }

    public int getIdMetas() {
        return idMetas;
    }

    public void setIdMetas(int idMetas) {
        this.idMetas = idMetas;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(float valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public String getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }

    @Override
    public String toString() {
        return getCategoria() + " Arrecado R$" + valorArrecadado + "/ Total R$" + valorTotal;
    }
}
