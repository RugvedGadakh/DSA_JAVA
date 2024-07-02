import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTrees {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = countOfNodes(root.left);
        int rightnodes = countOfNodes(root.right);

        return leftnodes + rightnodes + 1;
    }

    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = SumOfNodes(root.left);
        int rightnodes = SumOfNodes(root.right);

        return leftnodes + rightnodes + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int Heightleftnodes = height(root.left);
        int Heightrightnodes = height(root.right);

        int maxHeight = Math.max(Heightleftnodes, Heightrightnodes) + 1;
        return maxHeight;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam2, diam1));
    }

    static class Treeinfo {
        int ht;
        int diameter;

        Treeinfo(int ht, int diameter) {
            this.ht = ht;
            this.diameter = diameter;
        }
    }

    public static Treeinfo Diameter2(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }
        Treeinfo left = Diameter2(root.left);
        Treeinfo right = Diameter2(root.right);

        int maxHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam2, diam1), diam3);

        Treeinfo myinfo = new Treeinfo(maxHeight, mydiam);

        return myinfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        System.out.println("Root Node : ");
        System.out.println(root.data);

        System.out.println("Preorder :");
        preorder(root);
        System.out.println();
        System.out.println("Inorder :");
        inorder(root);
        System.out.println();
        System.out.println("Postorder :");
        postorder(root);
        System.out.println();
        System.out.println();
        System.out.println("Level order :");
        levelOrder(root);
        System.out.println();
        System.out.println("Node Count :");
        System.out.println(countOfNodes(root));
        System.out.println();
        System.out.println("Sum of Nodes :");
        System.out.println(SumOfNodes(root));
        System.out.println();
        System.out.println("Tree Height :");
        System.out.println(height(root));
        System.out.println();
        System.out.println("Tree Diameter :");
        System.out.println(diameter(root));
        System.out.println("Tree Diameter :");
        System.out.println(Diameter2(root).diameter);
    }
}
