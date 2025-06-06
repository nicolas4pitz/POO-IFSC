package aula20;

import java.util.HashMap;
import java.util.Map;

public class ColecaoEmail {

    String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private Map<String, String> dados;

    public ColecaoEmail() {
        this.dados = new HashMap();
    }


    public boolean add(String rotulo, String valor){
        if(valor.matches(eR)){
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo){
        if(dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }
        
        return false;
    }

    public boolean update(String rotulo, String valor){
        if(dados.containsKey(rotulo)){
            boolean match = this.add(rotulo, valor);
            if(match == false){
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString(){
        return "Rotulo --- Valor";
    }

}
