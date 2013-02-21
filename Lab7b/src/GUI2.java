
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
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
public class GUI2 extends JFrame {

    class AL2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ev) {
            int age, sex = 0;
            float height;
            float weight;
            
            height = (int) (Float.parseFloat(tfHeight.getText().trim()) * 100) / 100f;
            String s = tfSex.getText().trim();
            if (s.equals("M"))
                sex = 1;
            else if (s.equals("F"))
                sex = 2;
            else
                JOptionPane.showMessageDialog(pLabels, "Eroare", "Eroare", JOptionPane.ERROR_MESSAGE);

            age = Integer.parseInt(tfAge.getText().trim());
            
            if (sex == 1)
                weight = height - 100 - ( (height - 150 ) / 4) + ((age - 20 / 4));
            else
                weight = height - 100 - ( (height - 150 ) / 2.5f) + ((age - 20 / 6));
            
            tfWeight.setText(weight + " kg");
        }

    }
    private JLabel lHeight, lWeight, lSex, lAge;
    private JTextField tfHeight, tfWeight, tfSex, tfAge;
    private JPanel pLabels, pFields;
    private JButton bCalc;

    public GUI2() throws HeadlessException {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lHeight = new JLabel("Inaltime(cm)");
        lWeight = new JLabel("Masa(kg)");
        lSex = new JLabel("Sex(M/F)");
        lAge = new JLabel("Varsta(ani)");
        
        tfHeight = new JTextField(10);
        tfWeight = new JTextField(10);
        tfSex = new JTextField(10);
        tfAge = new JTextField(10);
        
        pLabels = new JPanel(new GridLayout(0, 1));
        pLabels.add(lHeight);
        pLabels.add(lAge);
        pLabels.add(lSex);
        pLabels.add(lWeight);
        
        pFields = new JPanel(new GridLayout(0, 1));
        pFields.add(tfHeight);
        pFields.add(tfAge);
        pFields.add(tfSex);
        pFields.add(tfWeight);
        
        bCalc = new JButton("Calc");
        bCalc.addActionListener(new AL2());
        
        this.add(pLabels);
        this.add(pFields);
        this.add(bCalc);
        this.pack();
    }
    
    
    public static void main(String[] args) {
        GUI2 gui = new GUI2();
        gui.setVisible(true);
    }
}
