package support.imageprocessor;

import support.modifiedsedgewick.SerializablePicture;

public interface PictureFilter {
	
	public void filter(SerializablePicture[] inout);

}
