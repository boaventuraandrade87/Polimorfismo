package polimorfismo;

import javax.swing.JOptionPane;

public class Polimorfismo {

    public static void main(String[] args) {
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual área "
                + "Deseja calcular ?"));
        //1-quadrado e 2-triangulo
        switch (opcao) {
            case 1:
                Quadrado q = new Quadrado();
                q.setLado(Double.parseDouble(JOptionPane.showInputDialog("Informe o "
                        + "lado do quadrado")));
                q.area();
                JOptionPane.showMessageDialog(null, "A area é: " + q.getArea());
        
            case 2:
                Triangulo t = new Triangulo();
                t.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a "
                        + "altura do triangulo")));
                t.setBase(Double.parseDouble(JOptionPane.showInputDialog("Informe a "
                        + "base do triangulo")));
                t.area();
                JOptionPane.showMessageDialog(null, "A area é: " + t.getArea());
                
             case 3:
                Circulo c = new Circulo();
                c.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Informe o "
                        + "raio do circulo")));
                c.area();
                JOptionPane.showMessageDialog(null, "A area é: " + c.getArea()); 
                
             case 4:
                Cilindro l = new Cilindro();
                l.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Informe o "
                        + "raio do cilindro")));
                l.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a "
                        + "altura do cilindro")));
                l.area();
                JOptionPane.showMessageDialog(null, "A area é: " + l.getArea());       
                
                

        }

    }
}
