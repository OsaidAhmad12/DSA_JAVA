package Binary_tree;
import java.util.*;
class Node9
{
    int key;
    Node left;
    Node right;
    Node9(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class level_order_traversal_2
{
    public static void level_order(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
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
        root.right.right=new Node(70);
        root.left.left.left=new Node(60);
        System.out.println("Displaying level order line by line by method2");
        level_order(root);
    }
}
