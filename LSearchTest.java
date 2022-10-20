import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LSearchTest {

	LSearch ls;
	/*
	 * Part 1: complete unit tests
	 */
	
	@Before
	public void setup(){
		ls = new LSearch();
		// doesn't have to be ordered!
		ls.addAtHead(new Entry("Andrew",111));
		ls.addAtHead(new Entry("Ewen",321));
		ls.addAtHead(new Entry("Peter",123));
		ls.addAtHead(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		// test the linear search method for someone who's in the collection
		assertEquals(ls.linearSearch("Andrew"),111);
		assertEquals(ls.linearSearch("Ewen"),321);
		assertEquals(ls.linearSearch("Peter"),123);
		assertEquals(ls.linearSearch("Roger"),222);
	}

	@Test
	public void testLinearSearchFail() {
		assertEquals(ls.linearSearch("Liu Ruoxuan"),-1);
		
	}

}
