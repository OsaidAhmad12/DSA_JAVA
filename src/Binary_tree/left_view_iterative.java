package Binary_tree;
import java.util.*;
class Node14
{
    int key;
    Node left;
    Node right;
    Node14(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class left_view_iterative
{
    public static void printleft(Node root)
    {
        if(root==null)
            return;
        Queue<Node > q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                if(i==0)
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.right=new Node(40);
        root.left.left=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Printing left view of binary tree");
        printleft(root);
    }
}
