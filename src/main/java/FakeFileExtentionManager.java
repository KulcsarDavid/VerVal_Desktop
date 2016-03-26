
public class FakeFileExtentionManager implements IFileExtentionManager{

	private boolean willReturn;
	
	public void setWillReturn(boolean v) {
		willReturn=v;
	}
	
	@Override
	public boolean isValid(String s) {
		return willReturn;
	}

	
}
