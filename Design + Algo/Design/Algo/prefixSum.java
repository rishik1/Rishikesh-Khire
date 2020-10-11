import java.util.stream;
public class prefixSum{ //maximum sum subarray

    public static void main(String[] args){
        int[] arr = { 1,44,11,10,13,21,34, 3};
        System.out.println(" sum of sub array is :: "+ sumSubarray(arr, 2, 4));
    }

    public int sumSubarray(int[] arr , int startIndex , int endIndex){

        int[] sumArray = IntStream.range(0,arr.length)
        .filter(i -> i>=0)
        .map(i -> {
                    if(i>0){
                        return arr[i]+arr[i-1];
                    }else
                        return arr[i];
                    })
        .toArray(int[]::new);

        int subArraySum = sumArray[endIndex] - sumArray[startIndex];

        return subarraySum;
    }


    public int maxSumSubarray(int[] arr ){

        int[] sumArray = IntStream.range(0,arr.length)
        .filter(i -> i>=0)
        .map(i -> {
                    if(i>0){
                        return arr[i]+arr[i-1];
                    }else
                        return arr[i];
                    })
        .toArray(int[]::new);

        int minIndex =0;
        int maxSum =sumArray[0];
        IntStream.range(0,arr.length)
        .filter(i -> i>0)
        .forEach(i ->{
            if(maxSum < sumArray[i] - arr[minIndex]){
                maxSum = sumArray[i]- arr[minIndex]
            }
            if(arr[i])<arr[i-1]){
                minIndex = i;
            }
        });

        return maxSum;  // returning max increasing number of subarray's sum
    }


}