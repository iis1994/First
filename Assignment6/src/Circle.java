public class Circle {
	
		double radius;
		final double PI=3.14159;
		
public double getRadius(){
	return radius;
	}
public double getArea(){
	double area;
	return area = PI*radius * radius;
}
public double getDiameter(){
	double diameter;
	return diameter = radius * 2;
}
public double getCircumference(){
	double circumference;
	return circumference = 2 * PI * radius;
}
}
