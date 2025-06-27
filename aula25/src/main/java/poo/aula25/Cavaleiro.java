package poo.aula25;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro(){
        super(2, 3, 50);
    }

    @Override
    public String atacar() {
        return "O Cavaleiro está atacando, dando " + this.ataque;
    }

    @Override
    public String mover() {
        return "O Cavaleiro está se movendo com velocidade" + this.velocidade;
    }
}
