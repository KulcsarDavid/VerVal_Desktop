


public class LogAnalyser {

	 public static final String SUFFIX = ".str";
	 private static IFileExtentionManager fem;
	 
	 public LogAnalyser() {		//IFileExtentionManager fem2) {
		 //fem=fem2;
	 }

	 public void setFem(IFileExtentionManager fem2) {
		 fem=fem2;
	 }
	 
    public static boolean isValidLogFileName(String name){
//	        if(name != null){
//	        	if(name.length()< SUFFIX.length()) {
//	        		throw new IllegalArgumentException("Name is too short");
//	        	}
//	            return name.endsWith(SUFFIX);
//	        }
//	        return false;
    	return fem.isValid(name);
    }	
	    
	    
}
