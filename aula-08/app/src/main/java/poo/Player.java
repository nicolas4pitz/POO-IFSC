package poo;

public class Player {

    private double vida = 100;
    private double stamina = 100;
    private double defense = 10;
    private double attackBase = 5;

    public double getVida(){
        return vida;
    }

    public double getStamina(){
        return stamina;
    }

    public double getDefense(){
        return defense;
    }

    public double getAttackBase(){
        return attackBase;
    }

    public void takeDamage(int damage){
        vida -= damage;
    }

    public void healYourself(int heal){
        vida += heal;
    }

}
