import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  String[100] cities = { "Tuban", "Malang" };
  double[100][2]coordinates=
  {
    {0.0, 1.0},
    {5.0, 0.0}
  }

    public static String[] namaKabupaten = {"Kab. Bangkalan", "Kab. Banyuwangi", "Kab. Blitar", "Kab. Bojonegoro", "Kab. Bondowoso", "Kab. Gresik", "Kab. Jember", "Kab. Jombang", "Kab. Kediri", "Kab. Lamongan", "Kab. Lumajang", "Kab. Madiun", "Kab. Magetan", "Kab. Malang", "Kab. Mojokerto", "Kab. Nganjuk", "Kab. Ngawi", "Kab. Pacitan", "Kab. Pamekasan", "Kab. Pasuruan", "Kab. Ponorogo", "Kab. Probolinggo", "Kab. Sampang", "Kab. Sidoarjo", "Kab. Situbondo", "Kab. Sumenep", "Kab. Trenggalek", "Kab. Tuban", "Kab. Tulungagung", "Kota Batu", "Kota Blitar", "Kota Kediri", "Kota Madiun", "Kota Malang", "Kota Mojokerto","Kota Pasuruan", "Kota Probolinggo", "Kota Surabaya"};
    public static int[][] koordinat = { {} };

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