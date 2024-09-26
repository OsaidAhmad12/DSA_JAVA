package Binary_tree;
import java.util.*;
class Node11
{
    int key;
    Node left;
    Node right;
}
public class maximum_in_binary_tree
{
    public static int max(Node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(max(root.left),max(root.right)));
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        System.out.println("Maximum in binary tree:"+max(root));

    }
}
