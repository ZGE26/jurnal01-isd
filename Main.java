import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenArrayLIst<BarangATK> atk = new GenArrayLIst<>();
        GenArrayLIst<BarangBag> bag = new GenArrayLIst<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Inputan Data ke: " + (i+1));
            System.out.print("Masukan Kode Barang : ");
            String kodeBarang = s.next();
            System.out.print("Masukan Nama Barang : ");
            String namaBarang = s.next();
            System.out.print("Masukan Jenis Barang : ");
            String jenisBarang = s.next();
            System.out.print("Masukan Stok Barang : ");
            int stokBarang = s.nextInt();
            System.out.println();

            atk.addData(new BarangATK(namaBarang, kodeBarang, jenisBarang, stokBarang));
        }

        atk.displaySort();

        for (int i = 0; i < 3; i++) {
            System.out.println("Inputan Data ke: " + (i+1));
            System.out.print("Masukan Kode Barang : ");
            String kodeBarang = s.next();
            System.out.print("Masukan Nama Barang : ");
            String namaBarang = s.next();
            System.out.print("Masukan Jenis Barang : ");
            String jenisBarang = s.next();
            System.out.print("Masukan Stok Barang : ");
            int stokBarang = s.nextInt();
            System.out.println();

            BarangBag testing = new BarangBag(namaBarang, kodeBarang, jenisBarang, stokBarang);

            bag.addData(testing);
        }
        bag.addData(new BarangBag("pena", "1579", "Alat Tulis", 10));
        BarangBag bagDelet = (new BarangBag("pena", "1579", "Alat Tulis", 10));

        bag.displaySort();

        bag.removeData(bagDelet);
        bag.display();;
    }
}