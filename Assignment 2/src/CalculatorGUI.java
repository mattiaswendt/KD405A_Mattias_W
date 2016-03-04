import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		JButton button = new JButton("+");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		button.setBounds(128, 126, 149, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				myCalculator.minus();
			}
		});
		button_1.setBounds(128, 179, 149, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("*");
				myCalculator.mult();
			}
		});
		button_2.setBounds(128, 237, 149, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_3.setBounds(12, 126, 97, 63);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("10");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("10");
				myCalculator.numberButtonPressed(10);
			}
		});
		button_4.setBounds(12, 211, 97, 63);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("=");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(12, 287, 265, 53);
		contentPane.add(button_5);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setEditable(false);
		textField.setBounds(12, 13, 265, 100);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}