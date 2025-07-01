package poo.engaual26;

public abstract class Felino extends Animal{

    protected boolean visaoNoturna;
    protected boolean garraRetrateis;

    public boolean usarVisaoNoturna(){
        visaoNoturna = true;
        return visaoNoturna;
    }

    public boolean paraDeUsarVisaoNoturna(){
        visaoNoturna = false;
        return visaoNoturna;
    }

    public boolean usarGarras(){
        garraRetrateis = true;
        return garraRetrateis;
    }

    public boolean paraDeUsarGarra(){
        garraRetrateis = false;
        return garraRetrateis;
    }

}
