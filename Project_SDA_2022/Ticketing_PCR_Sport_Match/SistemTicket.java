package Ticketing_PCR_Sport_Match;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemTicket {
//    private int maxSize;
//    private String [] queA;
//    private int front;
//    private int rear;
//    private String [] jadwalPertandingan;
//    private int [] dataKursi;
//    private int [] hargaTicket;
//    String nama, jadwal,harga;
//    int noKursi;
//    private static Node root;
//
//    public SistemTicket(int max){
//        this.maxSize = max;
//        dataKursi = new int [maxSize];
//        queA = new String[maxSize];
//        jadwalPertandingan = new String[maxSize];
//        hargaTicket = new int[maxSize];
//        front = -1;
//        rear = -1;
//        root = null;
//    }
//
//    public boolean isEmpty(){
//
//        return (front<0 || front > rear);
//    }
//
//    public boolean isFull(){
//
//        return (rear == maxSize -1);
//    }
//
//    public boolean cekAntrian(){
//        if (!isFull()) {
//            System.out.println("Kursi Tersedia");
//            return true;
//
//        }
//        System.out.println("Kursi Full");
//        return false;
//    }
//    public void Enqueue (String nama, int noKursi, String jadwal, int harga){
//        if (!isFull()){
//            front = 0;
//            rear++;
//            if(rear == maxSize){
//                rear = -1;
//            }
//            jadwalPertandingan[rear] = jadwal;
//            dataKursi[rear] = noKursi;
//            hargaTicket[rear] = harga;
//            queA[rear] = nama;
//
//            System.out.println("\nNama Pembeli Ticket : "+ nama + " \nDengan No Kursi: " + noKursi
//                    + " \nAkan Menonton Pertandingan: " + jadwal + " \nDengan Harga Tiket: "
//                    + harga+ " \nSudah Berhasil Membeli Tiket");
//        } else {
//            System.out.println("\nNama Pembeli Ticket : "+ nama + " \nDengan No Kursi: " + noKursi
//                    + " \nAkan Menonton Pertandingan: " + jadwal + " \n/Dengan Harga Tiket: "
//                    + harga+ " \nGagal Membeli Tiket");
//        }
//    }
//    public String getDate(){
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy - MM - dd    HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        return dtf.format(now);
//    }
//    public void Dequeue(){
//        if(isEmpty()){
//            System.out.println("Tidak ada antrian");
//        }
//        else {
//            front++;
//            if (front == maxSize){
//                System.out.println("pembeli tiket " + queA[front - 1] + " keluar dari antrian");
//                front = -1;
//                rear = -1;
//            }
//            else {
//                System.out.println(queA[front -1] + " Berhasil keluar dari antrian");
//            }
//        }
//    }
//
//    public void printData(){
//        if (!isEmpty()){
//            System.out.println("Nama    ||   No Kursi   ||    Type Ticket  ||     Jadwal Pertandingan");
//
//            for (int i = front; i <= rear; i++){
//                System.out.print(queA[i] + "\t\t" + " " +dataKursi[i] +"\t\t\t\t " + hargaTicket[i] +
//                        "\t\t\t\t" + jadwalPertandingan[i]+ "\n");
//            }
//        }
//        else {
//            System.out.println("Tidak ada antrian");
//        }
//    }
//
//    String lihatFront(){
//        return queA[front] + " Dengan No. Kursi " +
//                dataKursi[front] + " Membeli Ticket Seharga Tipe " + hargaTicket[front] + " dan Jadwal Pertandingan "
//                + jadwalPertandingan[front] ;
//    }
//
//    String lihatRear(){
//        return queA[rear] + " Dengan No. Kursi " +
//                dataKursi[rear] + " Membeli Ticket Seharga Tipe " + hargaTicket[rear] + " dan Jadwal Pertandingan "
//                + jadwalPertandingan[rear] + "\n";
//    }
//    static void menu() {
//        System.out.println("============================= SISTEM PEMBELIAN TICKET =============================");
//        System.out.println("| Menu Sistem :                                                                   |");
//        System.out.println("| 1.  Cek Jadwal Pertandingan                                                     |");
//        System.out.println("| 2.  Cek Kursi Kosong                                                            |");
//        System.out.println("| 3.  Masukkan data pembeli tiket                                                 |");
//        System.out.println("| 4.  Keluarkan pembeli tiket dari antrian                                        |");
//        System.out.println("| 5.  Cek data pembeli tiket                                                      |");
//        System.out.println("| 6.  Lihat info tree                                                             |");
//        System.out.println("| 7.  Delete Tree                                                                 |");
//        System.out.println("| 8.  Mengurutkan Harga Ticket                                                    |");
//        System.out.println("| 9.  Mencari No Kursi Penonton                                                   |");
//        System.out.println("| 10.  Keluar dari program                                                        |");
//        System.out.println("===================================================================================");
//        System.out.print("Pilihan Menu (1 - 10): \n");
//
//    }
//
//    static void JadwalPertandingan(){
//
//        System.out.println("----------------------------------------------------------------------------------");
//        System.out.println("|           Jadwal Pertandingan PCR SPORT MATCH                                  |");
//        System.out.println("|1.      Pukul 10.00 - 11.00 WIB PCR vs Unilak                                   |");
//        System.out.println("|2.      Pukul 11.00 - 12.00 WIB UIR vs UMRI                                     |");
//        System.out.println("|3.      Pukul 13.00 - 14.00 WIB Abdurrab vs UIN Suska                           |");
//        System.out.println("|4.      Pukul 14.00 - 15.00 WIB Hangtuah vs Poltekkes                           |");
//        System.out.println("|5.      Pukul 15.00 - 16.00 WIB AMIK Duri vs Payung Negeri                      |");
//
//        System.out.println("----------------------------------------------------------------------------------");
//
//    }
//    static void hargaTicket(){
//        System.out.println("---------------------------------------------------------------------------------");
//        System.out.println("|                          Daftar Harga PCR SPORT MATCH                         |");
//        System.out.println("|1.                              Rp. 1.000.000,-                                |");
//        System.out.println("|2.                              Rp. 1.500.000,-                                |");
//        System.out.println("|3.                              Rp. 2.500.000,-                                |");
//        System.out.println("|4.                              Rp. 3.500.000,-                                |");
//        System.out.println("---------------------------------------------------------------------------------");
//    }
//
//    public int finMin (Node tes) {
//        Node min = tes;
//        while (min.leftChild != null) {
//            min = min.leftChild;
//        }
//        return min.iData;
//    }
//    public int finMin() {
//
//        return (finMin(root));
//    }
//    public int finMax (Node tes) {
//        Node max = tes;
//        while (max.rightChild != null) {
//            max = max.rightChild;
//        }
//        return max.iData;
//    }
//    public int finMax() {
//        return (finMax(root));
//    }
//
//    public int size(){
//
//        return (size(root));
//    }
//
//    private int size (Node node){
//        if(node == null)
//            return (0);
//        else {
//            return (size(node.leftChild) + 1 + size(node.rightChild));
//        }
//    }
//
//    public void insert (int id, String nama) {
//        Node baru = new Node(id, nama);
//        baru.iData = id;
//        baru.nama = nama;
//
//        if (root == null) {
//            System.out.println("Node baru No Kursi " + id
//                    + " Dengan Nama " + nama+ " Sebagai root");
//            root = baru;
//        }
//        else {
//            Node current = root;
//            Node parent;
//            while (true) {
//                parent = current;
//                if (id < current.iData) {
//                    current = current.leftChild;
//                    if (current == null) {
//                        System.out.println("Node baru No Kursi " + id
//                                + " Dengan Nama " + nama
//                                + " Sebagai anak kiri dari " + parent.iData);
//                        parent.leftChild = baru;
//                        break;
//                    }
//                }
//                else {
//                    current = current.rightChild;
//                    if (current == null) {
//                        System.out.println("Node baru No Kursi " + id
//                                + " Dengan Nama " + nama
//                                + " Sebagai anak kanan dari " + parent.iData);
//                        parent.rightChild = baru;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//    public void InOrder() {
//        InOrder(root);
//        System.out.println();
//    }
//
//    public void InOrder (Node localroot) {
//        if (localroot != null) {
//            InOrder(localroot.leftChild);
//            localroot.displayNode();
//            InOrder(localroot.rightChild);
//        }
//    }
//
//    public void PostOrder() {
//        PostOrder(root);
//        System.out.println();
//    }
//
//    public void PostOrder (Node localroot) {
//        if (localroot != null) {
//            PostOrder(localroot.leftChild);
//            PostOrder(localroot.rightChild);
//            localroot.displayNode();
//        }
//    }
//
//    public void PreOrder() {
//        PostOrder(root);
//        System.out.println();
//    }
//
//    public void PreOrder (Node localroot) {
//        if (localroot != null) {
//            localroot.displayNode();
//            PreOrder(localroot.leftChild);
//            PreOrder(localroot.rightChild);
//        }
//    }
//    static void printleafNodes(Node root){
//        if ( root == null)
//            return;
//
//        if ( root.leftChild == null && root.rightChild == null){
//            System.out.println(root.iData + " ");
//            return;
//        }
//        if(root.leftChild != null)
//            printleafNodes(root.leftChild);
//
//        if (root.rightChild != null)
//            printleafNodes(root.rightChild);
//
//    }
//    private Node getSuccesor(Node delNode) {
//        Node successorParent = delNode;
//        Node successor = delNode;
//        Node current = delNode.rightChild;
//
//        while (current != null) {
//            successorParent = successor;
//            successor = current.leftChild;
//        }
//        if (successor != delNode.rightChild) {
//            successorParent.leftChild = successor.rightChild;
//
//            successor.rightChild = delNode.rightChild;
//        }
//        return successor;
//    }
//    public boolean delete(int id){
//        Node current = root;
//        Node parent = root;
//
//        boolean isLeftChild = true;
//        while ( (current.iData != id)){
//            parent = current;
//            if (id < current.iData){
//                isLeftChild = true;
//                current = current.leftChild;
//            }
//            else {
//                isLeftChild = false;
//                current = current.rightChild;
//            }
//            if (current == null)
//                return false;
//        }
//        if (current.leftChild == null && current.rightChild == null){
//            if (current == root)
//                root = null;
//            else if (isLeftChild)
//                parent.leftChild = null;
//            else
//                parent.rightChild = null;
//        }
//        else if (current.rightChild == null){
//            if (current== root)
//                root = current.leftChild;
//            else if (isLeftChild)
//                parent.leftChild = current.leftChild;
//            else
//                parent.rightChild = current.leftChild;
//        }
//        else if (current.leftChild == null){
//            if(current == root)
//                root = current.rightChild;
//            else if (isLeftChild)
//                parent.leftChild = current.rightChild;
//            else
//                parent.rightChild = current.rightChild;
//        }
//        else {
//            Node successor = getSuccesor(current);
//            if ((current == root))
//                root = successor;
//            else if (isLeftChild)
//                parent.leftChild = successor;
//            else
//                parent.rightChild = successor;
//
//            successor.leftChild = current.leftChild;
//        }
//        return true;
//    }
//
//    static void printRootNodes (Node root){
//        if (root== null)
//            return;
//
//        if (root!= root.leftChild && root != root.rightChild){
//            System.out.println(root.iData + " ");
//        }
//    }
//    public void shorting() {
//        int i, j, temp,awal;
//        for (i=0; i < (dataKursi.length);i++){
//            awal=i;
//            for (j=i+1; j < dataKursi.length;j++) {
//                if (dataKursi [awal] > dataKursi[j]){
//                    awal=j;
//                }
//            }
//
//            temp=dataKursi[i];
//            dataKursi[i]=dataKursi[awal];
//            dataKursi[awal]=temp;
//            System.out.println(dataKursi[i]);
//        }
//    }
//
//
//    public boolean search(int noKursi) {
//        return search(root,noKursi);
//    }
//
//    private boolean search(Node r, int noKursi) {
//        boolean found = false;
//        while ((r != null) && !found) {
//            int rval = r.iData;
//            if (noKursi < rval) {
//                r = r.leftChild;
//            } else if (noKursi > rval) {
//                r = r.rightChild;
//            } else {
//                found = true;
//                break;
//            }
//            found = search(r, noKursi);
//        }
//        return found;
//    }
//
//
//    public static void main(String[] args) {
//
//        System.out.println("===================================================================================");
//        System.out.println("|                      SISTEM PEMBELIAN TICKET PCR SPORT MATCH                    |");
//        System.out.println("|               POLITEKNIK CALTEX RIAU - BADAN EKSEKUTIF MAHASISWA                |");
//        System.out.println("|                      Jl. UmbanSari No.1, Pekanbaru - Riau                       |");
//        System.out.println("===================================================================================");
//
//        Scanner sc = new Scanner(System.in);
//        int menu;
//        System.out.print("Masukkan Maksimal Antrian Ticket: ");
//        int maksimal = sc.nextInt();
//
//        SistemTicket Antrian = new SistemTicket(maksimal);
//        do {
//            System.out.println("Pilih Menu: ");
//            menu();
//            menu = sc.nextInt();
//            switch (menu){
//                case 1:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>> Anda Berada di Menu Lihat Jadwal Pertandingan <<<<<<<<<<<<<<< |");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    Antrian.JadwalPertandingan();
//                    System.out.println("");
//                    break;
//                case 2:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>> Anda Berada di Menu Cek Antrian Pembeli Ticket <<<<<<<<<<<<<<<<|");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    Antrian.cekAntrian();
//                    break;
//                case 3:
//                    if(Antrian.isFull()== false){
//                        System.out.println("===================================================================================");
//                        System.out.println("|>>>>>>>>>>>>>>>>>>>>>> Anda berada di menu penginputan data <<<<<<<<<<<<<<<<<<<<<|");
//                        System.out.println("===================================================================================");
//                        System.out.println("Masukkan data pembeli tiket");
//                        System.out.println("Masukkan nama penonton: ");
//                        String nama = sc.next();
//                        System.out.println("Masukkan No.Kursi Penonton (10-90): ");
//                        int noKursi = sc.nextInt();
//                        hargaTicket();
//                        System.out.println("Silahkan Pilih jadwal pertandingan: ");
//                        System.out.println("Masukkan harga ticket: ");
//                        int harga;
////                        int jadwal;
//                        harga = sc.nextInt();
//                        if(harga == 1){
//                            int harga1 =1000000;
//                            System.out.println("Berhasil Memilih Harga Ticket " + harga1);
//                        } else if (harga == 2){
//                            int harga2 = 1500000;
//                            System.out.println("Berhasil Memilih Jadwal " + harga2);
//                        } else if (harga == 3){
//                            int harga3 = 2500000;
//                            System.out.println("Berhasil Memilih Jadwal " + harga3);
//                        } else {
//                            int harga4 = 3500000;
//                            System.out.println("Berhasil Memilih Jadwal " + harga4);
//                        }
////                        System.out.println(Antrian.harga);
//
////                        switch (harga){
////                            case 1:
////                                int harga1 =1000000;
////                                System.out.println("Berhasil Memilih Harga Ticket " + harga1);
////
//////                                Antrian.Enqueue(nama,noKursi,jadwal, harga);
////                                break;
////                            case 2:
////                                int harga2 = 1500000;
////                                System.out.println("Berhasil Memilih Jadwal " + harga2);
//////                                Antrian.Enqueue(nama,noKursi,jadwal2, harga);
////                                break;
////                            case 3:
////                                int harga3 = 2000000;
////                                System.out.println("Berhasil Memilih Jadwal " + harga3);
//////                                Antrian.Enqueue(nama,noKursi,jadwal3, harga);
////
////                        }
//                        JadwalPertandingan();
//                        System.out.println("Silahkan Pilih jadwal pertandingan: ");
//                        int jadwal = sc.nextInt();
//                        switch (jadwal){
//                            case 1:
//                                String jadwal1 = "Pukul 10.00 - 11.00 WIB PCR vs Unilak";
//                                System.out.println("Berhasil Memilih Jadwal");
//                                Antrian.Enqueue(nama,noKursi,jadwal1, harga);
//
//                                break;
//                            case 2:
//                                String jadwal2 = "Pukul 12.00 - 13.00 WIB UIR vs UMRI";
//                                System.out.println("Berhasil Memilih Jadwal");
//                                Antrian.Enqueue(nama,noKursi,jadwal2, harga);
//                                System.out.println("Data Masuk pada " + Antrian.getDate() + "\n");
//                                break;
//                            case 3:
//                                String jadwal3 = "Pukul 13.00 - 14.00 WIB Abdurrab vs UIN Suska";
//                                System.out.println("Berhasil Memilih Jadwal");
//                                Antrian.Enqueue(nama,noKursi,jadwal3, harga);
//                                System.out.println("Data Masuk pada " + Antrian.getDate());
//                                break;
//                            case 4:
//                                String jadwal4 = "Pukul 14.00 - 15.00 WIB Hangtuah vs Poltekkes";
//                                System.out.println("Berhasil Memilih Jadwal");
//                                Antrian.Enqueue(nama,noKursi,jadwal4, harga);
//                                System.out.println("Data Masuk pada " + Antrian.getDate() + "\n");
//                                break;
//                            case 5:
//                                String jadwal5 = "Pukul 15.00 - 16.00 WIB AMIK Duri vs Payung Negeri";
//                                System.out.println("Berhasil Memilih Jadwal");
//                                Antrian.Enqueue(nama,noKursi,jadwal5, harga);
//                                System.out.println("Data Masuk pada " + Antrian.getDate() + "\n");
//                                break;
//                        }
//                        System.out.println("---------------------------------------------------------------------------------");
//                        System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>> Proses Tree : Untuk No. Kursi <<<<<<<<<<<<<<<<<<<<<<<<|");
//                        Antrian.insert(noKursi, nama);
//                        System.out.println("---------------------------------------------------------------------------------\n" ) ;
//
//                        break;
//                    } else if(Antrian.isFull()== true){
//                        System.out.println("Maaf,anda tidak bisa menambahkan data karena antrian sudah penuh\n      |");
//                        break;
//                    }
//                case 4:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>> Anda Berada di Menu Keluarkan Data Pembeli Ticket dari Antrian <<< |");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    Antrian.Dequeue();
//                    break;
//                case 5:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>>>>> Anda Berada di Menu Data Pembeli Ticket <<<<<<<<<<<<<<<<<<<<");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    Antrian.printData();
//                    System.out.println("=================================================================================");
//                    System.out.println("Data Front : " +Antrian.lihatFront());
//                    System.out.println("Data Rear  : " +Antrian.lihatRear());
//                    break;
//                case 6:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>>>>>>>>> Anda Berada di Menu Data Tree <<<<<<<<<<<<<<<<<<<<<<<< |");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("Print In-Order: " );
//                    Antrian.InOrder();
//                    System.out.println("Print Post-Order: ");
//                    Antrian.PostOrder();
//                    System.out.println("Print Pre-Order:  ");
//                    Antrian.PreOrder();
//                    System.out.println("");
//
//                    int nilaiMin = Antrian.finMin();
//                    System.out.println("Nilai Mininum: " +nilaiMin);
//
//                    int nilaiMax = Antrian.finMax();
//                    System.out.println("Nilai Maximum: " +nilaiMax);
//
//                    int count = Antrian.size();
//                    System.out.println("Jumlah Node: " +count + "\n");
//
//                    System.out.println("Data Leaf: ");
//                    printleafNodes(root);
//
//                    System.out.println("Data root: ");
//                    printRootNodes(root);
//                    System.out.println("");
//                    break;
//                case 7:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>>>>>>> Anda Berada di Menu Delete Tree <<<<<<<<<<<<<<<<<<<<<<<<<|");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.print("Masukkan Data tree yang akan di Delete: ");
//
//                    int hapus = sc.nextInt();
//                    if(Antrian.delete(hapus) == true){
//                        Antrian.delete(hapus);
//                        System.out.println("Data Pembeli Ticket berhasil dihapus!");
//                    }
//                    else if(Antrian.delete(hapus) == false){
//                        System.out.println("Maaf Data Pembeli Ticket Kosong");
//                    }
//                    break;
//                case 8:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>>>>>>>>> Fitur Mengurutkan Harga Tiket  <<<<<<<<<<<<<<<<<<<<<<<<|");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    Antrian.shorting();
//
//                    break;
//                case 9:
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("|>>>>>>>>>>>>>>>>>>>>>>> Fitur Searching Harga Tiket <<<<<<<<<<<<<<<<<<<<<<<<<<<|");
//                    System.out.println("---------------------------------------------------------------------------------");
//                    System.out.println("Masukkan No Kursi pembeli ticket  Yang Di Cari");
////                    System.out.print("Hasil Pencarian : " );
//                    if (Antrian.search(sc.nextInt())){
////                        Antrian.Enqueue(Antrian.nama, Antrian.noKursi, Antrian.jadwal, Antrian.harga);
//                        System.out.println("Data ditemukan");
//
//
//                    } else {
//                        System.out.println("data tidak ditemukan");
//                    }
//
//            }
//        }
//        while (menu!=10);
//    }
}
