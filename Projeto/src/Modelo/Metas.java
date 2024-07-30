package Modelo;

public class Metas {
    private int id;
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

    public Metas(String categoria, boolean status, String dataInicial, String dataFinal, String descricao, float valorTotal, float valorArrecadado, String recorrencia) {
        this.categoria = categoria;
        this.status = status;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorArrecadado = valorArrecadado;
        this.recorrencia = recorrencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
