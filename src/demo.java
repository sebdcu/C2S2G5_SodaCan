import java.text.DecimalFormat;

// https://www.webpackaging.com/en/portals/ballcorporation/assets/11059495/standard-cans/
// Size  Name     r         H
// 250ml Standard 33.15mm x 92mm 
// 330ml Standard 33.15mm x 115.2mm
// 440ml Standard 33.10mm x 149.9mm
// 500ml Standard 33.10mm x 168mm

public class demo {

	public static void main(String[] args) {
		double[][] cans;
		double totalVolume = 0;
		double totalSurfaceArea = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		cans = new double[4][2];
		cans[0][0] = 33.15;		cans[0][1] = 92;
		cans[1][0] = 33.15;		cans[1][1] = 115.2;
		cans[2][0] = 33.10;		cans[2][1] = 149.9;
		cans[3][0] = 33.10;		cans[3][1] = 168;
		SodaCan isoCan = new SodaCan();
		System.out.println("# Adverage Volume of array of cans");
		for (int row = 0; row < cans.length; row++) {
				totalVolume =+  isoCan.getVolume(cans[row][0],cans[row][1]);
				totalSurfaceArea =+ isoCan.getSurfaceArea(cans[row][0],cans[row][1]);
				}
		System.out.println("\tTotal volume of all " + cans.length + " cans is " +  df.format(totalVolume) + "mm\u00b3");
		System.out.println("\tTotal surface area of all " + cans.length + " cans is " +  df.format(totalSurfaceArea) + "mm\u00b2");
		System.out.println("\tAdverage surface area of all " + cans.length + " cans is " +  df.format(totalSurfaceArea/cans.length) + "mm\u00b2");
	
		System.out.println("\n# Single Can ");
		double surfaceArea = isoCan.getSurfaceArea(cans[0][0],cans[0][1]);
		double volume = isoCan.getVolume(cans[0][0],cans[0][1]);
		System.out.println("\tSurface Area of Can : " + df.format(surfaceArea) + " mm\u00b2");
		System.out.println("\tVolume of can : " + df.format(volume) + " mm\u00b3");
		System.out.println("\tVolume of can : " + df.format(volume) + " mm\u05c3");
		
	}

}