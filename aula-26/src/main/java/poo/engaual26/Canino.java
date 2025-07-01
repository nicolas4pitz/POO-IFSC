package poo.engaual26;

public abstract class Canino extends Animal {

    private boolean balancandoCauda;

    public String latir(){
        return "latindo";
    }

    public boolean balancarCauda(){
        balancandoCauda = true;
        return balancandoCauda;
    }

    public boolean paraDeBalancarCauda(){
        balancandoCauda = false;
        return balancandoCauda;
    }

}
