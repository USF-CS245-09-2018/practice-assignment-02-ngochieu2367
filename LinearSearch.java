import java.util.Arrays;
public class LinearSearch implements Practice2Search{

	public int search(int[] array, int target){
		for (int i = 0; i < array.length; i++){
			if (array[i] == target){
				return i;
			}
		}
		return -1;
	}

	public String searchName(){
		return "Linear Search";
	}
}