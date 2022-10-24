package com.itismeucci;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) {
        XmlMapper mapper = new XmlMapper();
        Alunno a1 = new Alunno();
        a1.setName("Niccolò");
        a1.setSurname("Batistini");
        a1.setDataDiNascita(new Date(2004, 6, 30));
        Alunno a2 = new Alunno();
        a2.setName("Daniele");
        a2.setSurname("Nencioni");
        a2.setDataDiNascita(new Date(2004, 3, 27));
        ArrayList<Alunno> alunni = new ArrayList<Alunno>();
        alunni.add(a1);
        alunni.add(a2);
        Classe classe = new Classe();
        classe.setAlunni(alunni);
        classe.setAula("2-Tc");
        classe.setNumero(5);
        classe.setSezione("CIA");
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(new Classe());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
