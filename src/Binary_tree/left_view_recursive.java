package Binary_tree;
import java.util.*;
class Node13
{
    int key;
    Node left;
    Node right;
    Node13(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class left_view_recursive
{
    static int maxlevel=0;
    public static void printleft(Node root,int level)
    {
        if(root==null)
            return;
        if(maxlevel<level)
        {
            System.out.print(root.key+" ");
            maxlevel=level;
        }
        printleft(root.left,level+1);
        printleft(root.right,level+1);
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
        printleft(root,1);
    }

}
