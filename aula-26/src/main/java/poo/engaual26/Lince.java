package poo.engaual26;

public class Lince extends Felino implements Carnivoro {

    @Override
    public void comerCarne() {
        System.out.println("Comendo");
    }

    @Override
    public boolean iniciarPerseguicao() {
        return true;
    }

    @Override
    public boolean pararPerseguicao() {
        return false;
    }
}
