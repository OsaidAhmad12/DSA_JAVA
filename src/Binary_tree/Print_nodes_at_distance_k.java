package Binary_tree;
import java.util.*;
class Node5
{
    int key;
    Node5 left;
    Node5 right;
    Node5(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class Print_nodes_at_distance_k
{
    public static void print_k_dist(Node5 root,int k)
    {
        if(root==null)
            return;
        if(k==0)
            System.out.print(root.key+" ");
        else
        {
            print_k_dist(root.left,k-1);
            print_k_dist(root.right,k-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        Node5 root=new Node5(10);
        root.left=new Node5(20);
        root.left.left=new Node5(40);
        root.left.right=new Node5(50);
        root.right=new Node5(30);
        root.right.right=new Node5(70);
        root.right.right.right=new Node5(80);
        System.out.println("Enter the value of k:");
        int k=dis.nextInt();
        System.out.println("printing the binary tree");
        print_k_dist(root,k);
    }

}
