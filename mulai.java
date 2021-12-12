package com.Math;
import java.util.Random;
import java.util.Scanner;

public class mulai {

  public static Scanner pb = new Scanner(System.in);
  public static String[] alamat = new String[2];
  public static String[] noHP = new String[2];
  public static String[] nama = new String[2];
  public static String[] jenisLayanan = { "Reguler", "Kilat", "Ekonomis", "Special Service" };
  public static int[] hargaLayanan = { 7000, 10000, 4000, 15000 };
  public static double[][] koordinat = { { 311, 93 }, { 564, 290 }, { 226, 268 }, { 159, 107 }, /** 5. */
      { 495, 225 }, { 283, 105 }, { 459, 274 }, { 229, 169 }, { 206, 214 }, /* 10. */{ 246, 95 }, { 374, 270 },
      { 131, 186 }, { 82, 190 }, { 286, 276 }, /** 15. */
      { 267, 172 }, { 181, 172 }, { 101, 151 }, { 41, 276 }, { 432, 105 }, /** 20. */
      { 320, 204 }, { 102, 232 }, { 404, 222 }, { 380, 115 }, { 312, 156 }, /** 25. */
      { 516, 197 }, { 486, 90 }, { 136, 260 }, { 197, 72 }, { 168, 255 }, /* 30. */{ 274, 214 }, { 214, 260 },
      { 191, 219 }, { 112, 186 }, { 290, 241 }, /** 35. */
      { 259, 159 }, { 334, 190 }, { 384, 210 }, { 303, 128 } };
  public static String[] jenisPacking = { "Tanpa Tambahan", "Tambah Packing Kardus", "Tambah Packing Kayu" };
  public static int[] hargaPacking = { 0, 3000, 15000 };

  public static void tampilLayanan() {
    System.out.println("\n------- Pilihan Layanan -------");
    for (int i = 0; i < jenisLayanan.length; i++) {
      System.out.println((i + 1) + ". " + jenisLayanan[i]);
    }
  }

  public static void tampilPacking() {
    System.out.println("\n------- Pilihan Packing -------");
    for (int i = 0; i < jenisPacking.length; i++) {
      System.out.println((i + 1) + ". " + jenisPacking[i]);
    }
  }

  public static void judul() {
    System.out.println("\t\t\t         SELAMAT DATANG           ");
    System.out.println("\t\t\t--------------------------------");
    System.out.println("\t\t\t   ~PAKET JAWA TIMUR SENTOSA~     ");
    System.out.println("\t\t\tSIAP MELAYANI SAMPAI GULUNG TIKAR ");
  }

  public static String[] jenisBarang = { "Elektronik/Gadget", "Farmasi/Kosmetik", "Makanan/Minuman", "Pakaian",
      "Pecah Belah" };

  public static double menghitungHargaBarangPerBerat(double berat, double jml) {
    int[] harga = { 5000, 10000, 15000 };
    double bayar = 0;
    if (berat >= 0 && berat < 5) {
      bayar = jml * berat * harga[0];

    } else if (berat >= 5 && berat < 10) {
      bayar = jml * berat * harga[1];

    } else if (berat >= 10) {
      bayar = jml * berat * harga[2];
    } else {
      System.out.println("Error");
    }
    return bayar;
  }

  public static void tampilBarang() {
    System.out.println("\n------- Informasi Barang --------");
    for (int i = 0; i < jenisBarang.length; i++) {
      System.out.println((i + 1) + ". " + jenisBarang[i]);
    }
  }

  public static void tampilinBagus() {
    System.out.println("Pilihan Kota/Kabupaten");
    System.out.println("1. Kab. Bangkalan   11. Kab. Lumajang   21. Kab. Ponorogo     31. Kota Blitar");
    System.out.println("2. Kab. Banyuwangi  12. Kab. Madiun     22. Kab. Probolinggo  32. Kota Kediri");
    System.out.println("3. Kab. Blitar      13. Kab. Magetan    23. Kab. Sampang      33. Kota Madiun");
    System.out.println("4. Kab. Bojonegoro  14. Kab. Malang     24. Kab. Sidoarjo     34. Kota Malang");
    System.out.println("5. Kab. Bondowoso   15. Kab. Mojokerto  25. Kab. Situbondo    35. Kota Mojokerto");
    System.out.println("6. Kab. Gresik      16. Kab. Nganjuk    26. Kab. Sumenep      36. Kota Pasuruan");
    System.out.println("7. Kab. Jember      17. Kab. Ngawi      27. Kab. Trenggalek   37. Kota Probolinggo");
    System.out.println("8. Kab. Jombang     18. Kab. Pacitan    28. Kab. Tuban        38. Kota Surabaya");
    System.out.println("9. Kab. Kediri      19. Kab. Pamekasan  29. Kab. Tulungagung  ");
    System.out.println("10. Kab. Lamongan   20. Kab. Pasuruan   30. Kota Batu         ");
  }

  // resi
  public static int[] resi() {
    Random acak = new Random();
    int[] kode = new int[10];
    for (int i = 0; i < kode.length; i++) {
      kode[i] = (acak.nextInt(10)); // 0-9
    }
    return kode;
  }

  public static void menampilkanOutput(int[] lacak, String[] pengirim, String[] penerima, String jenis, int berat,
    int perhitungan, String pembayaran, String Layanan) {
    System.out.println("========== Bukti Pengiriman ==========");
    System.out.print("No Resi : ");
    for (int a = 0; a < lacak.length; a++) {
      System.out.print(lacak[a]);
    }
    System.out.println("\n------------");
    System.out.println("Pengirim : ");
    for (String pengirim1 : pengirim) {
      System.out.print("\t");
      System.out.println(pengirim1);
    }
    System.out.println("Penerima : ");
    for (String penerima1 : penerima) {
      System.out.print("\t");
      System.out.println(penerima1);
    }
    System.out.println("Jenis Barang : " + jenis);
    System.out.println("Berat Barang : " + berat);
    System.out.println("Jenis Layanan : " + Layanan);
    System.out.println("Tarif : " + perhitungan);
    System.out.println("Jenis Pembayaran : " + pembayaran);
  }

  public static int inputPengirim() {
    // pengirim
    System.out.println("\n------- Pengirim -------");
    System.out.print("Nama Pengirim: ");
    nama[0] = pb.nextLine();
    System.out.print("Nomor HP Pengirim: ");
    noHP[0] = pb.nextLine();
    tampilinBagus();
    System.out.print("Masukkan Asal: ");
    int asal = pb.nextInt() - 1;
    pb.nextLine();
    System.out.print("Alamat Rinci Pengirim: ");
    alamat[0] = pb.nextLine();
    return asal;
  }

  public static int inputPenerima() {
    System.out.println("\n------- Penerima -------");
    System.out.print("Nama Penerima: ");
    nama[1] = pb.nextLine();
    System.out.print("Nomor HP Penerima: ");
    noHP[1] = pb.nextLine();
    tampilinBagus();
    System.out.print("Masukkan Tujuan: ");
    int tujuan = pb.nextInt() - 1;
    pb.nextLine();
    System.out.print("Alamat Rinci Penerima: ");
    alamat[1] = pb.nextLine();
    return tujuan;
  }

  public static double jarak(int a, int b) {
    double x = 0, y = 0, jarak = 0, hasil = 0;
    if (a == b) {
      x = koordinat[a][0];
      y = koordinat[a][1];
      jarak = Math.sqrt((x * x) + (y * y));
      hasil = jarak * 100;
    } else {
      x = koordinat[b][0] - koordinat[a][0];
      y = koordinat[b][1] - koordinat[a][1];
      jarak = Math.sqrt((x * x) + (y * y));
      hasil = jarak * 100;
    }
    return hasil;
  }

  public static void inputInformasiBarang() {
    Scanner input = new Scanner(System.in);
    System.out.print("Pilih Jenis Barang: ");
    int jenis = input.nextInt();

    input.nextLine();
    System.out.print("Nama barang: ");
    String nama = input.nextLine();
    System.out.print("Berat Barang (kg): ");
    double berat = input.nextDouble();

    System.out.print("Jumlah Barang: ");
    double jml = input.nextInt();
    input.nextLine();
    System.out.print("Tambah Catatan/Keterangan: ");
    String ket = input.nextLine();

    // bayar per berat dan jumlah
    int hargaPerBerat = (int) menghitungHargaBarangPerBerat(berat, jml);
    System.out.println("Harga Berdasarkan Berat Barang: Rp. " + menghitungHargaBarangPerBerat(berat, jml));
  }

  public static void main(String[] args) {
    // fikril_Ha
    judul();
    // bayar per jarak
    int hargaPerJarak = (int) jarak(inputPengirim(), inputPenerima());
	System.out.println("Harga Berdasarkan Jarak: Rp. " + hargaPerJarak);
    // puput
    tampilBarang();
    inputInformasiBarang();

    // laila
	Scanner sc = new Scanner(System.in);
    tampilLayanan();
    System.out.print("Masukkan Pilihan Layanan: ");
    int layanan = sc.nextInt() - 1;
    System.out.println("Harga: Rp. " + hargaLayanan[layanan]);
    tampilPacking();
    System.out.print("Masukkan Pilihan Packing: ");
    int pack = sc.nextInt() - 1;
    System.out.println("Harga: Rp. " + hargaPacking[pack]);
    System.out.println("Harga Berdasarkan Layanan dan Packing: Rp. " + (hargaLayanan[layanan] + hargaPacking[pack]));
	System.out.println("\n\t\t\t             Terima Kasih !!!             ");
    System.out.println("\t\t\tAnda Telah Menggunakan Jasa Ekspedisi Kami");
  }
}