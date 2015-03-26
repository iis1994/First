import java.lang.Math;
public class TheDistance {

	static double x1;
	static double x2;
	static double y1;
	static double y2;
	double totalDistance;
	double xCalculated;
	double yCalculated;
	double xSquared;
	double ySquared;
	double xANDy;
	
	public TheDistance(double x1, double x2, double y1, double y2){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		}
	public double getTotalDistance(double x1,double x2,double y1,double y2){
		xCalculated = x2-x1;
		yCalculated = y2-y1;
		xSquared = Math.pow(xCalculated, 2.0);
		ySquared = Math.pow(yCalculated, 2.0);
		xANDy = xSquared+ySquared;
		
		return totalDistance=Math.sqrt(xANDy);
	}
}
