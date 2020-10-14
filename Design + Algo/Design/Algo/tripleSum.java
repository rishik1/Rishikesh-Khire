import java.util.HashSet;
import java.util.stream;

public class tripleSum{

    public static void main(String[] args){
        Scanner sc = new Scanner(system.in);

        int lena = sc.nextint();
        int lenb = sc.nextInt();
        int lenc = sc.nextInt();
        
        int a[] = new int[lena];
        int b[] = new int[lenb];
        int c[] = new int[lenc];
        
        for(int i=0;i<lena;i++){
            a[i] =sc.nextInt();
        }
        for(int i=0;i<lenb;i++){
            b[i] =sc.nextInt();
        }
        for(int i=0;i<lenc;i++){
            b[i] =sc.nextInt();
        }

        long triplets = triplets(a,b,c);
        System.out.println("triplets count where (a <= b >= c)   is :::: "+ triplets);
    }

    public static long triplets(int[] a, int[] b ,int[] c){

        long tripletcount =0;

        int[] distincta = removeDuplicates(a);
        int[] distinctb = removeDuplicates(b);
        int[] distinctc = removeDuplicates(c);

        Arrays.sort(distincta); // O(nlong) merge sort
        Arrays.sort(distinctb);
        Arrays.sort(distinctc);

        for(int b: distinctb){
            long aindex = getBinaryIndex(distincta , b) +1;
            long cindex = getBinaryIndex(distinct , b) +1;
            tripletcount = tripletcount+ (aindex*cindex);
        }
        return tripletcount;
    }

    public static int[] removeDuplicates(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int item: a){
            set.add(item);
        }

        int result[] = new int[len];
        int i=0;
        for(int item : set){
            result[i++]= item;
        }
        return result;
    }

    public static int getBinaryIndex(int[] distincta, int key){
        int low =0;
        int high = distincta.length -1;
        int count =1;

        while(low <= high){
            int mid = (low + ( high-low ))/2;
            
            if(distincta[mid] <= key){
                count = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }   
            return count;
        }
    }



}