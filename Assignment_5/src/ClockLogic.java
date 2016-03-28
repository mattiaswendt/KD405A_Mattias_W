/**Importerar tid- och datumgrejer*/
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockLogic {
	
	private DigitalClockGUI digitalClockGUI;
	
    private int alarmHour;
    
    private int alarmMinute;
	    
	    public ClockLogic (DigitalClockGUI DigitalClockGUI){
	    	this.digitalClockGUI = DigitalClockGUI;
	    	new ClockThread().start();
	    }
	    
	    public void setAlarm(int hours, int minute){
	    	 this.alarmHour = hours;
	         this.alarmMinute = minute;
	         System.out.println("Set");
	    }
	    
	    public void clearAlarm(){     
	    	setAlarm(-1, -1);
	        digitalClockGUI.activateAlarm(false);
	         System.out.println("Clear");
	    }


public class ClockThread extends Thread {
            
	@Override
	
            public void run(){
                
            	 DecimalFormat timeFormat = new DecimalFormat("00");
                 while(true) {
                     
                     try {
                    	 Calendar cal = Calendar.getInstance();
                           
                    	 int second = cal.get(Calendar.SECOND);
                         int minute = cal.get(Calendar.MINUTE);
                         int hour = cal.get(Calendar.HOUR_OF_DAY);
                         
                         digitalClockGUI.setTimeOnLabel(timeFormat.format(hour)+":"+timeFormat.format(minute)+":"+timeFormat.format(second));
                         
                         
                         if ((hour == alarmHour && minute == alarmMinute)) {
                             digitalClockGUI.activateAlarm(true);
                         } 
                         Thread.sleep(900);
                         } catch (InterruptedException e) {
                        	 e.printStackTrace();
                        	 return;
                         } 
                     
                     
                     
                }           
            }   
        }

}

	/*public class ClockThread { Lars föreläsnings inre thread
	        
	    }
	    public ClockThread(){
	        MyThread myThread = new MyThread();//Create instance
	        myThread.start(); //startar
	        
	    }
	    
	    private class ClockThread extends Thread{
	        public void run(){
	            
	            while(true){
	                try{
	                    Thread.sleep(1000);
	                } catch (InterruptedException e){}
	                System.out.println("Awake");
	                    
	               
	        }
*/