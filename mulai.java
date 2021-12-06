import java.io.PrintStream;
import java.util.Scanner;

public class mulai {
  public static void judul() {
    System.out.println("         SELAMAT DATANG           ");
    System.out.println("----------------------------------");
    System.out.println("      ~PAKET JATIM SENTOSA~       ");
    System.out.println("SIAP MELAYANI SAMPAI GULUNG TIKAR ");
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
      Scanner scInt = new Scanner(System.in);
      judul();
      jenisBarang();
      System.out.print("Masukkan jenis barang: ");
      byte jenisBarang = scInt.nextByte();
      System.out.print("Masukan jumlah barang: ");
      byte jumlahBarang = scInt.nextByte();
      float[] berat = new float[jumlahBarang];
      for (int i = 0; i < berat.length; ++i) {
        System.out.print("Masukkan berat barang: " + "kg");
        berat[i] = scInt.nextFloat();
      }
      System.out.println("==================== Program Ekspedisi ====================");
      System.out.println("=================== Provinsi Jawa Timur ===================");
      System.out.println("Jenis Ekspedisi ");
      System.out.println("[1] -> Paket Reguler");
      System.out.println("[2] -> Paket Kilat");
      System.out.println("[3] -> Paket Kontainer");
      System.out.print("Masukkan Pilihan Anda: ");
      byte jenis = scInt.nextByte();
      int tarifPerkilo = 0;
      switch (jenis) {
        case (1):
          tarifPerkilo = 5000;
          break;
        case (2):
          tarifPerkilo = 2000;
          break;
        case (3):
          tarifPerkilo = 3000;
          break;
        default:
          System.out.println("Jenis Packaging ");
          System.out.println("[1] -> Plastik");
          System.out.println("[2] -> Kardus);
            System.out.print("Masukkan Pilihan Anda: "); int input = sc.nextInt();
          }
      }