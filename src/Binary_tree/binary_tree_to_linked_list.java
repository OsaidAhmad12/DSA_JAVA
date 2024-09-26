package Binary_tree;
import java.util.*;
class Node18
{
    int key;
    Node left;
    Node right;
    Node18(int k)
    {
        key=k;
        left=null;
        right=null;
    }
}
public class binary_tree_to_linked_list
{
    static Node prev=null;
    public static Node BTToDLL(Node root)
    {
        if(root==null)
            return null;
        Node head=BTToDLL(root.left);
        if(prev==null)
            head=root;
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }
    public static void display(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.key+" ");
            curr=curr.right;
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
        System.out.println("Converting Binary tree to linked list:");
        Node head=BTToDLL(root);
        System.out.println("Displaying doubly linked list:");
        display(head);
    }
}
