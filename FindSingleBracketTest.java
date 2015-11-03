package brackets;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FindSingleBracketTest {

	@Test
	public void test() throws OtherCharException {
		FindSingleBracket testB=new FindSingleBracket();
		String s="()[]{}";
		assertTrue(testB.isValid(s));
		String s1="([]{}";
		assertFalse(testB.isValid(s1));
		String s2="0{}[]";
		try{
			testB.isValid(s2);
		}catch(OtherCharException oce){
			System.out.println(oce.getMessage());
		}
		String s3="";
		try{
			testB.isValid(s3);
		}catch(OtherCharException oce){
			System.out.println(oce.getMessage());
		}
	}

}
