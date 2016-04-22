
public class LogAnalyser {

	WebService service;

    public boolean isValidLogFileName(String name){
//	        if(name != null){
//	        	if(name.length()< SUFFIX.length()) {
//	        		throw new IllegalArgumentException("Name is too short");
//	        	}
//	            return name.endsWith(SUFFIX);
//	        }
//	        return false;
    	//return fem.isValid(name);
    	//return getFileExtentionManager().isValid(name);
    	service = new DefaultWebService();
    	if(service != null && name.length() < "str".length())
    		service.logError("Too short");
    	return getFileExtentionManager().isValid(name);
    }
    
    public void setWebService(WebService webservice) {
    	this.service= webservice;
    }
    
    public IFileExtentionManager getFileExtentionManager() {
		return null;

    }
	    
	    
}
