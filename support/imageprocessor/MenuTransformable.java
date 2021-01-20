package support.imageprocessor;

import support.modifiedsedgewick.SerializablePicture;

public interface MenuTransformable {
	
	public String getMenuName();
	public void transform(SerializablePicture source1, SerializablePicture source2, SerializablePicture target);

}
