package poo;

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

    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public void setProfessor(String prof){
        this.professor = prof;
    }
    public void setDisciplin(String disciplin){
        this.disciplina = disciplin;
    }

    public void setCargaTeorica(int teorica){
        this.cargaTeorica = teorica;
    }
    public void setPratica(int pratica){
        this.cargaPratica = pratica;
    }
    public void setSemester(int semester){
        this.semestre = semester;
    }

    public void mudarProfessor(String newProfessor){
        professor = newProfessor;
    }


    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("Professor");
        sb.append(this.professor + "\n");
        sb.append("Disciplina");
        sb.append(this.disciplina + "\n");
        sb.append("Sigla");
        sb.append(this.sigla + "\n");
        sb.append("Carga Pratica");
        sb.append(cargaPratica + "\n");
        sb.append("Carga Teorica");
        sb.append(cargaTeorica + "\n");
        sb.append("Semestre");
        sb.append(semestre + "\n");


        return sb.toString();
    }


}
