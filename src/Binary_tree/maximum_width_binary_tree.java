package Binary_tree;
import java.util.*;
class Node17
{
    int key;
    Node left;
    Node right;
    Node17(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class maximum_width_binary_tree
{
    public static int width(Node root)
    {
        int max=0;
        if(root==null)
            return 0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            max=Math.max(count,max);
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return max;
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
        root.left.left.left=new Node(60);
        root.right.right=new Node(100);
        System.out.println("Width of binary tree:"+width(root));

    }
}
