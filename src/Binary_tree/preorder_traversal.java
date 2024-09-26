package Binary_tree;
import java.util.*;
class Node2
{
    int key;
    Node2 left;
    Node2 right;
    Node2(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class preorder_traversal
{
    public static void preorder(Node2 root)
    {
        if(root!=null)
        {
            System.out.print(root.key +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node2 root=new Node2(10);
        root.left=new Node2(20);
        root.right=new Node2(30);
        root.left.left=new Node2(40);
        root.left.right=new Node2(50);
        root.right.left=new Node2(60);
        root.right.right=new Node2(70);
        System.out.println("Printing the tree in preorder traversal");
        preorder(root);

    }
}
