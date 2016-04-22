
public class DefaultWebService implements WebService{

	private String lastError;
	
	@Override
	public void logError(String lastError)
	{
		this.lastError=lastError;
	}


	@Override
	public String getLastError() {
		return lastError;
	}
}
