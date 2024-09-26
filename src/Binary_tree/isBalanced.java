package Binary_tree;
import java.util.*;
class Node16
{
    int key;
    Node left;
    Node right;
    Node16(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class isBalanced
{
    public static int isbalanced(Node root)
    {
        if(root==null)
            return 0;
        int lh=isbalanced(root.left);
        if(lh==-1)
            return -1;
        int rh=isbalanced(root.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;

    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.println(isbalanced(root)!=-1?"The tree is balanced":"Unbalanced tree");
    }
}
