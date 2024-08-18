package Modelo;

public class DespesaFixa extends Despesas{
    private int idDespesaFixa;
    private double valorMensal;

    public DespesaFixa() {}

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public int getIdDespesaFixa() {
        return idDespesaFixa;
    }

    public void setIdDespesaFixa(int idDespesaFixa) {
        this.idDespesaFixa = idDespesaFixa;
    }

    @Override
    public String toString() {
        return getCategoria() + " R$" + getValorMensal();
    }
}
