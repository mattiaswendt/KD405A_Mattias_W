import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice;
	private JTextField txtSize;
	private JTextField txtColor;
	
	Store Store = new Store();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 67, 161, 147);
		contentPane.add(scrollPane);
		
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		//textArea.setText(TestBike.Blist());
		
		JButton btnNouveuCykel = new JButton("Nouveu Cykel");
		btnNouveuCykel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Store.addBike(txtColor.getText(), Integer.parseInt(txtSize.getText()),Integer.parseInt(txtPrice.getText()));
				textArea.setText(Store.getBike());
				txtColor.setText("");
				txtSize.setText("");
				txtPrice.setText("");
			
			}
		});
		btnNouveuCykel.setBounds(135, 122, 111, 23);
		contentPane.add(btnNouveuCykel);
		
		txtPrice = new JTextField();
		txtPrice.setText("Price");
		txtPrice.setBounds(20, 55, 86, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setText("Size");
		txtSize.setColumns(10);
		txtSize.setBounds(20, 123, 86, 20);
		contentPane.add(txtSize);
		
		txtColor = new JTextField();
		txtColor.setText("Color");
		txtColor.setColumns(10);
		txtColor.setBounds(20, 200, 86, 20);
		contentPane.add(txtColor);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(20, 30, 46, 14);
		contentPane.add(lblPrice);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(20, 98, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(20, 175, 46, 14);
		contentPane.add(lblColor);
	}
}
