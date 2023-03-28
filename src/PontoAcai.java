import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {

        String menu = JOptionPane.showInputDialog(null, "1. 300ml \n2. 500ml \n3. 700ml",
                "Informe o tamanho", JOptionPane.PLAIN_MESSAGE);

        Acai acai = new Acai();

        if (menu.equals("1")) {
            acai.valor = 8.00;
            String opcao = JOptionPane.showInputDialog(null, "1. SIM \n2. NÃO",
                    "Possui acrescimo?", JOptionPane.PLAIN_MESSAGE);
            if (opcao.equals("1"))
                acai.acrescimo = true;
            else
                acai.acrescimo = false;

        } else if (menu.equals("2")) {
            acai.valor = 10.00;
            String opcao = JOptionPane.showInputDialog(null, "1. SIM \n2. NÃO",
                    "Possui acrescimo?", JOptionPane.PLAIN_MESSAGE);
            if(opcao.equals("1"))
                acai.acrescimo = true;
            else
                acai.acrescimo = false;
        }
        else if(menu.equals("3")){
            acai.valor = 12.00;
            String opcao = JOptionPane.showInputDialog(null,"1. SIM \n2. NÃO",
                    "Possui acrescimo?", JOptionPane.PLAIN_MESSAGE);
            if(opcao.equals("1"))
                acai.acrescimo = true;
            else
                acai.acrescimo = false;
        }
        else
            JOptionPane.showMessageDialog(null, "Opção Invalida");

        JOptionPane.showMessageDialog(null, "O seu pediu ficou no valor de " + acai.Calcular() + " reais",
                "Valor", JOptionPane.INFORMATION_MESSAGE);
    }

}