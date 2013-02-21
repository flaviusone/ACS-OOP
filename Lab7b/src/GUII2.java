import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.math.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GUII2 extends JFrame {
	private JTextField Perioada;
	private JTextField Dobanda;
	private JTextField Credit;
	private JLabel Rezultatul;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUII2 frame = new GUII2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUII2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 200);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));

		Label label_1 = new Label("Credit");
		panel.add(label_1);

		Label label_2 = new Label("Dobanda(%)");
		panel.add(label_2);

		Label label = new Label("Perioada");
		panel.add(label);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		Credit = new JTextField();
		Credit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int n;
				float d, C, result;
				String rezultat;
				if(!(Perioada.getText().equals("")) && !(Credit.getText().equals("")) && !(Dobanda.getText().equals("")))
				{
				n = Integer.parseInt(Perioada.getText());
				d = Float.parseFloat(Dobanda.getText());
				C = Float.parseFloat(Credit.getText());
				//System.out.println(Perioada.getText());
				result = (float) ((C*d)/( 12 * (1 - Math.pow(((1+(d/12))),( (-1)* n*12)))));
				Rezultatul.setText(String.valueOf(result));
				}
			}
		});
		panel_1.add(Credit);
		Credit.setColumns(10);

		Dobanda = new JTextField();
		Dobanda.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int n;
				float d, C, result;
				String rezultat;
				if(!(Perioada.getText().equals("")) && !(Credit.getText().equals("")) && !(Dobanda.getText().equals("")))
				{
				n = Integer.parseInt(Perioada.getText());
				d = Float.parseFloat(Dobanda.getText());
				C = Float.parseFloat(Credit.getText());
				//System.out.println(Perioada.getText());
				result = (float) ((C*d)/( 12 * (1 - Math.pow(((1+(d/12))),( (-1)* n*12)))));
				Rezultatul.setText(String.valueOf(result));
				}
			}
		});
		panel_1.add(Dobanda);
		Dobanda.setColumns(10);

		Perioada = new JTextField();
		Perioada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int n;
				float d, C, result;
				String rezultat;
				if(!(Perioada.getText().equals("")) && !(Credit.getText().equals("")) && !(Dobanda.getText().equals("")))
				{
				n = Integer.parseInt(Perioada.getText());
				d = Float.parseFloat(Dobanda.getText());
				C = Float.parseFloat(Credit.getText());
				//System.out.println(Perioada.getText());
				result = (float) ((C*d)/( 12 * (1 - Math.pow(((1+(d/12))),( (-1)* n*12)))));
				Rezultatul.setText(String.valueOf(result));
				}
			}
		});
		panel_1.add(Perioada);
		Perioada.setColumns(10);

		Rezultatul = new JLabel("");
		panel_1.add(Rezultatul);
	}

}
