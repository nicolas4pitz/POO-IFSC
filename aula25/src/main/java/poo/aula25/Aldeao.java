package poo.aula25;

public class Aldeao extends Personagem{


    public Aldeao() {
        super(0.8, 1, 2);
    }

    @Override
    public String atacar() {
        return "O Aldeao " + super.atacar();
    }

    @Override
    public String mover() {
        return "O Aldeao " + super.mover();
    }
}
