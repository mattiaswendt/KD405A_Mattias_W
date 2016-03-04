
public class Human {


private Dog dog;

private String name;


public Human (String name){
	this.name = name;
}

public String getName(){
	return this.name;
}

public void buyDog(Dog dog){
	this.dog = dog;
}
public  String getInfo(){
	
	
	String info;
	
	if(dog == null){
		info = getName() + " add a dog ";
	}
	else{
	info = getName() + " owns a dog called " + dog.getName() + "\n";
	}
	return info;
	
	
}
}

