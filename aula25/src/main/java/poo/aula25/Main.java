package poo.aula25;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        System.out.println(aldeao.atacar());
        System.out.println(arqueiro.atacar());
        System.out.println(cavaleiro.atacar());
    }
}