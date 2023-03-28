public class Acai {

    public Double valor;
    public Boolean acrescimo;

    public Double Calcular(){
        return((acrescimo)? valor + 2 : valor );
    }
}
