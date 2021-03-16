def findClosesValueInBst(tree , target):
    return findClosestValueInBstHelper(tree , target , float("inf"))

def findClosestValueInBstHelper(tree , target , closest):
    if tree is None:
        return closest
    if abs(target -closest) > abs(target - tree.value):
        closest = tree.value
    if target <tree.value:
        return findClosestValueInBstHelper(tree.left , target, closest)
    elif target > tree.value:
        return findClosestValueInBstHelper(tree.right, target , closest)
    else:
        return closest


def findClosesValueInBstIterative(tree , target):
    current = tree
    while current is not None:
        if abs(target -current.value) < abs(target - closest):
            closest = current.value
        if current.value - target < 0 :
            current = current.left
        elif current.value -target >0 :
            current = current.right
        else:
            return closest
            
    return closest

