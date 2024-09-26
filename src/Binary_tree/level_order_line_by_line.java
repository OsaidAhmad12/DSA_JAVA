package Binary_tree;
import java.util.*;
class Node8
{
    int key;
    Node left;
    Node right;
    Node8(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class level_order_line_by_line
{
    public static void level_order(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr==null)
            {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
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
        System.out.println("Printing level order line by line");
        level_order(root);
    }
}
