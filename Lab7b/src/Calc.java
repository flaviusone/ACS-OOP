
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mihnea
 */
public class Calc {
    
    class AL3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            float nr1, nr2, rez=0;
            nr1 = Float.parseFloat(tfNr1.getText().trim());
            nr2 = Float.parseFloat(tfNr2.getText().trim());
            
            Object src = arg0.getSource();
            if (src == bAdd)
                rez = nr1 + nr2;
            else if (src == bSub)
                rez = nr1 - nr2;
            else if (src == bMul)
                rez = nr1 * nr2;
            else if (src == bDiv)
                rez = nr1 / nr2;
            
            tfRezultat.setText(Float.toString(rez));
        }
        
    }
    
    private JFrame frame;
    private JLabel lNr1, lNr2, lRezultat;
    private JTextField tfNr1, tfNr2, tfRezultat;
    private JButton bAdd, bSub, bDiv, bMul;
    private JPanel p1, p2, p3;
    private AL3 lis;

    public Calc() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lis = new AL3();

        bAdd = new JButton("+");
        bSub = new JButton("-");
        bDiv = new JButton("/");
        bMul = new JButton("x");
        
        bAdd.addActionListener(lis);
        bSub.addActionListener(lis);
        bMul.addActionListener(lis);
        bDiv.addActionListener(lis);
        
        lNr1 = new JLabel("Primul numar:");
        lNr2 = new JLabel("Al doilea numar:");
        lRezultat = new JLabel("Rezultat:");
        
        tfNr1 = new JTextField(10);
        tfNr2 = new JTextField(10);
        tfRezultat = new JTextField(10);
        
        p1 = new JPanel(new GridLayout(0, 1));
        p2 = new JPanel(new GridLayout(0, 1));
        p3 = new JPanel(new GridLayout(2, 2));
        
        p1.add(lNr1);
        p1.add(lNr2);
        p1.add(lRezultat);
        
        p2.add(tfNr1);
        p2.add(tfNr2);
        p2.add(tfRezultat);
        
        p3.add(bAdd);
        p3.add(bSub);
        p3.add(bMul);
        p3.add(bDiv);
        
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Calc gui = new Calc();
    }
    
}
