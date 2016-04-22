import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

//@RunWith(Parameterized.class)
public class LogAnalyserTest {

	private LogAnalyser logAnalyser;
	//private LogAnalyser testableLogAnalyser;
	private IFileExtentionManager fem;
	private WebService webService;
	
	
//	@Parameterized.Parameters 
//	public static Collection<Object[]> data() {
//	return Arrays.asList(new Object[][] {
//			{"abc.str", true}, {"abc.str1", false},  {"abc.str2", false}
//	});
//	
//	}		
//	@Parameterized.Parameter
//	public String fInput;
//	
//	@Parameterized.Parameter(value = 1)
//	public boolean fExpected; 
//	
	
	
	@Before
	public void setUp() throws Exception {
		fem= new FakeFileExtentionManager();
		fem.setWillReturn(true);
		logAnalyser = new LogAnalyser();
		//testableLogAnalyser = new TestableLogAnalyser(fem);
		//FileExtentionManagerFactory.getInstance().setFileExtMgr(fem);
		webService= new DefaultWebService();	
		logAnalyser.setWebService(webService);
	}
	
	@After
	public void tearDown() throws Exception {
		// nothing to do
	}
	
//	@Test(expected= IllegalArgumentException.class)
//	public void isValidLogFileNameToShortExceptionThrown() throws Exception{
//		String validLogFileName ="something.str";
//		String inValidLogFileName ="something.strr";
//		
//		logAnalyser.isValidLogFileName("");
//	}
	
//	@Test
//	public void isValidLogFileNameTestable_Valid_ReturnsTrue() throws Exception{
//		
//		fem.setWillReturn(true);
//		assertEquals("should be valid", testableLogAnalyser.isValidLogFileName(""), true);
//	}
//	
//	@Test
//	public void isValidLogFileNameTestable_NotValid_ReturnsFalse() throws Exception{
//		
//		fem.setWillReturn(false);
//		assertEquals("should be invalid", testableLogAnalyser.isValidLogFileName(""), false);
//	}
	
//	@Test
//	public void isValidLogFileNameReturnsTrue() throws Exception{
//		assertEquals(fExpected,logAnalyser.isValidLogFileName(fInput));
//	}
	
	 @Test
	    public void isValiedLogFileName_FileNameTooShort_CallsWebService() {
	        logAnalyser.isValidLogFileName("12");
	        assertEquals("should be too short", webService.getLastError(), "12 too short");
	    }

	    @Test
	    public void isValiedLogFileNameMock_FileNameTooShort_CallsWebService() {
	        WebService mockedWebService = Mockito.mock(WebService.class);
	        logAnalyser.setWebService(mockedWebService);
	        logAnalyser.isValidLogFileName("12");
	        Mockito.verify(mockedWebService, Mockito.times(2)).logError("12 too short");

	    }
}
