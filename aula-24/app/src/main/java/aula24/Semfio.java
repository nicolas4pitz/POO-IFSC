package aula24;

public class Semfio extends Telefone{

    private double frequencia;
    private int canais;
    private double distancia;
    
    public Semfio(int codigo, String numSerie, double frequencia) {
        super(codigo, numSerie);
        this.frequencia = frequencia;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Freq: " + this.frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
