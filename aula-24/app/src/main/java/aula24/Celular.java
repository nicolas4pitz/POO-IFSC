package aula24;

public class Celular extends Semfio {

    private String sistemaOperacional;

    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, int canais,
            double distancia, String sistemaOperacional) {
        super(codigo, numSerie, frequencia);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Celular [sistemaOperacional=" + sistemaOperacional + "]";
    }

    

    

}
