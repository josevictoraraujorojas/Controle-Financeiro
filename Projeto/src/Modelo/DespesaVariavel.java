package Modelo;

public class DespesaVariavel extends Despesas{

    private double valor;
    private int qtdParcelasPagas;
    private int qtdParcelas;

    public DespesaVariavel() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdParcelasPagas() {
        return qtdParcelasPagas;
    }

    public void setQtdParcelasPagas(int qtdParcelasPagas) {
        this.qtdParcelasPagas = qtdParcelasPagas;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public String toString() {
        return getCategoria();
    }
}
