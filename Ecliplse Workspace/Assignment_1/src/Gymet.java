import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Label;

public class Gymet extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gymet frame = new Gymet();
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
	public Gymet() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 200, 250);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"B\u00F6rjan", "111"},
				{"T\u00F6rjan ", "112"},
				{"S\u00F6rjan", "113"},
				{"G\u00F6rjan", "114"},
				{"D\u00F6rjan", "115"},
				{"M\u00F6rjan", "116"},
				{"K\u00F6rjan", "117"},
				{"P\u00F6rjan", "118"},
				{"L\u00F6rjan", "119"},
				{"F\u00F6rjan", "120"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Namn", "Medlem nr."
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(0).setMaxWidth(100);
		table.getColumnModel().getColumn(1).setMinWidth(20);
		table.getColumnModel().getColumn(1).setMaxWidth(100);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\u00D6\u00F6rjans Gym");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(248, 11, 99, 22);
		contentPane.add(lblNewLabel);
		
		Button button = new Button("Spara");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(520, 293, 70, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Gymet.class.getResource("/Images/Bill Murray 2.jpg")));
		lblNewLabel_1.setBounds(490, 65, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnBrjanrjansson = new JTextPane();
		txtpnBrjanrjansson.setText("B\u00F6rjan \u00D6rjansson");
		txtpnBrjanrjansson.setBounds(330, 65, 150, 40);
		contentPane.add(txtpnBrjanrjansson);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("11111111111");
		textPane_1.setBounds(330, 116, 150, 40);
		contentPane.add(textPane_1);
		
		JTextPane txtpnVintergatanb = new JTextPane();
		txtpnVintergatanb.setText("Vintergatan 2B");
		txtpnVintergatanb.setBounds(330, 167, 150, 40);
		contentPane.add(txtpnVintergatanb);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("555-555-555");
		textPane_3.setBounds(330, 218, 150, 40);
		contentPane.add(textPane_3);
		
		JTextPane txtpnBorjanorjanssonyahoose = new JTextPane();
		txtpnBorjanorjanssonyahoose.setText("borjan.orjansson@yahoo.se");
		txtpnBorjanorjanssonyahoose.setBounds(330, 269, 150, 40);
		contentPane.add(txtpnBorjanorjanssonyahoose);
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedlemmar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMedlemmar.setBounds(57, 32, 99, 22);
		contentPane.add(lblMedlemmar);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNamn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNamn.setBounds(220, 72, 99, 22);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonnummer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPersonnummer.setBounds(221, 126, 99, 22);
		contentPane.add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdress.setBounds(220, 177, 99, 22);
		contentPane.add(lblAdress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefonnummer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefonnummer.setBounds(220, 228, 99, 22);
		contentPane.add(lblTelefonnummer);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(221, 276, 99, 22);
		contentPane.add(lblEmail);
	}
}
