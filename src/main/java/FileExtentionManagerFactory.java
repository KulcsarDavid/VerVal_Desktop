
public class FileExtentionManagerFactory {

	private static FileExtentionManagerFactory INSTANCE;
	 	private IFileExtentionManager fileMgr;
	 	
	 	private FileExtentionManagerFactory() {}
	 	
	 	public static FileExtentionManagerFactory getInstance() {
	 		if(INSTANCE == null) 
	 			INSTANCE= new FileExtentionManagerFactory();
	 		return INSTANCE;
	 	}
	 	
	 	public IFileExtentionManager getFileExtMgr() {
	 		if (fileMgr != null)
	 			return fileMgr;
	 		else
	 			return new FakeFileExtentionManager();
	 	}
	 	
	 	public void setFileExtMgr(IFileExtentionManager fileMgr) {
	 		this.fileMgr = fileMgr;
	 	}
}
