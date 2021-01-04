import java.util.stream;

public class twoPointerTwoSum{

    public static void main(String[] args){

        int A[] ={ -3,2,3,6,8,15};
        int expectedSum = 6;
        Systme.out.println("2 pointer sum is :: "+ get2pointerSum(A,expectedSum));
    }

    public static int get2pointerSum(int[] A , int expectedSum){ //retrun index+1 of position where a+b = sum

        int start =0;
        int end = A.length-1;
        int result[] = new int[2];

        while(start < end){
            int sum = A[start] + A[end];
            if(sum == target){
                result[0]=start+1;
                result[1]=end+1;
            }else if(sum <target){
                start++;
            }else{
                end--;
            }
        }
        return result;

    }
}