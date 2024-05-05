import java.util.*;
import java.util.LinkedList;
public class BinaryTreeSubtree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int index=-1;

        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }

            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
    }

    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        if(root.data==subRoot.data){
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }

        return false;
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        int subTree[]={2,4,-1,-1,5,-1,-1};
        BinaryTree tree2=new BinaryTree();
        Node subRoot=tree2.buildTree(subTree);
        //preOrder(root);
        // postOrder(root);
        // inOrder(root);
        // levelOrder(root);
        
    }
}