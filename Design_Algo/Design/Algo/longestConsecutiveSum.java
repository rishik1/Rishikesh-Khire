import java.util.stream;

public class longestSubSquenece{  //longest subsequence for binary array


    public static void main(String[] args){
        int binaryArr = 101011101;
        System.out.println(" longest sub sequence :: "+ longestSubSquenceOfbinary(binaryArr));
    }


    public static int longestSubSquenceOfbinary(int number){
        int count=0;
        while(number >0){
            number = number &(number <<1);
            count++;
        }
        return count;
    }

}