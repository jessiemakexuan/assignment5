package person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person p=new Person();
		p.setfirstName("kx");
		p.setlastName("ma");
		System.out.println("p:"+p.getfirstName()+" "+p.getlastName());
		Person p1=new Person("jessie","ma");
		System.out.println("p1:"+p1.getfirstName()+" "+p1.getlastName());
		System.out.println(p);
		System.out.println(p1);
		Person p2=p;
		assertEquals(p.compareTo(p2),0);
		assertEquals(p.compareTo(p1),1);
		assertTrue(p.equals(p2));
		assertFalse(p.equals(p1));
		Person p3=new Person("ma","kx");
		assertFalse(p.equals(p3));
	}

}
