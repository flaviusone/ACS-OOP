
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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



public class GUI1 {
    private JFrame frame;
    private JLabel lHeight;
    private JTextField tfHeight;
    private JLabel lWeight;
    private JTextField tfWeight;
    private JPanel p1;
    private JPanel p2;
    private JButton bCalc;

    public GUI1() {
        frame = new JFrame();
        frame.setLayout(new GridLayout(0, 1));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lHeight = new JLabel("Inaltime(m)");
        tfHeight = new JTextField(10);
        tfHeight.addActionListener(new AL());
        
        lWeight = new JLabel("Masa(kg)");
        tfWeight = new JTextField(10);
        
        bCalc = new JButton("Calc");
        bCalc.addActionListener(new AL());
        
        p1 = new JPanel();
        p2 = new JPanel();
        
        p1.add(lHeight);
        p1.add(tfHeight);
        
        p2.add(lWeight);
        p2.add(tfWeight);
        p2.add(bCalc);
        
        frame.add(p1);
        frame.add(p2);
        frame.setVisible(true);
    }
    
    class AL implements ActionListener {
    	
        @Override
        public void actionPerformed(ActionEvent ev) {
            
            float height = (int) (Float.parseFloat(tfHeight.getText().trim()) * 100) / 100f;

            if (height < 1 || height > 2) {
                JOptionPane.showMessageDialog(tfHeight, "Eroare", "Eroare", JOptionPane.ERROR_MESSAGE);
            }
            
            ///float weight = (int) (Float.parseFloat(tfWeight.getText().trim()) * 100) / 100f;
            
            float ideal = height * height * 21.70f;
            ideal = (int) (ideal * 100) / 100f;
            
            tfWeight.setText(ideal + " kg");
        }
    
    }
    
    public static void main(String[] args) {
        GUI1 gui = new GUI1();
    }
}
