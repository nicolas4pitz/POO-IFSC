package aula;

import java.util.ArrayList;

public class Aviao {

    private long tripulante;
    private long passageiro;
    private double peso;
    private long combustivel;

    private int maxTripulante;
    private int maxPassageiro;
    private int maxPeso;
    private int maxCombustivel;

    private ArrayList<Motor> motores;

    public Aviao(int maxTripulante, int maxPassageiro, int maxPeso, int maxCombustivel, ArrayList<Motor> motores) {
        this.maxTripulante = maxTripulante;
        this.maxPassageiro = maxPassageiro;
        this.maxPeso = maxPeso;
        this.maxCombustivel = maxCombustivel;
        this.motores = motores;
    }

    public Aviao(int maxTripulante, int maxPassageiro, int maxPeso, int maxCombustivel, int x) {
        this.maxTripulante = maxTripulante;
        this.maxPassageiro = maxPassageiro;
        this.maxPeso = maxPeso;
        this.maxCombustivel = maxCombustivel;
        motoresConstr(x);
    }

    public void viagem(){
        this.tripulante = Math.round((Math.random() * maxTripulante) + 1) * 75;
        this.passageiro = Math.round((Math.random() * maxPassageiro) + 1) * 75;
        this.peso = this.passageiro + this.tripulante;

    }

    public long getTripulante(){
        return this.tripulante;
    }

    public long getPassageiro(){
        return this.passageiro;
    }

    public double getPeso(){
        return this.peso;
    }

    private void motoresConstr(int quant){
        motores = new ArrayList<>();
        for(int i = 0; i < quant; i++){
            Motor novoMotor = new Motor(0, 1, false);            
            motores.add(novoMotor);
        }
    }

    public int consumoPorHora(){
        int quantidadeGasta = 0;
        for(int i = 0; i < motores.size(); i++){
            quantidadeGasta += (motores.get(i).getConsumoPorHora());
        }
        return quantidadeGasta;
    }

    public int acelerar(int tempo){
        double total = 0;
        for(int i = 0; i < motores.size(); i++){
            if(motores.get(i).isStatus() == false){
                return total;
            }
        }

        for(int i = 0; i < tempo; i++){
            total += consumoPorHora();
        }

        total = total * (peso * 0.1);

        int totalLong = 0;
        totalLong = (int)(total);

        return totalLong; 
        
    }

    public void ligarAviao(){
        for(int i = 0; i < motores.size(); i++){
            motores.get(i).onOff();
        }
    }

}
