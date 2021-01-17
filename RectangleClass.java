//Authors: Modester Mwangi, Samwel Maisiba
//Usernames: Modester-mw, Sammyiel

package part2;

public class RectangleClass {
	
	/*
	 * This class includes calcuation for perimeter
	 *  and surface area for declared integers
	 *  of a rectangle.
	 */

	public static void main (String [] args ) {
		
		int width = 24;
		int length = 30;
		int perimeter = 2 * (width + length);
		int area = width * length;
		System.out.println("perimeter = " + perimeter );
		System.out.println("area = " + area );
	}
}
