
public class Program05 {

	
public class Program05 {

	private double[] array;
	private int size;
	private int nextIndex;

	public DynArray(){
		// constructor
	// set array to a new array of double, of size one
	size =  1;// set size to one,
	nextIndex = 0;// and set nextIndex to zero.
	}
	public int arraySize(){ // accessor
		return size;// return the value of size.
	}
	public int elements(){ // accessor
		return nextIndex;  // return the value of nextIndex.
	}
	public double at(int index){ // accessor
	if (0 <= index && index < nextIndex)
		return array[nextIndex];
	else
		return Double.NaN;
	}
	private void grow(){
	// make array a reference to an array that is twice as large
	// and contains the same values for indicies 0 through
	// nextIndex - 1, and adjust size appropriately.
	}
	private void shrink(){
	// make array a reference to an array that is half as large
	// and contains the same values for indicies 0 through
	// nextIndex - 1, and adjust size appropriately.
	}
	public void insertAt(int index, double value){ // mutator
	// if 0 <= index <= nextIndex
	// move the nessecary values over one so that value can
	// be incerted at the location index in the array, inserts
	// incerts value at the location index, and adjust nextIndex
	// appropriately.
	// Note a grow() may be neccessary before or after.
	// else
	// do nothing.
	}	
	public void insert(double value){ // mutator
	// insert value at location nextIndex.
	}
	public double removeAt(int index){ // mutator
	// if 0 <= index < nextIndex
	// move the nessecary values over one as to eliminate
	// the value at the location index in the array, adjust
	// nextIndex appropriately, and return the value that was
	// at the location index .
	// Note: a shrink() may be neccessary before or after.
	// else
	// return Double.NaN.
	}
	public double remove(){ // mutator
	// return the removal of the value at location nextIndex-1.
	}
	public void printArray(){ //accessor
	// prints the values of all occupied locations of the array to
	// the screen
	}

}


}
