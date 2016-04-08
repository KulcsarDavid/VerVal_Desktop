import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//@RunWith(Parameterized.class)
public class LogAnalyserTest {

	//private LogAnalyser logAnalyser;
	private LogAnalyser testableLogAnalyser;
	private IFileExtentionManager fem;
	
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
		//logAnalyser = new LogAnalyser();
		testableLogAnalyser = new TestableLogAnalyser(fem);
		//FileExtentionManagerFactory.getInstance().setFileExtMgr(fem);
			
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
	
	@Test
	public void isValidLogFileNameTestable_Valid_ReturnsTrue() throws Exception{
		
		fem.setWillReturn(true);
		assertEquals("should be valid", testableLogAnalyser.isValidLogFileName(""), true);
	}
	
	@Test
	public void isValidLogFileNameTestable_NotValid_ReturnsFalse() throws Exception{
		
		fem.setWillReturn(false);
		assertEquals("should be invalid", testableLogAnalyser.isValidLogFileName(""), false);
	}
	
//	@Test
//	public void isValidLogFileNameReturnsTrue() throws Exception{
//		assertEquals(fExpected,logAnalyser.isValidLogFileName(fInput));
//	}
}
