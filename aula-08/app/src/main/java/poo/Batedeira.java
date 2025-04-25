package main.java.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Batedeira {

    private int porcentagemMistura = 0;
    private int velocidadeGiro = 10;
    
    public void novaVelocidade(int value){
        velocidadeGiro = value;
    }

    public void girar(){
        porcentagemMistura += velocidadeGiro;
    }

    public int getPorcentagemMistura(){
        return porcentagemMistura;
    }


}
