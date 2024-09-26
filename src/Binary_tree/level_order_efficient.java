package Binary_tree;
import java.util.*;
class Node7
{
    int key;
    Node left;
    Node right;
    Node7(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class level_order_efficient
{
    public static void level_order(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            Node curr=q.poll();
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
        System.out.println("Printing level order by efficient approach,i.e,by queue");
        level_order(root);
    }
}
