package com.company.Inheritance.Abstract.Exercicio;

public abstract class Pessoa {
    private TipoPersona persona;

    public Pessoa(){}

    public Pessoa(TipoPersona persona) {
        this.persona = persona;
    }

    public TipoPersona getPersona() {
        return persona;
    }

    public void setPersona(TipoPersona persona) {
        this.persona = persona;
    }
    public abstract double tax();
}
