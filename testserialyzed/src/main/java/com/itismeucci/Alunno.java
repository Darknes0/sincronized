package com.itismeucci;

import java.util.Date;

public class Alunno {
  

    private String name;
    private String surname;
    private Date dataDiNascita;



    public Alunno() {
    }

    public Alunno(String name, String surname, Date dataDiNascita) {
        this.name = name;
        this.surname = surname;
        this.dataDiNascita = dataDiNascita;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Alunno name(String name) {
        setName(name);
        return this;
    }

    public Alunno surname(String surname) {
        setSurname(surname);
        return this;
    }

    public Alunno dataDiNascita(Date dataDiNascita) {
        setDataDiNascita(dataDiNascita);
        return this;
    }
 
}
