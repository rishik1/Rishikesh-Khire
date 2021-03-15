import java.util.*;
import java.util.stream;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
		Arrays.sort(array);
		int i=0;
		int j=array.length-1;
		IntStream.range(0,array.length-1).forEach(k ->{
			if(array[i]+array[j] > targetSum){
				j--;
			}
			if(array[i]+array[j] < targetSum){
				i++;
			}
			if(array[i]+ array[j] == targetSum){
				int[] res = new int[2];
				res[0] =array[i];
				res[i] =array[j];
				return res;
			}
			if(i>j){
				return new int[0];
			}
		});
		
        
		
    return new int[0];
  }
}