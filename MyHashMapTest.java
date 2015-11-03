package myHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void test() throws InputException{
		MyHashMap<String,Integer> myhash = new MyHashMap<String,Integer>();
		myhash.set("ma",23);
		assertEquals(myhash.size(),1);
		assertTrue(myhash.get("ma")==23);
		assertTrue(myhash.containKey("ma"));
		assertTrue(myhash.containValue(23));
		assertFalse(myhash.isEmpty());
		
		myhash.set("liu", 22);
		myhash.set("zhang", 25);
		assertEquals(myhash.size(),3);
		assertTrue(myhash.containKey("liu"));
		
		myhash.set("ma", 22);
		assertEquals(myhash.size(),3);
		assertTrue(myhash.get("ma")==22);
		
		MyHashMap<Integer,Integer> myhash1 = new MyHashMap<Integer,Integer>();
		myhash1.set(1,22);
		myhash1.set(2,23);
		assertEquals(myhash1.size(),2);
		assertTrue(myhash1.containKey(1));
		
	}
		

}
