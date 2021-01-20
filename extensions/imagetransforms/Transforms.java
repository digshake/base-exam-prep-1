package imagetransforms;

import java.awt.Color;

import edu.princeton.cs.introcs.Picture;
import support.modifiedsedgewick.SerializablePicture;


public class Transforms {
	
	/**
	 * This one is solved for you.
	 * @param source
	 * @param target
	 */
	public static void flipHoriz(SerializablePicture source, SerializablePicture target) { 
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				//
				// Convince yourself that otherX is the x coordinate flipped,
				//     on the other side of the image by doing the following:
				// Check that this is true when x == 0
				//      then otherX = source.width() - 1
				//      which is indeed the rightmost pixel
				// Check that this is true when x == source.width()-1
				//      then otherX = 0
				//      which is indeed the leftmost pixel
				//
				int otherX = source.width() - 1 - x;  // otherX is the mirror of x
				Color c = source.get(otherX, y);      // get the Color at the mirror point of the source
				target.set(x, y, c);                  // and set it at x,y in the target
			}
		}
	}
	
	public static void flipVert(SerializablePicture source, SerializablePicture target) {
		// FIXME
	}
	
	
	public static void flipHorizLeftHalf(SerializablePicture source, SerializablePicture target) {
		// FIXME
	}
	
	public static void flipVertBotHalf(SerializablePicture source, SerializablePicture target) {
		// FIXME
	}
	
	public static void gradient(SerializablePicture target) {
		// FIXME
				
	}
	
	public static void edgeDetect(SerializablePicture source, SerializablePicture target) {
		// FIXME
	}
	
	public static void digitalFilter(SerializablePicture source, SerializablePicture target) {
		// FIXME	
	}



}
