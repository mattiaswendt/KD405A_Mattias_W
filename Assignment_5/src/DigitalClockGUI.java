import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	
	private ClockLogic clockLogic;
	
	 private JLabel lblClock;
	    private JLabel lblAlarm;
	    private JLabel lblHours;
	    private JLabel lblMinutes;
	    DecimalFormat timeFormat = new DecimalFormat("00");
	    private JLabel lblAlarmmessage;
	 private JTextField hourTextField;
	 private JTextField minuteTextField;
	 private JLabel lblAlarmMessage;
	 private JButton btnClearAlarm;
     
	    public void DigitalClockGUI(){
	    }
	    public void setTimeOnLabel(String time){ 
	        lblClock.setText(time);
	        
	    }
	    
	    public void setAlarmOnLabel(String alarmTime){
	        lblAlarm.setText(alarmTime);
	    }
	    
	    public void activateAlarm(boolean activate){   
	        if(activate)
	        {
	            lblAlarmMessage.setText(" A man has many faces");
	        }else{
	            lblAlarmMessage.setText(" ");
	        }
	    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		
		setTitle("Digital Alarm Clock");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblClock = new JLabel("Clock");
		 lblClock.setHorizontalAlignment(SwingConstants.CENTER);
		 lblClock.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblClock.setBounds(90, 11, 250, 50);
		contentPane.add(lblClock);
		
		hourTextField = new JTextField();
		hourTextField.setBounds(53, 210, 86, 20);
		contentPane.add(hourTextField);
		hourTextField.setColumns(10);
		
		minuteTextField = new JTextField();
		minuteTextField.setColumns(10);
		minuteTextField.setBounds(174, 210, 86, 20);
		contentPane.add(minuteTextField);
		
		JLabel lblNewLabel = new JLabel("Hour");
		lblNewLabel.setBounds(21, 213, 29, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(149, 213, 29, 14);
		contentPane.add(lblMin);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String hourString = hourTextField.getText();
	                int hour = Integer.parseInt(hourString);
	                String minuteString = minuteTextField.getText();
	                int minute = Integer.parseInt(minuteString);
	                clockLogic.setAlarm(hour, minute);
	                
	                lblAlarm.setText("Alarm at: " + hourTextField.getText() + " : " + minuteTextField.getText());
			}
		});
		btnSetAlarm.setBounds(314, 209, 99, 23);
		contentPane.add(btnSetAlarm);
		
		lblAlarm = new JLabel("");
		lblAlarm.setForeground(Color.BLACK);
		lblAlarm.setBackground(Color.WHITE);
		lblAlarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarm.setBounds(160, 72, 110, 23);
		contentPane.add(lblAlarm);
		
		lblAlarmMessage = new JLabel("");
		lblAlarmMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmMessage.setBounds(90, 106, 250, 39);
		contentPane.add(lblAlarmMessage);
		
		btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clockLogic.clearAlarm();
                lblAlarm.setText("Alarm at: ");
			}
		});
		btnClearAlarm.setBounds(160, 156, 110, 23);
		contentPane.add(btnClearAlarm);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mattias Wendt\\Downloads\\GoT.png"));
		lblNewLabel_1.setBounds(341, 21, 246, 180);
		contentPane.add(lblNewLabel_1);
		
		clockLogic = new ClockLogic(this);
	}
 }

