import javax.annotation.processing.FilerException;




public class LogAnalyser {

	 private static IFileExtentionManager fem;

    public static boolean isValidLogFileName(String name){
//	        if(name != null){
//	        	if(name.length()< SUFFIX.length()) {
//	        		throw new IllegalArgumentException("Name is too short");
//	        	}
//	            return name.endsWith(SUFFIX);
//	        }
//	        return false;
    	//return fem.isValid(name);
    	return FileExtentionManagerFactory.getInstance().getFileExtMgr().isValid(name);
    }	
    
	    
	    
}
