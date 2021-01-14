/**
 * This class stores the methods we need to calculate surface are and volume of a can.
 * @author C2 Class Group 5
 * @version 1.0
 */

public class SodaCan{
	/**
	 * This method calculates the surface area of a can.
	 * @param radius Radius of the can in mm.
	 * @param height Height of the can in mm.
	 * @return Returns surface area as a double.
	 */
	public double getSurfaceArea(double radius, double height) {
		double sa=2 * Math.PI * radius * (height + radius);
	     return sa;
	};
	/**
	 * This method calculates the volume area of a can.
	 * @param radius Radius of the can in mm.
	 * @param height Height of the can in mm.
	 * @return Returns volume area as a double.
	 */
	public double getVolume(double radius, double height) {
		double volume=(Math.PI * height * radius * radius);
		return volume;
	};
}
