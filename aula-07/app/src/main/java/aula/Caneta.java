package main.java.aula;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public void definirCor(String c){
        cor = c;
    }

    public void registrarTinta(double nivel){
        nivelTinta = nivel;
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public String qualCor(){
        return cor;
    }



}
