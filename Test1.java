import java.util.*;

class Fan{
	final int SLOW=1, MEDIUM=2, FAST=3;
	int speed;
	boolean on;
	double radius;
	String color;
	Fan(){
		speed=1;
		on=false;
		radius=5;
		color="blue";
		
	}
	void get(int speed, boolean on, double radius, String color){
		this.speed=speed;
		this.on=on;
		this.radius=radius;
		this.color=color;
	}
	String tostring(){
		if(on==true){
return("Fan is on\nFan Speed: " + speed + "\ncolor: " + color + "\nradius: \n" + radius);
		}
		else{
			return("Fan is off!!\nFan color: " + color + "\nradius: \n" + radius );
		}
	}
}
class Test1{
	public static void main(String arg[]){
		Fan obj=new Fan();
		System.out.println(obj.tostring());
		Fan obj1=new Fan();
		obj1.get(40,true,95.5,"white");
		System.out.println(obj1.tostring());
		//System.out.println(obj1);
	}
}
