package poo.aula25;

public class Cavaleiro extends Personagem{

    public Cavaleiro(){
        super(2, 3, 50);
    }

    @Override
    public String atacar() {
        return "O Cavaleiro " + super.atacar();
    }

    @Override
    public String mover() {
        return "O Cavaleiro " + super.mover();
    }
}
