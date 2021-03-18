import java.util.*;

class DepthFirstSearch{

    static class Node{
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name){
            this.name = name;
        }

        public List<String> DepthFirstSearch(List<String> array){
            DepthFirstSearch(this, "x",array);
            return array;
        }

        public void DepthFirstSearch(Node node , String value , List<String> result){
            if(node.children == null || node.children.isEmpty()){
                return;
            }
            if(value.equalsIgnoreCase(node.name)){
                return;
            }
            for(Node childNode: node.children){
                result.add(childNode.name);
                DepthFirstSearch(childNode, "value" , result);
            }

        }

        public Node addChild(String name){
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

}