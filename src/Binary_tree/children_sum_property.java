package Binary_tree;
import java.util.*;
class Node15
{
    int key;
    Node left;
    Node right;
    Node15(int k)
    {
        key=k;
        right=null;
        left=null;
    }
}
public class children_sum_property
{
    public static boolean child_sum(Node root)
    {
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.key;
        if(root.right!=null)
            sum+=root.right.key;
        return (root.key==sum && child_sum(root.left) && child_sum(root.right));
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(3);
        root.left.right=new Node(5);
        System.out.println(child_sum(root)?"It follows child sum property.":"It does not follow child sum property.");
    }
}
