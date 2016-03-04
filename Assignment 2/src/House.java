public class House{

 private int yearBuilt;
 private final int minyearBuilt = 1800;
 private final int maxyearBuilt = 2015;
 private int size;
 private final int minSize = 10;
 private final int maxSize = 1000;
  //intvariabel
 public House(int yearBuilt,int size){
  //konstruktor
	 this.yearBuilt = yearBuilt;
		this.size = size;
 }
 public int getYearBuilt(){
  //intmethod
	 return this.yearBuilt;
 }
 public int getSize(){
	 return this.size;
 }
}
