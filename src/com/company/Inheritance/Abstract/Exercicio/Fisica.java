package com.company.Inheritance.Abstract.Exercicio;

public class Fisica extends Pessoa{
    private  String nome;
    private Double rendaAnual;
    private Double gastoSaude;

    public Fisica(){super();}

    public Fisica(TipoPersona persona, String nome, Double rendaAnual, Double gastoSaude) {
        super(persona);
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.gastoSaude = gastoSaude;
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

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double tax() {
        if(rendaAnual < 20000.00){
            return (rendaAnual * 0.15) - (gastoSaude * 0.5);
        }else{
            return (rendaAnual * 0.25) - (gastoSaude * 0.5);
        }
    }
}
