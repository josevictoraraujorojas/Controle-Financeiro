package Modelo;

import java.util.ArrayList;

public class Carteira {
    private double limiteDespesaFixa;
    private double limiteDespesaVariavel;
    private double limiteMetas;
    private ArrayList<Metas> listaMetas;
    private ArrayList<DespesaFixa> listaDespesaFixa;
    private ArrayList<DespesaVariavel> listaDespesaVariavel;

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

    public ArrayList<Metas> getListaMetas() {
        return listaMetas;
    }

    public void setListaMetas(ArrayList<Metas> listaMetas) {
        this.listaMetas = listaMetas;
    }

    public ArrayList<DespesaFixa> getListaDespesaFixa() {
        return listaDespesaFixa;
    }

    public void setListaDespesaFixa(ArrayList<DespesaFixa> listaDespesaFixa) {
        this.listaDespesaFixa = listaDespesaFixa;
    }

    public ArrayList<DespesaVariavel> getListaDespesaVariavel() {
        return listaDespesaVariavel;
    }

    public void setListaDespesaVariavel(ArrayList<DespesaVariavel> listaDespesaVariavel) {
        this.listaDespesaVariavel = listaDespesaVariavel;
    }
}
