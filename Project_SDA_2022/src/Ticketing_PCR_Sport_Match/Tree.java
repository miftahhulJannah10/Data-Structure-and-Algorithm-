package Ticketing_PCR_Sport_Match;

public class Tree {
    private static Node root;

    public Tree (){

    }
    public int finMin(Node tes) {
        Node min = tes;
        while (min.leftChild != null) {
            min = min.leftChild;
        }
        return min.iData;
    }

    public int finMin() {

        return (finMin(root));
    }

    public int finMax(Node tes) {
        Node max = tes;
        while (max.rightChild != null) {
            max = max.rightChild;
        }
        return max.iData;
    }

    public int finMax() {
        return (finMax(root));
    }

    public int size() {

        return (size(root));
    }

    private int size(Node node) {
        if (node == null)
            return (0);
        else {
            return (size(node.leftChild) + 1 + size(node.rightChild));
        }
    }

    public void insert(int id, String nama) {
        Node baru = new Node(id, nama);
        baru.iData = id;
        baru.nama = nama;

        if (root == null) {
            System.out.println("Node baru No Kursi " + id
                    + " Dengan Nama " + nama + " Sebagai root");
            root = baru;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        System.out.println("Node baru No Kursi " + id
                                + " Dengan Nama " + nama
                                + " Sebagai anak kiri dari " + parent.iData);
                        parent.leftChild = baru;
                        break;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        System.out.println("Node baru No Kursi " + id
                                + " Dengan Nama " + nama
                                + " Sebagai anak kanan dari " + parent.iData);
                        parent.rightChild = baru;
                        break;
                    }
                }
            }
        }
    }

    public void InOrder() {
        InOrder(root);
        System.out.println();
    }

    public void InOrder(Node localroot) {
        if (localroot != null) {
            InOrder(localroot.leftChild);
            localroot.displayNode();
            InOrder(localroot.rightChild);
        }
    }

    public void PostOrder() {
        PostOrder(root);
        System.out.println();
    }

    public void PostOrder(Node localroot) {
        if (localroot != null) {
            PostOrder(localroot.leftChild);
            PostOrder(localroot.rightChild);
            localroot.displayNode();
        }
    }

    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    public void PreOrder(Node localroot) {
        if (localroot != null) {
            localroot.displayNode();
            PreOrder(localroot.leftChild);
            PreOrder(localroot.rightChild);
        }
    }

    static void printleafNodes(Node root) {
        if (root == null)
            return;

        if (root.leftChild == null && root.rightChild == null) {
            System.out.println(root.iData + " ");
            return;
        }
        if (root.leftChild != null)
            printleafNodes(root.leftChild);

        if (root.rightChild != null)
            printleafNodes(root.rightChild);

    }
    public void printleafNodes() {
        printleafNodes(root);
        System.out.println();
    }

    private Node getSuccesor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;

            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public boolean delete(int id) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;
        while ((current.iData != id)) {
//            System.out.println("not same");
            parent = current;
            if (id < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        } else if (current.rightChild == null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        } else if (current.leftChild == null) {
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        } else {
            Node successor = getSuccesor(current);
            if ((current == root))
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            successor.leftChild = current.leftChild;
        }
        return true;
    }

    static void printRootNodes(Node root) {
        if (root == null)
            return;

        if (root != root.leftChild && root != root.rightChild) {
            System.out.println(root.iData + " ");
        }
    }
    public void printRootNodes() {
        printRootNodes(root);
        System.out.println();
    }





    public boolean search(int noKursi) {
        return search(root, noKursi);
    }

    private boolean search(Node r, int noKursi) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.iData;
            if (noKursi < rval) {
                r = r.leftChild;
            } else if (noKursi > rval) {
                r = r.rightChild;
            } else {
                found = true;
                break;
            }
            found = search(r, noKursi);
        }
        return found;
    }


}
