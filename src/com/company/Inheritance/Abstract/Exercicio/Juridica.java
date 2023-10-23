package com.company.Inheritance.Abstract.Exercicio;

public class Juridica extends Pessoa{
    private  String nome;
    private Double rendaAnual;
    private int numFunc;

    public Juridica(){super();}

    public Juridica(TipoPersona persona, String nome, Double rendaAnual, int numFunc) {
        super(persona);
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.numFunc = numFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public double tax() {
        if(numFunc > 10){
            return rendaAnual * 0.14;
        }else{
            return  rendaAnual * 0.16;
        }
    }
}
