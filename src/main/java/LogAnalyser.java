
public class LogAnalyser {


    public boolean isValidLogFileName(String name){
//	        if(name != null){
//	        	if(name.length()< SUFFIX.length()) {
//	        		throw new IllegalArgumentException("Name is too short");
//	        	}
//	            return name.endsWith(SUFFIX);
//	        }
//	        return false;
    	//return fem.isValid(name);
    	return getFileExtentionManager().isValid(name);
    }	
    
    public IFileExtentionManager getFileExtentionManager() {
		return null;

    }
	    
	    
}
