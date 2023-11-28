package polimorfismo;

import javax.swing.JOptionPane;

public class Polimorfismo {

    public static void main(String[] args) {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual área "
                + "deseja calcular?"));
        //1-quadrado e 2-triangulo
        switch (opcao){
            case 1:
                Quadrado q = new Quadrado();
                q.setLado(Double.parseDouble(JOptionPane.showInputDialog("Informe o "
                + "lado do quadrado")));
                q.area();
                JOptionPane.showMessageDialog(null, "A área é: "+q.getArea());
        }
    }
    
}
