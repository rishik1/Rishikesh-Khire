import java.util.*;

class BranchSum {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    ArrayList<Integer> results = new ArrayList<>();
    branchSumRecusive(root , 0 , results);
    return results;
  }


  public static void branchSumRecusive(BinaryTree node , Integer runningSum , ArrayList<Integer> results){

    if(node.left ==null && node.right==null){
        results.add(runningSum+node.value);
        return;
    }
    if(node.left !=null){
        branchSumRecusive(node.left , (runningSum + node.value) , results);
    }
    if(node.right !=null){
        branchSumRecusive(node.right , (runningSum + node.value) , results);
    }
  }
}