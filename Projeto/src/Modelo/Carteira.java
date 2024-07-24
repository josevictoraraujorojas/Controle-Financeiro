package Modelo;

public class Carteira {
    private double limiteDespesaFixa;
    private double limiteDespesaVariavel;
    private double limiteMetas;
    private byte status;
    private double quantidadeFixas;
    private  double quantidadeVariavel;
    private  double quantidadeMetas;

    public Carteira(){

    }

    public double getLimiteDespesaFixa() {
        return limiteDespesaFixa;
    }

    public void setLimiteDespesaFixa(double limiteDespesaFixa) {
        this.limiteDespesaFixa = limiteDespesaFixa;
    }

    public double getLimiteDespesaVariavel() {
        return limiteDespesaVariavel;
    }

    public void setLimiteDespesaVariavel(double limiteDespesaVariavel) {
        this.limiteDespesaVariavel = limiteDespesaVariavel;
    }

    public double getLimiteMetas() {
        return limiteMetas;
    }

    public void setLimiteMetas(double limiteMetas) {
        this.limiteMetas = limiteMetas;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public double getQuantidadeFixas() {
        return quantidadeFixas;
    }

    public void setQuantidadeFixas(double quantidadeFixas) {
        this.quantidadeFixas = quantidadeFixas;
    }

    public double getQuantidadeVariavel() {
        return quantidadeVariavel;
    }

    public void setQuantidadeVariavel(double quantidadeVariavel) {
        this.quantidadeVariavel = quantidadeVariavel;
    }

    public double getQuantidadeMetas() {
        return quantidadeMetas;
    }

    public void setQuantidadeMetas(double quantidadeMetas) {
        this.quantidadeMetas = quantidadeMetas;
    }
}
