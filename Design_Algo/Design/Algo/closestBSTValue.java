import java.util.*;
// O(log(N)) worst cases 0(N)   if recursively 0(d) ==> where d is depth 
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    int closest = Integer.MAX_VALUE;
    int current = tree;
    if(tree ==null){
        return -1;
    }
    while(current !=null){

        int diff = Math.abs(current.value -target);
        int oldClosestDiff = Math.abs(closest - target);
        if(diff < oldClosestDiff){
            closest = diff;
        }
        if(current.value - target < 0){
            current = current.left;
        }
        if(current.value - target > 0){
            current = current.right;
        }
        if(current.value - target ==0){
            return current.value;
        }
    }
    return closest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
