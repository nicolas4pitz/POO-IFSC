package poo.engaual26;

public class UrsoPanda extends Urso implements Onivoro, Carnivoro{
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

    @Override
    public void comerOvo() {
        System.out.println("Comendo OVOS DE INIMIGOS");
    }
}
