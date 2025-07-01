package poo.engaual26;

public class RaposaDoCampo extends Canino implements Mamifero{
    @Override
    public boolean produzirLeite() {
        return true;
    }

    @Override
    public boolean paraDeProduzirLeite() {
        return false;
    }
}
