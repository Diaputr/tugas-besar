import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  public static String[] namaProvinsi = { "Banten", "Jawa Barat", "Jakarta", "Jawa Tengah", "D.I. Yogyakarta",
      "Jawa Timur" };
  public static int[] jarakProvinsi = { 20, 30, 10, 15, 20, 5, 25 };

  public static void tampilkanAsalNamaProvinsi() {
    byte i = 0;
    System.out.println("Asal Provinsi");
    while (i < namaProvinsi.length) {
      System.out.println((i + 1) + ". " + namaProvinsi[i]);
      ++i;
    }
  }

  public static void tampilkanNamaProvinsi(int a) {
    int counter = 1;
    for (int index = 0; index < namaProvinsi.length; index++) {
      if (a == index)
        continue;
      System.out.println(counter + ". " + namaProvinsi[index]);
      counter++;
    }
  }

  public static int jarak(int a, int b) {
    int hasil = 0;
    if (a < b) {
      for (int i = (a + 1); i <= b; i++) {
        hasil += jarakProvinsi[i];
      }
    } else if (a > b) {
      for (int i = (a - 1); i >= b; --i) {
        hasil += jarakProvinsi[i];
      }
    } else {
      hasil = jarakProvinsi[b + 2];
    }
    return hasil;
  }
  // public static String[] tujuanKotaBanten1 = {"Kab. Lebak", "Kab.
  // Pandeglang","Kab. Serang","Kab. Tangerang","Kota Cilegon","Kota Serang","Kota
  // Tangerang","Kota Tangerang Selatan"};

  // public static byte tampilkanTujuanKotaBanten1() {
  // Scanner terserah = new Scanner(System.in);
  // System.out.println("Tujuan Kota");
  // for (byte i = 1; i <= tujuanKota1.length; i++) {
  // System.out.println(i + ". " + tujuanKota1[(i - 1)]);
  // }
  // System.out.println("Pilih Kota: ");
  // byte pilihKota = terserah.nextByte();
  // return pilihKota;
  // }

  // public static String[] tujuanKecamatanBanten1 = { "Kec. Banjarsari", "Kec.
  // Bayah", "Kec. Bojongmanik", "Kec. Cibadak",
  // "Kec. Cibeber", "Kec. Cigemblong", "Kec. Cihara", "Kec. Cijaku", "Kec.
  // Cikulur", "Kec. Cileles", "Kec. Cilograng",
  // "Kec. Cimarga", "Kec. Cipanas", "Kec. Cirinten", "Kec. Curugbitung", "Kec.
  // Gunungkencana", "Kec. Kalang Anyar",
  // "Kec. Lebak Gedong", "Kec. Leuwidamar", "Kec. Maja", "Kec. Malingping", "Kec.
  // Muncang", "Kec. Panggarangan",
  // "Kec. Rangkasbitung", "Kec. Sajira", "Kec. Sobang", "Kec. Wanasalam", "Kec.
  // Warunggunung" };

  // public static byte tujuanKecamatanBanten1() {
  // Scanner pab = new Scanner(System.in);
  // System.out.println("Tujuan Kecamatan");

  // }
  // public static voiod tujuanKecamatanBanten1() {
  // System.out.println("Pilih tujuan Kecamatan: ");
  // System.out.println("1. Banjarsari");
  // System.out.println("2. Bayah");
  // System.out.println("3. Bojongmanik");
  // System.out.println("4. Cibadak");

  // }

  // public static void jenisBarang() {
  // System.out.println("\n\nPilih jenis barang:");
  // System.out.println("1. Elektronik");
  // System.out.println("2. Farmasi");
  // System.out.println("3. Apparel");
  // System.out.println("4. Makanan dan Minuman");
  // System.out.println("5. Kosmetik");
  // System.out.println("6. Otomotif");
  // }

  public static void main(String[] args) {
    Scanner pb = new Scanner(System.in);

    tampilkanAsalNamaProvinsi();
    System.out.print("Masukkan asal: ");
    int asal = pb.nextInt() - 1;
    tampilkanNamaProvinsi(asal);
    System.out.print("Masukkan tujuan: ");
    int tujuan = pb.nextInt() - 1;
    System.out.println("\n" + jarak(asal, tujuan));

  }
}