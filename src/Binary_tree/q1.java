//package Binary_tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//class Node12
//{
//    int key;
//    Node left;
//    Node right;
//    Node12(int k)
//    {
//        key=k;
//        left=null;
//        right=null;
//    }
//}
//class q1
//{
//    public static void preorder(Node root)
//    {
//        if(root!=null)
//        {
//            System.out.print(root.key+" ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
//    public static void inorder(Node root)
//    {
//        if(root!=null)
//        {
//            inorder(root.left);
//            System.out.print(root.key+" ");
//            inorder(root.right);
//        }
//    }
//    public static void postorder(Node root)
//    {
//        if(root!=null)
//        {
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.key+" ");
//
//        }
//    }
//    public static int height(Node root)
//    {
//        if(root==null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//    public static void print_k(Node root,int k)
//    {
//        if(root==null)
//            return;
//        if(k==0)
//            System.out.print(root.key+" ");
//        else
//        {
//            print_k(root.left,k-1);
//            print_k(root.right,k-1);
//        }
//    }
//    public static void level_order(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> q=new LinkedList<Node>();
//        q.add(root);
//        while(q.isEmpty()==false)
//        {
//            Node curr=q.poll();
//            System.out.print(curr.key+" ");
//            if(curr.left!=null)
//                q.add(curr.left);
//            if(curr.right!=null)
//                q.add(curr.right);
//        }
//    }
//    public static void level_order_line_by_line(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> q=new LinkedList<Node>();
//        q.add(root);
//        q.add(null);
//        while(q.size()>1)
//        {
//            Node curr=q.poll();
//            if(curr==null)
//            {
//                System.out.println();
//                q.add(null);
//                continue;
//            }
//            System.out.print(curr.key+" ");
//            if(curr.left!=null)
//                q.add(curr.left);
//            if(curr.right!=null)
//                q.add(curr.right);
//        }
//    }
//    public static void level_order_line_by_line2(Node root)
//    {
//        if(root==null)
//            return;
//        Queue<Node> q=new LinkedList<Node>();
//        q.add(root);
//        while(q.isEmpty()==false)
//        {
//            int count=q.size();
//            for(int i=0;i<count;i++)
//            {
//                Node curr=q.poll();
//                System.out.print(curr.key+" ");
//                if(curr.left!=null)
//                    q.add(curr.left);
//                if(curr.right!=null)
//                    q.add(curr.right);
//            }
//            System.out.println();
//        }
//    }
//    public static int size(Node root)
//    {
//        if(root==null)
//            return 0;
//        return size(root.left)+size(root.right)+1;
//    }
//    public static int max(Node root)
//    {
//        if(root==null)
//            return Integer.MIN_VALUE;
//        return Math.max(root.key,Math.max(max(root.left),max(root.right)));
//    }
//    public static void main(String[] args)
//    {
//        Scanner dis=new Scanner(System.in);
//        int n=0;
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        root.left.left=new Node(40);
//        root.left.right=new Node(50);
//        System.out.println("Printing the binary tree preorder traversal:");
//        preorder(root);
//        System.out.println("\nPrinting the binary tree inorder traversal:");
//        inorder(root);
//        System.out.println("\nPrinting the binary tree postorder traversal:");
//        postorder(root);
//        System.out.println("\nHeight of the binary tree:"+height(root));
//        System.out.println("Enter the value of k:");
//        int k=dis.nextInt();
//        System.out.println("Nodes at distance "+k+" from root:");
//        print_k(root,k);
//        System.out.println("\nPrinting breadth first or level order:");
//        level_order(root);
//        System.out.println("\nPrinting level order line by line by method1:");
//        level_order_line_by_line(root);
//        System.out.println("\nPrinting level order line by line by method2:");
//        level_order_line_by_line2(root);
//        System.out.println("Size of Binary tree(count of nodes):"+size(root));
//        System.out.println("Maximum of binary tree:"+max(root));
//    }
//}