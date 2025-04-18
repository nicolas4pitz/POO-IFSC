package main.java.aula;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public void definirCor(String c){
        cor = c;
    }

    public void registrarTinta(double nivel){
        
        nivelTinta = (nivel >= 100) ? 100 : (nivel < 0 ? 0 : nivel);
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public void isAberta(){
        System.out.println(aberta);
    }

    public void qualCor(){
        System.out.println(cor);
    }

    public void obterTinta(){
        System.out.println(nivelTinta);
    }

    public String desenhar(int quantidade){
        String underline = "_";
        if(aberta){
            if(quantidade < 0){
                return "Não aceitamos numeros negativos";
            }
            for(int i = 0; i < quantidade; i++){
                if((nivelTinta) <= 0){
                    return underline.repeat(i);
                }
                nivelTinta -= 10;
            }
            return underline.repeat(quantidade);
            
        } else{
            return "A caneta está fechada";
        }
    }
}