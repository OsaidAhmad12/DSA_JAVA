package Binary_tree;
import java.util.*;
class Node4
{
    int key;
    Node4 left;
    Node4 right;
    Node4(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class Height_Binary_tree
{
    public static int height(Node4 root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node4 root=new Node4(10);
        root.left=new Node4(20);
        root.right=new Node4(30);
        root.left.right=new Node4(40);
        root.left.left=new Node4(50);
        System.out.println("Height of binary tree:"+height(root));
    }
}
