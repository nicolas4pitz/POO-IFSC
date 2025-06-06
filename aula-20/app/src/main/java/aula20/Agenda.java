package aula20;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(){

    }

    public boolean addContato(Contato c){
        contatos.add(c);
        return true;
    }

    public boolean listar(){
        contatos.toString();
        return true;
    }

}
