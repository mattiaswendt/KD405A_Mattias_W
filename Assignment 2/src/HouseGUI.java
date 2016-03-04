import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	
	private House [] myHouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		

		
		JScrollBar scrollBar = new JScrollBar();
		contentPane.add(scrollBar, BorderLayout.EAST);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		House house1 = new House(1850, 100);
		House house2 = new House(1900, 200);
		House house3 = new House(1950, 300);
		
		
		
		int HouseyearBuilt = house1.getYearBuilt();
		int houseSize = house1.getSize();
		int HouseyearBuilt2 = house2.getYearBuilt();
		int houseSize2 = house2.getSize();
		int HouseyearBuilt3 = house3.getYearBuilt();
		int houseSize3 = house3.getSize();
		
		 System.out.println (houseSize + " " + HouseyearBuilt);
		 System.out.println (houseSize2 + " " + HouseyearBuilt2);
		 System.out.println (houseSize3 + " " + HouseyearBuilt3);
		
		 textArea.append("Det första huset är byggt år " + HouseyearBuilt + " och är " + houseSize + " kvm stort \n" );
		 textArea.append("Det andra huset är byggt år " + HouseyearBuilt2 + " och är " + houseSize2 + " kvm stort \n" );
		 textArea.append("Det tredje huset är byggt år " + HouseyearBuilt3 + " och är " + houseSize3 + " kvm stort \n" );
		
		
		
		 myHouse = new House[10];
			
			myHouse[0] = new House(100, 1810);
			myHouse[1] = new House(200, 1820);  
	    	myHouse[2] = new House(300, 1830);
	    	myHouse[3] = new House(400, 1840);
	    	myHouse[4] = new House(500, 1850);
	    	myHouse[5] = new House(600, 1860);
	    	myHouse[6] = new House(700, 1870);
	    	myHouse[7] = new House(800, 1880);
	    	myHouse[8] = new House(900, 1890);
	    	myHouse[9] = new House(1000, 1900);
	    	
	    	for(int i = 0; i < 10; i = i+1){
	    	}
	    	
	    	
	    	
	    	for (int i = 0; i < myHouse.length; i = i+1){
	    		textArea.append("Ett hus byggt år" + " " + myHouse[i].getYearBuilt() + " " + "som är" + " " + myHouse[i].getSize() + " " + "kvm" + " " + "stort. \n");
	    	}
	    	
	    	ArrayList<House> HouseCity = new ArrayList<House>();
	    	
	    	Random rand = new Random ();
			
			for(int i = 0; i < 100; i++){
				int size = rand.nextInt(990) + 10;
				int yearBuilt = rand.nextInt(215) + 1800;
				
				HouseCity.add(new House(yearBuilt,size));
			}
			for (House Hus:HouseCity){
				textArea.append("House is built " + Hus.getYearBuilt() + " and is " + Hus.getSize() + " m2 big" + "\n");
			}
	}}