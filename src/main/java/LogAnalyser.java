
public class LogAnalyser {

	 public static final String SUFFIX = ".str";

	    public static boolean isValidLogFileName(String name){
	        if(name != null){
	            return name.endsWith(SUFFIX);
	        }
	        return false;
	    }
}
