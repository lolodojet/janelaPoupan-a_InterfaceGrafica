import java.awt.*;
import javax.swing.*;

public class Poupanca {
    
    public static void main(String[] args) {
        System.out.println("Programa rodando");

        JFrame frame = new JFrame("Poupex");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(220, 220, 220));
        frame.setContentPane(panel);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2, 2, 2, 2);
        c.fill = GridBagConstraints.HORIZONTAL;
        
        // Label e campo do juros
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Juros ao mês %: "), c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.WEST;
        JTextField juros = new JTextField(10);
        panel.add(juros, c);

        
        // Label e campo anos
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        c.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Num. de anos: "), c);

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.WEST;
        JTextField anos = new JTextField(10);
        panel.add(anos, c);


        //  Label e campo deposito 
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0;
        c.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Depósito mensal R$: "), c);

        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.WEST;
        JTextField deposito = new JTextField(10);
        panel.add(deposito, c);

        // Label e campo total
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0;
        c.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Total poupado R$: "), c);

        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 1.0; 
        c.anchor = GridBagConstraints.WEST;
        JTextField total = new JTextField(10);
        total.setEditable(false);
        panel.add(total, c);

        c.gridx = 1;
        c.gridy = 4;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(10, 2, 2, 2);
        JButton button = new JButton("OK");
        panel.add(button, c);

        frame.setVisible(true);
    }
}