
public class fibonacciRecDP{

    public static void main(String[] args){
        int range = 100;
        System.out.println(" Recurisive fibonnaci :: "+ibonnaciRec(range));
    }

    public static int fibonnaciRec(int range){
        if(range <2){
            return range;
        }
        return fibonnaciRec(range-1)+fibonnaciRec(range-2);
    }

    /*
        Dynamic programming means store sub results in cache and then use it for future ,
        to reduce overall time complexity
    */

    public static int fibonacciDynamicProgramming(int range){

        int cache[] = new int[range+1];

        //base cases
        cache[0]=0;
        cache[1]=1;

        IntStream.range(0,range+1)
        .forEach(i ->{
            cache[i] = cache[i-1]+ cache[i-2]; 
        });

        return cache[range];
        
    }


    public static int fibonacciWithoutCache(int range){
        int first =0;
        int second =1;
        int sum =0;

        Intstream.range(0,range+1)
        .forEach(i -> {
            sum = first+second;
            first=second;
            second=sum;
        });

        return sum;
    }
}