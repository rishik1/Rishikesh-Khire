

public class longestCommonSubsequence{

    public static void main(String[] args){

        char[] x = {'j','a','v','a'}; 
        char[] y = {'j','a','a','a','v','v','a'};
        System.out.println("Longest common sub squence :: recursive "+ LCS_recursive(x,y, 0,0));
        System.out.println("Longest common sub squence :: memoization "+ LCS_memoization(x,y, 0,0,new Integer[x.length+1][y.length+1]));
        System.out.println("Longest common sub squence :: dynamic programming  "+ LCS_dynamicProgramming(x,y, 0,0));


    }

/*
    O(3^(m+n))
    O(m+n)
    compare both arrays if equal value found move the index for one of the arrays
    other return the max calulated value between either array
*/
    public static int LCS_recursive (char[] x, char[] y, int i , int j){
        if(i<=0|| j<=0)
            return 0;
        
        if(x[i-1]==y[j-1])
            return 1+ LCS_recursive(x,y,i-1 , j-1);
        else
            return Math.max(LCS_recursive(x,y,i,j-1), LCS_recursive(x,y, i-1,j));
        
    }


    public static int LCS_memoization(char[] x, char[] y , int i , int j , Integer[][] dp){
        if(i<=0 || j<=0)
            return 0;

        if(dp[i][j]!=null)
            return dp[i][j];

        if(x[i-1]==y[j-1]){
            return 1+ LCS_memoization(x,y, i-1,j-1, dp);
        }else{
            return dp[i][j] =Math.max( LCS_memoization(x,y, i , j-1,dp), LCS_memoization(x,y,i,j-1,dp));
        }
    }


    public static int LCS_dynamicProgramming(char[] x, char[] y , int m , int n){
        int memo[] = new int[n+1];

        for(int i=1;i<=m;i++){
            int prev =0;
            for(int j=1;j<=n;j++){
                int temp =memo[j];
                if(x[i-1]==y[j-1]){
                    memo[j]=prev+1;
                }else{
                    memo[j] =Math.max(memo[j],memo[j-1]);
                }
                prev=temp;
            }
        }
        return memo[n];
    }
}