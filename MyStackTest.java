package stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyStackTest {

	@Test
	public void test() {
		MyStack ms=new MyStack();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		assertEquals(3, ms.top());
		ms.pop();
		assertEquals(2, ms.top());
		ms.push(4);
		ms.push(5);
		ms.pop();
		assertEquals(4, ms.top());
		assertEquals(false,ms.empty());
		ms.pop();
		ms.pop();
		ms.pop();
		assertEquals(true,ms.empty());

	}

}
