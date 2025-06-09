package aula20;

import java.time.LocalDate;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones = new ColecaoTelefone();
    private ColecaoEmail emails = new ColecaoEmail();


    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor){
        boolean ret = telefones.add(rotulo, valor);
        return ret;
    }

    public String toString(){
        return "Nome: " + nome + "; Sobrenome: " + sobrenome + "; DataNascimento: " + dataNasc + "; Telefone: " + telefones.toString();
    }

    public String getNome() {
      return nome;
    }

    public String getSobrenome() {
      return sobrenome;
    }

    public LocalDate getDataNasc() {
      return dataNasc;
    }

    public ColecaoTelefone getTelefones() {
      return telefones;
    }

    public ColecaoEmail getEmails() {
      return emails;
    }

}
