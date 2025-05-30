package aula;

public class Motor {

    private int type;
    private int consumoPorHora;
    private boolean status;


    public Motor(int type, int consumoPorHora, boolean status) {
        this.type = type;
        this.consumoPorHora = consumoPorHora;
        this.status = status;
    }

    public void onOff(){
        this.status = !this.status;
    }

    public int getType() {
        return type;
    }

    public int getConsumoPorHora() {
        return consumoPorHora;
    }

    public boolean isStatus() {
        return status;
    }

    

    


}
