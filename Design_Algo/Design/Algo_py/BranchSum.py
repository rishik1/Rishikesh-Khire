class BinaryTree:
    def __init__(self,value):
        self.value = value
        self.left = None
        self.right = None

def branchSums(root):
    sums = []
    bracnhSumRecursive(root , 0 , sums)
    return sums

def bracnhSumRecursive(node , runninSum , sums):
    if node is None:
        return
    if node.left is None and node.right is None :
        sums.append(node.value)
        return
    if node.left is not None:
        bracnhSumRecursive(node.left , runninSum+node.value , sums)
    
    if node.right is not None:
        bracnhSumRecursive(node.right , runninSum+node.value , sums)