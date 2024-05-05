import java.util.*;
import java.util.LinkedList;
public class BinaryTreeCreation{
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

    public static void preOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root){
        Queue<Node>q = new LinkedList<>();
        if(root==null){
            return;
        }
        
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(currNode);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSubTree=countNode(root.left);
        int rightSubTree=countNode(root.right);
        return leftSubTree+rightSubTree+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return root.data+leftSum+rightSum;
    }

    public static int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxHeight(root.left);
        int rightDepth=maxHeight(root.right);
        return Math.max(leftDepth, rightDepth)+1;
    }

    public static int diameter(Node root){  //Time complexity is O(n2)
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=maxHeight(root.left)+maxHeight(root.right)+1;

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){  //Time complexity is O(n)
        if(root==null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht, right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;

        int myDiam=Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
        return myInfo;
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        //preOrder(root);
        // postOrder(root);
        // inOrder(root);
        // levelOrder(root);
        // System.out.print("The total number of nodes is : " + countNode(root));
        // System.out.print("The total sum of the data of all nodes is : " + sumOfNodes(root));
        // System.out.print("The largest depth in the given tree is : " + maxHeight(root));
        // System.out.println("The diameter of the given tree is : " + diameter(root));
        System.out.println("The diameter of the given Tree is : " + diameter2(root).diam);
    }
}