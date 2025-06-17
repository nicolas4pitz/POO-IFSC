package aula24;

public class Telefone {

    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie) {
        this.codigo = codigo;
        this.numSerie = numSerie;
    }

    public String toString(){
        return "Codigo " + this.codigo + " Numero de Serie " +this.numSerie;
    }

    public String getNumSerie() {
        return numSerie;
    }
}
