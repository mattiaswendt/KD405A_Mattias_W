import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDog extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	private JTextField dogField;
	
    Human human1;


    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDog frame = new HumanDog();
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
	public HumanDog() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		humanField = new JTextField();
		humanField.setBounds(19, 29, 130, 26);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		
		dogField = new JTextField();
		dogField.setColumns(10);
		dogField.setBounds(19, 67, 130, 26);
		contentPane.add(dogField);
		
		JTextArea infoArea = new JTextArea();
		infoArea.setBounds(19, 168, 412, 42);
		contentPane.add(infoArea);
		
		JTextArea errorArea = new JTextArea();
		errorArea.setBounds(19, 222, 412, 50);
		contentPane.add(errorArea);
		
		JButton humanButton = new JButton("Add Human");
		humanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//* if the characters in the humanField is shorter than 2, error, else, gets the text input from the textfield*/
				if(humanField.getText().length() > 2){
				human1 = new Human(humanField.getText());
				errorArea.setText("");
				}
				else{
					errorArea.setText("namnet måste innehålla mer än 2 bokstäver");
					infoArea.setText("");
					
				}
				
				
			}
		});
		humanButton.setBounds(177, 29, 117, 29);
		contentPane.add(humanButton);
		
		JButton dogButton = new JButton("Add Dog");
		dogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//*gets the name printed in the dog field of the GUI*/
				human1.buyDog(new Dog(dogField.getText()));
				errorArea.setText("");
				
				
					infoArea.setText("");
				
			}
		});
		dogButton.setBounds(177, 67, 117, 29);
		contentPane.add(dogButton);
		

		//*gets the info from the getInfo method in the class Human*/
		JButton infoButton = new JButton("Get info");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				infoArea.setText(human1.getInfo());
			
				humanField.setText("");
				dogField.setText("");
				errorArea.setText("");
				
			}
		});
		infoButton.setBounds(177, 116, 117, 29);
		contentPane.add(infoButton);
		
		
	
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(19, 137, 61, 16);
		contentPane.add(lblInfo);
	}
	
}