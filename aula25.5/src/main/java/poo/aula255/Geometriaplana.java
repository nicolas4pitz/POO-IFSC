package poo.aula255;

public class Geometriaplana {

    private String cor;
    private int x;
    private int y;

    public Geometriaplana(String cor, int x, int y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }


    public String desenhar(){
        return String.format("A cor da linha é %s, na coordenada %i e %i", this.cor, this.x, this.y);
    }
}
