package poo.aula25;

public class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(double velocidade, int ataque, int vida) {
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String atacar(){
        return String.format("está atacando o inimigo, dando %d de dano", this.ataque);
    }

    public String mover(){
        return String.format("está movendo com velocidade %d", this.velocidade);
    }
}
