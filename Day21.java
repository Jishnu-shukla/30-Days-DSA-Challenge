/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int minValue(Node root) {
        
        if(root == null) return -1;
        // code here
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
}
