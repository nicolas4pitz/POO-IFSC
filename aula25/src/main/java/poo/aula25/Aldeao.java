package poo.aula25;

public class Aldeao extends Personagem implements Coletador, Guerreiro{


    public Aldeao() {
        super(0.8, 1, 2);
    }

    @Override
    public String atacar() {
        return "O Aldeao está atacando, dando "+this.ataque;
    }

    @Override
    public String mover() {
        return "O Aldeao está se movendo com velocidade " + this.velocidade;
    }

    @Override
    public String coletarOuro() {
        return "O Aldeao está coletando ouro";
    }

    @Override
    public String coletarMadeira() {
        return "O Aldeao está coletando madeira";
    }
}
