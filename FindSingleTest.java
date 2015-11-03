package singlenumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSingleTest {

	@Test
	public void test() throws NumberException {
		FindSingle fst=new FindSingle();
		int numsTest []=new int[]{0,0,1};
		int actual=fst.singleNumber(numsTest);
		int expected=1;
		assertEquals(expected, actual);
		
		int numsTest1 []=new int[]{0,1,1};
		int actual1=fst.singleNumber(numsTest1);
		int expected1=0;
		assertEquals(expected1, actual1);
		
		
		int numsTest2 []=new int[]{0,0,1,1,1,2,2};
		int actual2=fst.singleNumber(numsTest2);
		int expected2=1;
		assertEquals(expected2, actual2);
		
		int numsTestE1 []=new int[]{0,0,1,1};
		try{fst.singleNumber(numsTestE1);
		}catch(NumberException ne){
			System.out.println(ne.getMessage());
		}
		
		int numsTestE2 []=new int[]{0,0,2,3,5,1,1};
		try{fst.singleNumber(numsTestE2);
		}catch(NumberException ne){
			System.out.println(ne.getMessage());
		}
	}

}
