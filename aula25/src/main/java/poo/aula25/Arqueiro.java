package poo.aula25;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(1, 2, 35);
    }

    @Override
    public String atacar() {
        return "O arqueiro " + super.atacar();
    }

    @Override
    public String mover() {
        return "O arqueiro " + super.mover();
    }
}
