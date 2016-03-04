import java.util.ArrayList;

public class TestBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Bike> Blist = new ArrayList<Bike>();{
			
		 Bike num0 = new Bike("Röd", 10000, 10);
		 Bike num1 = new Bike("Blå", 11000, 11);
		 Bike num2 = new Bike("Grön", 12000, 12);
		 Bike num3 = new Bike("Gul", 13000, 13);
		 Bike num4 = new Bike("Svart", 14000, 14);
		 Bike num5 = new Bike("Vit", 15000, 15);
		 Bike num6 = new Bike("Grå", 16000, 16);
		 Bike num7 = new Bike("Beige", 17000, 17);
		 Bike num8 = new Bike("Lila", 18000, 18);
		 Bike num9 = new Bike("Orange", 19000, 19);
		 
		 Blist.add(num0);
		 Blist.add(num1);
		 Blist.add(num2);
		 Blist.add(num3);
		 Blist.add(num4);
		 Blist.add(num5);
		 Blist.add(num6);
		 Blist.add(num7);
		 Blist.add(num8);
		 Blist.add(num9);
			
			
	    	}
			for (Bike b:Blist){
				System.out.println("Cykeln har färgen" + " " + b.getColor() + " " + ", kostar" + " " + b.getPrice() + " och har " + b.getSize() + " storlek. \n");
	    	}
	}

}
