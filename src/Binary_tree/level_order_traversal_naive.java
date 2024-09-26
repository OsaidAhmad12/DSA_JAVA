package Binary_tree;
import java.util.*;
class Node6
{
    int key;
    Node6 left;
    Node6 right;
    Node6(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class level_order_traversal_naive
{
    public  static int height(Node6 root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void print_k_dis(Node6 root,int k)
    {
        if(root==null)
            return;
        if(k==0)
        System.out.print(root.key+" ");
        else
        {
            print_k_dis(root.left, k - 1);
            print_k_dis(root.right, k - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        Node6 root=new Node6(10);
        root.left=new Node6(20);
        root.right=new Node6(30);
        root.left.right=new Node6(40);
        root.left.left=new Node6(50);
        System.out.println("Printing level-order or breadth first like reading a book from left to right");
        int k=height(root);
        for(int i=0;i<=k;i++)
        {
            print_k_dis(root,i);
        }
    }
}
