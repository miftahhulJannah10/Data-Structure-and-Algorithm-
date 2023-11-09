package Ticketing_PCR_Sport_Match;

public class Node {
    public int iData;
    public Node leftChild;
    public Node rightChild;
    String nama;
//    int data;

    public Node(int id, String nama){
        iData = id;
        this.nama = nama;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode(){
        System.out.print(" ");
        System.out.print(iData);
    }
}
