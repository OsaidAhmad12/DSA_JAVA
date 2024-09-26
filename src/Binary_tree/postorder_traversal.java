package Binary_tree;
import java.util.*;
class Node3
{
    int key;
    Node3 left;
    Node3 right;
    Node3(int k)
    {
        key=k;
        right=null;
        left=null;
    }
}
public class postorder_traversal
{
    public static void postorder(Node3 root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node3 root=new Node3(10);
        root.left=new Node3(20);
        root.right=new Node3(88);
        root.left.right=new Node3(45);
        root.right.left=new Node3(342);
        System.out.println("Printing the binary tree in postorder traversal");
        postorder(root);
    }
}
