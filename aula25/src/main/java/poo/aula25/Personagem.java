package poo.aula25;

public abstract class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(double velocidade, int ataque, int vida) {
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.vida = vida;
    }

    public abstract String atacar();

    public abstract String mover();
}
