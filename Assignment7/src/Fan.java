public class Fan {
	int speed;
	boolean fanStatus;
	double radius;
	String color;
	
	public Fan(){
		speed = 1;
		fanStatus=false;
		radius=5;
		color="blue";
	}
	public Fan(int speed, boolean fanStatus, double radius, String color){
		this.speed=speed;
		this.fanStatus=fanStatus;
		this.radius=radius;
		this.color=color;
	}
	public int getSpeed(){
		return speed;
	}
	public int setSpeed(){
		return speed;
	}
	public boolean setFanStatus(){
		return fanStatus;
	}
	public double setRadius(){
		return radius;
	}
	public String setColor(){
		return color;
	}
	public String toString() {
	    String userInput = null;
	    if (fanStatus = true) {
	        userInput = "The speed of the fan is " + speed
	                + ", the color of the the fan is " + color
	                + ", and the radius of the fan is " + radius + " the fan status is on";
	    } else {
	        userInput = "The fan is off but the color is " + color
	                + " , the radius is " + radius + " and the fan status is off";
	    }
		return userInput;
 
	}
}