package Binary_tree;
import java.util.*;
class Node
{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class create_tree
{
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
    }
}
