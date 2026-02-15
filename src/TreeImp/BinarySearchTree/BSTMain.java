package TreeImp.BinarySearchTree;
import java.util.Scanner;

public class BSTMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearchTree tree = new BinarySearchTree();
        for(int i=0;i<n;i++){
            tree.insert(sc.nextInt());
        }
        tree.inorder();
    }
}
class Node{
    int data;
    Node left =  null, right = null;
    public Node(int data){
        this.data = data;
    }
}
class BinarySearchTree{
    Node root;
    public void insert(int data){
        root = insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root==null){
            root = new Node(data);
        }
        else if(root.data > data){
            root.left = insertRec(root.left,data);
        }else if(root.data < data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
}
