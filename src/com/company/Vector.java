package com.company;

import java.util.Arrays;

public class Vector {
    private String[] elements;
    //Ajuda a guarda na memoria qual a ultima pos
    private int tamanhoVetor ;

    public Vector(int capacidade){
        this.elements = new String[capacidade];
        this.tamanhoVetor = 0;
    }

    //adicionar elemento no final do vetor
    public boolean addLastVector(String elemento)  {
        aumentarCapacidade();
        if(tamanhoVetor < elements.length){
            elements[this.tamanhoVetor] = elemento;
            tamanhoVetor++;
            return true;
        }
        else{
            return  false;
        }
    }
    //Adicionar elemento em qualquer posição
    public void addElementosPos(int pos, String elemento){
        aumentarCapacidade();
        if(!(pos >= 0 && pos < tamanhoVetor)){
            System.out.println("POSIÇÃO NÃO EXISTE");
        }
        //Mover todos os elementos
        for(int i = tamanhoVetor-1; i >= pos; i--){
            elements[i+1] = elements[i];
        }
        elements[pos] = elemento;
        tamanhoVetor++;
    }
    private void aumentarCapacidade(){
        if(this.tamanhoVetor == elements.length){
            String [] elementosNovos = new String[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++){
                elementosNovos[i] = this.elements[i];
            }
            this.elements = elementosNovos;
        }
    }
    //Remover qaulquer pos
    public void remove(int pos){
        if(!(pos >= 0 && pos < tamanhoVetor)){
            System.out.println("POSIÇÃO NÃO EXISTE");
        }
        //Mover todos os elementos
        for(int i = pos; i < tamanhoVetor-1; i++){
            elements[i] = elements[i+1];
        }
        tamanhoVetor--;
    }

    //Verifica tamanho
    public int lenghtVetor(){
        return tamanhoVetor;
    }

    //Obter elemento de uma posição
    public String getElement(int pos){
        if(!(pos >= 0 && pos < tamanhoVetor)){
            return "Posição invalida";
        }
        return elements[pos];
    }

    //Buscar por nome
    public int buscarElemento(String name){
        for(int i = 0; i < tamanhoVetor; i++){
            if(elements[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanhoVetor-1;i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if(this.tamanhoVetor > 0){
            s.append(this.elements[this.tamanhoVetor-1]);
        }
        s.append("]");
        return s.toString();
    }
}
