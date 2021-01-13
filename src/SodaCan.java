
public class SodaCan{
	public double getSurfaceArea(double radius, double height) {
		double sa=2 * Math.PI * radius * (height + radius);
	     return sa;
	};
	public double getVolume(double radius, double height) {
		double volume=(Math.PI * height * radius * radius);
		return volume;
	};
}
