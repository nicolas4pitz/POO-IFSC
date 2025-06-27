package poo.aula25;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro(){
        super(1, 2, 35);
    }

    @Override
    public String atacar() {
        return "O arqueiro está atacando, dando " +this.ataque;
    }

    @Override
    public String mover() {
        return "O arqueiro está se movendo com velocidade" + this.velocidade;
    }
}
