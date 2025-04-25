package main.java.poo;

import java.lang.reflect.Array;

public class Disciplina {


    private String disciplina;
    private String professor;
    private String sigla;
    private int cargaTeorica;
    private int cargaPratica;
    private int semestre;

    public Disciplina(String disciplina, String professor, int cargaPratica, int semestre, int cargaTeorica, String sigla){
        this.disciplina = disciplina;
        this.professor = professor;
        this.sigla = sigla;
        this.cargaPratica = cargaPratica;
        this.cargaTeorica = cargaTeorica;
        this.semestre = semestre;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public String getProfessor(){
        return professor;
    }

    public String getSigla(){
        return sigla;
    }

    public int getCargaPratica(){
        return cargaPratica;
    }

    public int getCargaTeorica(){
        return cargaTeorica;
    }

    public int getSemester(){
        return semestre;
    }

    public void mudarProfessor(String newProfessor){
        professor = newProfessor;
    }

    




}
