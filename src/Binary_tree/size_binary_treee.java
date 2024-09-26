package Binary_tree;
import java.util.*;
class Node10
{
    int key;
    Node left;
    Node right;
}
public class size_binary_treee
{
    public static int size(Node root)
    {
        if(root==null)
            return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
//        Node root=null;
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Size of the binary tree(counting nodes):"+size(root));
    }
}
