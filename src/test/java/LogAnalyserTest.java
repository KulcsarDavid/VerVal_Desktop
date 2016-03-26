import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)
public class LogAnalyserTest {

	private LogAnalyser logAnalyser;
	
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
	public void isValidLogFileNameReturnsTrue() throws Exception{
		IFileExtentionManager fem= new FakeFileExtentionManager();
		fem.setWillReturn(true);
		//logAnalyser = new LogAnalyser(fem);
		logAnalyser = new LogAnalyser();
		logAnalyser.setFem(fem);
		assertTrue("this should be true" , logAnalyser.isValidLogFileName("fds"));
	}
	
//	@Test
//	public void isValidLogFileNameReturnsTrue() throws Exception{
//		assertEquals(fExpected,logAnalyser.isValidLogFileName(fInput));
//	}
}
