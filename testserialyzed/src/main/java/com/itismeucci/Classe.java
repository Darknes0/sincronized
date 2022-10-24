package com.itismeucci;

import java.util.ArrayList;

public class Classe {
    
    private int numero;
    private String sezione;
    private String aula;
    private ArrayList<Alunno> alunni;

    public Classe() {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> alunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = alunni;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getAlunni() {
        return this.alunni;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe sezione(String sezione) {
        setSezione(sezione);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe alunni(ArrayList<Alunno> alunni) {
        setAlunni(alunni);
        return this;
    }


}
