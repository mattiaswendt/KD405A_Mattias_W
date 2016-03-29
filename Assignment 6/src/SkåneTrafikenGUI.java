
//package se.mah.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;

public class SkåneTrafikenGUI extends JFrame {

	public JPanel contentPane;
	public JTextField txtSearch;
	public JTextArea txtareaResult;
	public JScrollPane scrollPane_1;
	public JTextArea txtToResult;
	public JTextField txtFrom;
	public JTextField txtToStation;
	public JButton btnSearchJourney;
	public String stationName;
	SkåneTrafikenGUI gui = this;
	Parser p = new Parser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkåneTrafikenGUI frame = new SkåneTrafikenGUI();
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
	public SkåneTrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel fromToPanel = new JPanel();
		fromToPanel.setBounds(344, 0, 351, 571);
		contentPane.add(fromToPanel);
		fromToPanel.setLayout(null);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 183, 333, 373);
		fromToPanel.add(scrollPane_1);

		txtToResult = new JTextArea();
		scrollPane_1.setViewportView(txtToResult);

		txtFrom = new JTextField();
		txtFrom.setBounds(12, 57, 146, 26);
		fromToPanel.add(txtFrom);
		txtFrom.setColumns(10);

		txtToStation = new JTextField();
		txtToStation.setBounds(12, 114, 146, 26);
		fromToPanel.add(txtToStation);
		txtToStation.setColumns(10);

		btnSearchJourney = new JButton("Search journey");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtToResult.setText("Searching");
				

				String searchURL = Constants.getURL("80000","81216",20);
				new resa().start();
			}
		});

		btnSearchJourney.setBounds(170, 113, 175, 29);
		fromToPanel.add(btnSearchJourney);

		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setBounds(12, 29, 69, 20);
		fromToPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("To:");
		lblNewLabel_1.setBounds(12, 96, 69, 20);
		fromToPanel.add(lblNewLabel_1);

		JPanel oneStationPanel = new JPanel();
		oneStationPanel.setBounds(0, 0, 349, 571);
		contentPane.add(oneStationPanel);
		oneStationPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 74, 323, 484);
		oneStationPanel.add(scrollPane);

		txtareaResult = new JTextArea();
		scrollPane.setViewportView(txtareaResult);

		txtSearch = new JTextField();
		txtSearch.setBounds(15, 35, 190, 26);
		oneStationPanel.add(txtSearch);
		txtSearch.setColumns(10);

		JButton btnSearchStation = new JButton("Search");
		btnSearchStation.setBounds(223, 34, 115, 29);
		oneStationPanel.add(btnSearchStation);

		JLabel lblDeparturesFromStation = new JLabel("Departures from station");
		lblDeparturesFromStation.setBounds(15, 6, 190, 26);
		oneStationPanel.add(lblDeparturesFromStation);
		btnSearchStation.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				txtareaResult.setText("Searching");
			

				new j().start();

			}
		});

	}

	private class j extends Thread {
		@Override
		public void run() {
			String info = txtSearch.getText();
			String from = txtFrom.getText();
			String to = txtToStation.getText();
			String searchURL = Constants.getURL(from, to, 20);
			ArrayList<Station> searchStations = new ArrayList<Station>();
			searchStations.addAll(Parser.getStationsFromURL(stationName));
			txtareaResult.setText("");
			for (Station s : searchStations) {
				/**
				 * System.out.println(s.getStationName() +" number:"
				 * +s.getStationNbr());
				 */

					txtareaResult.append(s.getStationNbr() + " " + s.getStationName() + " " + s.getLatitude() + " "
							+ s.getLongitude() + "\n");

				

			}

		}
	}
	
	private class resa extends Thread {
		@Override
		public void run() {
			String from = txtFrom.getText();
			String to = txtToStation.getText();
			String searchURL = Constants.getURL(from, to, 10);
			Journeys journeys = Parser.getJourneys(searchURL);
			
			txtToResult.setText("");


			for (Journey journey : journeys.getJourneys()) {
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
				txtToResult.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late" + "\n");
			} 
			

		}
	}
}