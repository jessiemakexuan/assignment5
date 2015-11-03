package pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatchPatternTest {

	@Test
	public void test() throws MatchException {
		MatchPattern mTest=new MatchPattern();
		String pattern = "abaa"; 
		String str = "dog cat dog dog"; 
		assertTrue(mTest.wordPattern(pattern, str));
		String pattern1 = "abaa"; 
		String str1 = "dog cat cat dog"; 
		assertFalse(mTest.wordPattern(pattern1, str1));
		String pattern2 = "abaa"; 
		String str2 = "dog";
		try{
			mTest.wordPattern(pattern2, str2);
		}catch(MatchException me){
			System.out.println(me.getMessage());
		}
	}

}
