
public class Bike {

	private String color;
	
	private int price;
	
	private int size;
	
	/*konstruktorn*/
	public Bike (String color, int size){
		this.color = color;
		this.size = size;
			
		boolean trueColor = false;
		for(int i=0; i<Constants.STANDARD_COLOR.length; i++){
			if(Constants.STANDARD_COLOR[i].equals(color)){
				trueColor = true;
			}
			}
		if(trueColor ==true){
			this.color = color;
		}else{
			this.color="think again cowboy";
		}
	}
	public Bike (String color, int price, int size){
		this.color = color;
		this.size = size;
		this.price = price;
		
		
	}
	
	public String getColor(){
		return this.color;
	}
	public int getPrice(){
		return this.price;
	}
	public int getSize(){
		return this.size;
	}
	public void setPrice(){
		
	}
}
