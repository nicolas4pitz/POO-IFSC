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

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista){
      boolean verificar = contatos.get(indiceContatoNaLista).addTelefone(rotulo, valor);
      return verificar;
    }

    public Contato findContatos(String nome, String sobreNome){
      for (Contato contato : contatos) {
        if (contato.getNome().equals(nome) && contato.getSobrenome().equals(sobreNome)) {
            return contato;
        }
    }
      return null;
    }

}
