import java.util.stream;

public class slidingWindowsMaxSum{ 
    // uses 2 pointer to solve prblem 
    // 2 poointer will be at a distance of windows 

// IntStream range(int startInclusive , int endExclusive)

    public static void main(String[] args){
        int windowsSize = 3;
        int[] A = {1, 4, 5 ,490 , 11 , 3 , 99};
        System.out.println("Get max sum of subArray sliding windows "+ getMaxSumSubArrayOfSize(A,windowsSize));
    }

    public static int getMaxSumSubArrayOfSize(int[] A,int k){
        
        int wSum =0;
        IntStream.range(0,k)
        .forEach(i -> {
            wSum = wSum + A[i];
        });

        int maxSum =wSum;

        IntStream.range(k,A.length)
        .forEach(i ->{
            wSum = wSum+A[i] - A[i-k];
            if(maxSum <wSum){
                maxSum = wSum;
            }
        });
        return maxSum;
    }

}