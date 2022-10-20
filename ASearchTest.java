import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	ASearch as;
	/*
	 * Part 1: complete unit tests
	 */
	@Before
	public void setup(){
		as = new ASearch();
		as.addEntry(new Entry("Andrew",111));
		as.addEntry(new Entry("Ewen",321));
		as.addEntry(new Entry("Peter",123));
		as.addEntry(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		assertEquals(as.linearSearch("Andrew"),111);
		assertEquals(as.linearSearch("Ewen"),321);
		assertEquals(as.linearSearch("Peter"),123);
		assertEquals(as.linearSearch("Roger"),222);
	}

	@Test
	public void testLinearSearchFail() {
		// test the linear search method for someone who's not in the collection
		assertEquals(as.linearSearch("Ruoxuan"),-1);
	}
	
	@Test
	public void testBinarySearchOK() {
		// test the binary search method for someone who's in the collection
		assertEquals(as.binarySearch("Andrew"),111);
		assertEquals(as.binarySearch("Ewen"),321);
		assertEquals(as.binarySearch("Peter"),123);
		assertEquals(as.binarySearch("Roger"),222);
	}
	
	@Test
	public void testBinarySearchFail() {
		// test the binary search method for someone who's not in the collection
		assertEquals(as.binarySearch("Ruoxuan"),-1);
	}

}
