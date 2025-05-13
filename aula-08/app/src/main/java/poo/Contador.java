package poo;

public class Contador {
    private int valorAtual = 0;

    public void atribuirValor(int value){
        valorAtual = value;
    }

    public void incrementarValor(){
        valorAtual++;
    }

    public int pegarValor(){
        return valorAtual;
    }

}
