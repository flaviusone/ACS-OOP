import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Button;


public class TableSort extends JFrame {

	private JPanel contentPane;
	private JTextField tf3;
	private JTextField textField_1;
	private Button button;
	private JTextField tf4;
	private JTextField tf2;
	private JTextField tf1;
	private JTextField tf6;
	private JTextField tf5;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Object[][] data = { { "c",4, 3.3},{ "a",5, 9.6},{"b",1, 6.4} }; 
					TableSort frame = new TableSort(data);
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
	TableSort (Object[][] t){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		tf1 = new JTextField();
		tf1.setText("a");
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setText("5");
		panel.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setText("9.6");
		panel.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setText("b");
		panel.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setText("1");
		panel.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setText("6.4");
		panel.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setText("c");
		panel.add(tf7);
		tf7.setColumns(10);
		
		tf8 = new JTextField();
		tf8.setText("4");
		panel.add(tf8);
		tf8.setColumns(10);
		
		tf9 = new JTextField();
		tf9.setText("3.3");
		panel.add(tf9);
		tf9.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		button = new Button("Sort");
		panel_1.add(button);
	}

}
