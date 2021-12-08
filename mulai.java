import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

    public static String[] namaKabupaten = {"Kab. Bangkalan", ""};
    public static int[] jarakKabupaten = { 36, 75, 40, 47, 38, 34, 56, 33, 38, 42, 13, 31, 26, 59, 26, 34, 36, 37, 28, 37,
      36, 41, 34, 26, 40, 44, 34, 43, 40, 14, 5, 8, 5, 10, 4, 6, 7, 17 };

    public static String[] namaTujuan1 = {"Kab. Bangkalan","Kab. Gresik","Kab. Pamekasan","Kab. Sampang","Kab. Sumenep", "Kota Surabaya"};
    public static int[] jarakTujuan1 = { 36, 34, 28, 34, 44, 17 };

    public static void tampilkanAsalNamaKabupaten() {
    byte i = 0;
    System.out.println("Asal Kabupaten/Kota");
    while (i < namaKabupaten.length) {
      System.out.println((i + 1) + ". " + namaKabupaten[i]);
      ++i;
    }
  }

  public static int jarak(int a, int b) {
    int hasil = 0;
    if (a < b) {
      for (int i = (a + 1); i <= b; i++) {
        hasil += jarakKabupaten[i];
      }
    } else if (a > b) {
      for (int i = (a - 1); i >= b; --i) {
        hasil += jarakKabupaten[i];
      }
    } else {
      hasil = jarakKabupaten[a];
    }
    return hasil;
  }

  public static void main(String[] args) {
    Scanner pb = new Scanner(System.in);

    tampilkanAsalNamaKabupaten();
    System.out.print("Masukkan asal: ");
    int asal = pb.nextInt() - 1;
    tampilkanTujuanNamaKabupaten();
    System.out.print("Masukkan tujuan: ");
    int tujuan = pb.nextInt() - 1;
    System.out.println("\n" + jarak(asal, tujuan));
    double jarak = (double) jarak(asal, tujuan);
    double total = jarak * 100;
    System.out.println("Total pembayaran" + total);
  }
}