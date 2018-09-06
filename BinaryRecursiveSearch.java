public class BinaryRecursiveSearch implements Practice2Search{


	public int search(int [] array, int target) {              //Overload
		return search(array, target, 0, array.length-1);
	}
	public int search(int[] array, int target, int lower, int upper){
		if(lower > upper){
			return -1;

		}
		int mid = (upper + lower)/2;
		if(array[mid] == target){
			return mid;
		}
		if(array[mid] < target){
			return search(array,target,mid+1,upper);
		}
		else{
			return search(array,target,lower,mid-1);
		}
	}

	public String searchName(){
		return "Binary Recursive Search";
	}
}