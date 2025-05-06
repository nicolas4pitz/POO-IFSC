package poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    private static final double NIVEL_PADRAO = 100;
    private static final String COR_PADRAO = "preta";
    private static final double NIVEL_PADRAO = false;



    public Caneta(String cor, double nivelTinta, boolean aberta){
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta = aberta;
    }

    public Caneta(){
        this("preta", 100, false);
    }

    public Caneta(String cor){
        this(cor, 100, false);
    }

    public Caneta(String cor, double nivelTinta){
        this(cor, nivelTinta, false);
    }

    public String desenhar(int quantidades, String caracter){
        return caracter.repeat(quantidades);
    }

    public String desenhar(int quantidades){
        return desenhar(quantidades, "-");
    }

    
}
