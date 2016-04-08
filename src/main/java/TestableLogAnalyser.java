
public class TestableLogAnalyser extends LogAnalyser{

	private IFileExtentionManager fem;
	
	public TestableLogAnalyser(IFileExtentionManager fem) {
		this.fem=fem;
	}
	
	public IFileExtentionManager getFileExtentionManager() {
    	return fem;
    }
}
