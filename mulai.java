import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JAWA SENTOSA~        ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  public static String[] namaProvinsi = { "Banten", "Jawa Barat", "Jakarta", "Jawa Tengah", "D.I. Yogyakarta","Jawa Timur" };

  public static byte tampilkanNamaProvinsi() {
    Scanner obj = new Scanner(System.in);
    byte i = 1;
    System.out.println("Tujuan Provinsi");
    while (i <= namaProvinsi.length) {
      System.out.println(i + ". " + namaProvinsi[(i - 1)]);
      ++i;
    }
    System.out.println("Pilih Kota: ");
    byte pilihKota = obj.nextByte();
    return pilihKota;
  }

  public static String[] tujuanKota1 = { "Kab. Lebak", "Kab. Pandeglang", "Kab. Serang", "4. Kab. Tangerang",
      "5. Kota Cilegon", "6. Kota Serang", "7. Kota Tangerang", "8. Kota Tangerang Selatan" };
  
  public static byte tampilkanTujuanKota1() {
    Scanner terserah = new Scanner(System.in);
    System.out.println("Tujuan Kota");
    for (byte i = 1; i <= tujuanKota1.length; i++) {
      
    }
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