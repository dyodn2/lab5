import org.junit.experimental.categories.Categories;

public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	public int linearSearch(String name){
		for(int i=0;i<current;i++) {
			if(catalogue[i].getName().equals(name))
				return catalogue[i].getNumber();
		}
		return -1;
	}

	/*
	 * Part 4: complete implementation
	 */
	private int binarySearch(int first,int last,String name){
		int up = last;
		int lo = first;
		int mid;
		for(int i=0;i<(Math.log(last)/Math.log(2));i++) {
			mid = (up + lo)/2;
			if(catalogue[mid].getName().equals(name)) {
				return catalogue[mid].getNumber();
			
			}else if(name.compareTo(catalogue[mid].getName())>0){
				lo = mid;
			}else{
				up = mid;
			}
			System.out.println("lo: "+lo);
			System.out.println("up: "+up);
			System.out.println("mid: "+mid);
			
		}
		if(catalogue[last].getName().equals(name))
			return catalogue[last].getNumber();
		return -1;
	}

	// helper method exposed to the programmer
	public int binarySearch(String name){
		return binarySearch(0,current-1,name);
	}
	
	
}
