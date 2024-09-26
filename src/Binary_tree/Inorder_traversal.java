package Binary_tree;
import java.util.*;
class Node1
{
    int key;
    Node1 left;
    Node1 right;
    Node1(int k)
    {
        key=k;
        right=null;
        left=null;
    }
}
public class Inorder_traversal
{
    public static void inorder(Node1 root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node1 root=new Node1(10);
        root.left=new Node1(20);
        root.right=new Node1(30);
        root.left.left=new Node1(40);
        root.right.right=new Node1(50);
        System.out.println("Printing Binary tree in inorder traversal");
        inorder(root);

    }
}
