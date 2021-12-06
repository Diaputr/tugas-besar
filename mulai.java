import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  public static String[] namaProvinsi = {"Banten","Jawa Barat","Jakarta","Jawa Tengah","D.I. Yogyakarta","Jawa Timur"};

  public static void tampilkanNamaProvinsi() {
    Scanner obj = new Scanner(System.in);
    byte i = 1;
    System.out.println("Tujuan Provinsi");
    while (i <= namaProvinsi.length) {
      System.out.println(i + ". " + namaProvinsi[(i - 1)]);
      ++i;
    }
  }

  public static String[] tujuanKotaBanten1 = {"Kab. Lebak", "Kab. Pandeglang","Kab. Serang","Kab. Tangerang","Kota Cilegon","Kota Serang","Kota Tangerang","Kota Tangerang Selatan"};

  public static byte tampilkanTujuanKotaBanten1() {
    Scanner terserah = new Scanner(System.in);
    System.out.println("Tujuan Kota");
    for (byte i = 1; i <= tujuanKota1.length; i++) {
      System.out.println(i + ". " + tujuanKota1[(i - 1)]);
    }
    System.out.println("Pilih Kota: ");
    byte pilihKota = terserah.nextByte();
    return pilihKota;
  }

  public static String[] tujuanKecamatanBanten1 = { "Kec. Banjarsari", "Kec. Bayah", "Kec. Bojongmanik", "Kec. Cibadak",
      "Kec. Cibeber", "Kec. Cigemblong", "Kec. Cihara", "Kec. Cijaku", "Kec. Cikulur", "Kec. Cileles", "Kec. Cilograng",
      "Kec. Cimarga", "Kec. Cipanas", "Kec. Cirinten", "Kec. Curugbitung", "Kec. Gunungkencana", "Kec. Kalang Anyar",
      "Kec. Lebak Gedong", "Kec. Leuwidamar", "Kec. Maja", "Kec. Malingping", "Kec. Muncang", "Kec. Panggarangan",
      "Kec. Rangkasbitung", "Kec. Sajira", "Kec. Sobang", "Kec. Wanasalam", "Kec. Warunggunung" };

  public static byte tujuanKecamatanBanten1() {
    Scanner pab = new Scanner(System.in);
    System.out.println("Tujuan Kecamatan");

  }
  public static voiod tujuanKecamatanBanten1() {
    System.out.println("Pilih tujuan Kecamatan: ");
    System.out.println("1. Banjarsari");
    System.out.println("2. Bayah");
    System.out.println("3. Bojongmanik");
    System.out.println("4. Cibadak");

  }

  public static void jenisBarang() {
    System.out.println("\n\nPilih jenis barang:");
    System.out.println("1. Elektronik");
    System.out.println("2. Farmasi");
    System.out.println("3. Apparel");
    System.out.println("4. Makanan dan Minuman");
    System.out.println("5. Kosmetik");
    System.out.println("6. Otomotif");
  }



  public static void main(String[] args) {
    Scanner pb = new Scanner(System.in);

    byte pilihanProvinsi = showNamaProvinsi();
    switch (pilihanProvinsi) {
      case 1:
        tujuanKota1();
        break;

      default:
        break;
    }
  }
}