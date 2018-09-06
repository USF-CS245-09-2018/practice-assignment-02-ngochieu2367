public class BinaryIterativeSearch implements Practice2Search{

	public int search(int[] array, int target){
		return search(array, target,0,array.length-1);
	}

	public int search(int[] array, int target, int lower, int upper){
		while(lower > upper){
			int mid = (upper+lower)/2;

			if (array[mid] == target)
				return mid;

			else if(array[mid] < target)
				upper = mid + 1;

			else
				lower = mid - 1; 
		}
		return -1;
	}

	public String searchName(){
		return "Binary Iterative Search";
	}
}